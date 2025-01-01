package com.trading.calendar.api;

import com.trading.calendar.MarketCalendar;
import com.trading.calendar.MarketSegmentTradingCalendar;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarketSegmentTradingCalendarTest {

    @Test
    void test_cboe_calendar() {
        var stateIntervalsEDGA = List.of(
                createStateInterval("Early Order Acceptance", LocalTime.of(6, 0, 0), LocalTime.of(7, 0, 0)),
                createStateInterval("Early Trading Session", LocalTime.of(7, 0, 0), LocalTime.of(8, 0, 0)),
                createStateInterval("Pre-Market Session", LocalTime.of(8, 0, 0), LocalTime.of(9, 30, 0)),
                createStateInterval("Regular Trading Session", LocalTime.of(9, 30, 0), LocalTime.of(16, 0, 0)),
                createStateInterval("Post Market Session", LocalTime.of(16, 0, 0), LocalTime.of(20, 0, 0))
        );
        var tradingDayEDGA = new MarketSegmentTradingCalendar.TradingDay.Builder()
                .addStateInterval()
                .daysOfWeek(Set.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY))
                .stateInterval(stateIntervalsEDGA)
                .build();

        var marketSegmentTradingCalendarEDGA = new MarketSegmentTradingCalendar.Builder()
                .zoneId(ZoneId.of("America/New_York"))
                .id("Cboe BZX, BYX and EDGA Equities Trading Hours")
                .description("Cboe BZX, BYX and EDGA Equities Trading Hours")
                .tradingDays(List.of(tradingDayEDGA))
                .build();

        assertEquals(LocalTime.of(6, 0, 0), marketSegmentTradingCalendarEDGA.getTradingDay(DayOfWeek.MONDAY).get().getStartTime());
        assertEquals(LocalTime.of(20, 0, 0), marketSegmentTradingCalendarEDGA.getTradingDay(DayOfWeek.MONDAY).get().getEndTime());

        var stateIntervalsEDGX = List.of(
                createStateInterval("Early Order Acceptance", LocalTime.of(2, 30, 0), LocalTime.of(4, 0, 0)),
                createStateInterval("Early Trading Session", LocalTime.of(4, 0, 0), LocalTime.of(8, 0, 0)),
                createStateInterval("Pre-Market Session", LocalTime.of(8, 0, 0), LocalTime.of(9, 30, 0)),
                createStateInterval("Regular Trading Session", LocalTime.of(9, 30, 0), LocalTime.of(16, 0, 0)),
                createStateInterval("Post Market Session", LocalTime.of(16, 0, 0), LocalTime.of(20, 0, 0))
        );
        var tradingDayEDGX = new MarketSegmentTradingCalendar.TradingDay.Builder()
                .addStateInterval()
                .daysOfWeek(Set.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY))
                .stateInterval(stateIntervalsEDGX)
                .build();

        var marketSegmentTradingCalendarEDGX = new MarketSegmentTradingCalendar.Builder()
                .zoneId(ZoneId.of("America/New_York"))
                .id("Cboe EDGX Equities Trading Hours")
                .description("Cboe EDGX Equities Trading Hours")
                .tradingDays(List.of(tradingDayEDGX))
                .build();

        assertEquals(LocalTime.of(2, 30, 0), marketSegmentTradingCalendarEDGX.getTradingDay(DayOfWeek.MONDAY).get().getStartTime());
        assertEquals(LocalTime.of(20, 0, 0), marketSegmentTradingCalendarEDGX.getTradingDay(DayOfWeek.MONDAY).get().getEndTime());

        var marketCalendar = new MarketCalendar.Builder()
                .id("Us Equities")
                .marketSegmentTradingCalendar(List.of(marketSegmentTradingCalendarEDGA, marketSegmentTradingCalendarEDGX))
                .build();

        assertEquals(LocalTime.of(2, 30, 0), marketCalendar.getMarketStartTime(DayOfWeek.MONDAY));
        assertEquals(LocalTime.of(20, 0, 0), marketCalendar.getMarketEndTime(DayOfWeek.MONDAY));
    }

    private static MarketSegmentTradingCalendar.TradingDay.StateInterval createStateInterval(String id, LocalTime startTime, LocalTime endTime) {
        return new MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder()
                .id(id)
                .startTime(startTime)
                .endTime(endTime)
                .build();
    }
}