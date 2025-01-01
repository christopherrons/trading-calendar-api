package com.trading.calendar;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.time.*;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Value.Immutable
@JsonDeserialize(builder = MarketSegmentTradingCalendar.Builder.class)
public interface MarketSegmentTradingCalendar {

    ZoneId getZoneId();

    String getId();

    @Value.Default
    default String getDescription() {
        return getId();
    }

    List<TradingDay> getTradingDays();

    default Optional<TradingDay> getTradingDay(DayOfWeek dayOfWeek) {
        return getTradingDays().stream()
                .filter(tradingDay -> tradingDay.isWithin(dayOfWeek))
                .findFirst();
    }

    default Optional<TradingDay> getTradingDay(Instant timeStamp) {
        var zonedDateTime = ZonedDateTime.ofInstant(timeStamp, getZoneId());
        return getTradingDays().stream()
                .filter(tradingDay -> tradingDay.isWithin(zonedDateTime))
                .findFirst();
    }

    default Optional<TradingDay.StateInterval> getStateInterval(Instant timeStamp) {
        var zonedDateTime = ZonedDateTime.ofInstant(timeStamp, getZoneId());
        return getTradingDays().stream()
                .filter(tradingDay -> tradingDay.isWithin(zonedDateTime))
                .findFirst()
                .flatMap(tradingDay -> tradingDay.getStateInterval().stream()
                        .filter(stateInterval -> stateInterval.isWithin(zonedDateTime.toLocalTime()))
                        .findFirst()
                );
    }

    @Value.Immutable
    @JsonDeserialize(builder = TradingDay.Builder.class)
    interface TradingDay {

        Set<DayOfWeek> getDaysOfWeek();

        List<StateInterval> getStateInterval();

        @Value.Derived
        default LocalTime getStartTime() {
            return getStateInterval().stream().sorted(Comparator.comparing(StateInterval::getStartTime)).toList().getFirst().getStartTime();
        }

        @Value.Derived
        default LocalTime getEndTime() {
            return getStateInterval().stream().sorted(Comparator.comparing(StateInterval::getStartTime)).toList().getLast().getEndTime();
        }

        default boolean isWithin(ZonedDateTime zonedDateTime) {
            if (!getDaysOfWeek().contains(zonedDateTime.getDayOfWeek())) {
                return false;
            }
            var localTime = zonedDateTime.toLocalTime();
            return !localTime.isBefore(getStartTime()) && !localTime.isAfter(getEndTime());
        }

        default boolean isWithin(DayOfWeek dayOfWeek) {
            return getDaysOfWeek().contains(dayOfWeek);
        }


        @Value.Immutable
        @JsonDeserialize(builder = StateInterval.Builder.class)
        interface StateInterval {
            String getId();

            LocalTime getStartTime();

            LocalTime getEndTime();

            default boolean isWithin(LocalTime localTime) {
                return !localTime.isBefore(getStartTime()) && !localTime.isAfter(getEndTime());
            }

            class Builder extends ImmutableStateInterval.Builder {
            }

            @Value.Check
            default void check() {
                if (getStartTime().isAfter(getEndTime())) {
                    throw new IllegalArgumentException(String.format("Start time %s after end time %s", getStartTime(), getEndTime()));
                }
            }
        }

        class Builder extends ImmutableTradingDay.Builder {
        }
    }

    class Builder extends ImmutableMarketSegmentTradingCalendar.Builder {
    }
}

