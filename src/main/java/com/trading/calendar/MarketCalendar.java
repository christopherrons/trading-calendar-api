package com.trading.calendar;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(builder = MarketCalendar.Builder.class)
public interface MarketCalendar {

    String id();

    List<MarketSegmentTradingCalendar> marketSegmentTradingCalendar();

    @Value.Default
    default LocalTime getMarketStartTime(DayOfWeek dayOfWeek) {
        return marketSegmentTradingCalendar().stream()
                .map(marketSegmentTradingCalendar -> marketSegmentTradingCalendar.getTradingDay(dayOfWeek))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .sorted(Comparator.comparing(MarketSegmentTradingCalendar.TradingDay::getStartTime))
                .toList()
                .getFirst().getStartTime();
    }

    @Value.Derived
    default LocalTime getMarketEndTime(DayOfWeek dayOfWeek) {
        return marketSegmentTradingCalendar().stream()
                .map(marketSegmentTradingCalendar -> marketSegmentTradingCalendar.getTradingDay(dayOfWeek))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .sorted(Comparator.comparing(MarketSegmentTradingCalendar.TradingDay::getEndTime))
                .toList()
                .getLast().getEndTime();
    }

    class Builder extends ImmutableMarketCalendar.Builder {
    }
}
