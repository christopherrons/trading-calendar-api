package com.trading.calendar;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MarketSegmentTradingCalendar.TradingDay.StateInterval}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder()}.
 */
@Generated(from = "MarketSegmentTradingCalendar.TradingDay.StateInterval", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableStateInterval
    implements MarketSegmentTradingCalendar.TradingDay.StateInterval {
  private final String id;
  private final LocalTime startTime;
  private final LocalTime endTime;

  private ImmutableStateInterval(String id, LocalTime startTime, LocalTime endTime) {
    this.id = id;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String getId() {
    return id;
  }

  /**
   * @return The value of the {@code startTime} attribute
   */
  @JsonProperty("startTime")
  @Override
  public LocalTime getStartTime() {
    return startTime;
  }

  /**
   * @return The value of the {@code endTime} attribute
   */
  @JsonProperty("endTime")
  @Override
  public LocalTime getEndTime() {
    return endTime;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStateInterval withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return validate(new ImmutableStateInterval(newValue, this.startTime, this.endTime));
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getStartTime() startTime} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for startTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStateInterval withStartTime(LocalTime value) {
    if (this.startTime == value) return this;
    LocalTime newValue = Objects.requireNonNull(value, "startTime");
    return validate(new ImmutableStateInterval(this.id, newValue, this.endTime));
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getEndTime() endTime} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for endTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStateInterval withEndTime(LocalTime value) {
    if (this.endTime == value) return this;
    LocalTime newValue = Objects.requireNonNull(value, "endTime");
    return validate(new ImmutableStateInterval(this.id, this.startTime, newValue));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStateInterval} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStateInterval
        && equalTo(0, (ImmutableStateInterval) another);
  }

  private boolean equalTo(int synthetic, ImmutableStateInterval another) {
    return id.equals(another.id)
        && startTime.equals(another.startTime)
        && endTime.equals(another.endTime);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code startTime}, {@code endTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + startTime.hashCode();
    h += (h << 5) + endTime.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code StateInterval} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "StateInterval{"
        + "id=" + id
        + ", startTime=" + startTime
        + ", endTime=" + endTime
        + "}";
  }

  private static ImmutableStateInterval validate(ImmutableStateInterval instance) {
    instance.check();
    return instance;
  }

  /**
   * Creates an immutable copy of a {@link MarketSegmentTradingCalendar.TradingDay.StateInterval} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StateInterval instance
   */
  public static ImmutableStateInterval copyOf(MarketSegmentTradingCalendar.TradingDay.StateInterval instance) {
    if (instance instanceof ImmutableStateInterval) {
      return (ImmutableStateInterval) instance;
    }
    return new MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder()
        .from(instance)
        .build();
  }

  /**
   * Builds instances of type {@link ImmutableStateInterval ImmutableStateInterval}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MarketSegmentTradingCalendar.TradingDay.StateInterval", generator = "Immutables")
  public static class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_START_TIME = 0x2L;
    private static final long INIT_BIT_END_TIME = 0x4L;
    private long initBits = 0x7L;

    private String id;
    private LocalTime startTime;
    private LocalTime endTime;

    /**
     * Creates a builder for {@link ImmutableStateInterval ImmutableStateInterval} instances.
     * <pre>
     * new MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder()
     *    .id(String) // required {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getId() id}
     *    .startTime(java.time.LocalTime) // required {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getStartTime() startTime}
     *    .endTime(java.time.LocalTime) // required {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getEndTime() endTime}
     *    .build();
     * </pre>
     */
    public Builder() {
      if (!(this instanceof MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder)) {
        throw new UnsupportedOperationException("Use: new MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code StateInterval} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder from(MarketSegmentTradingCalendar.TradingDay.StateInterval instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      startTime(instance.getStartTime());
      endTime(instance.getEndTime());
      return (MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder) this;
    }

    /**
     * Initializes the value for the {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return (MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder) this;
    }

    /**
     * Initializes the value for the {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getStartTime() startTime} attribute.
     * @param startTime The value for startTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("startTime")
    public final MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder startTime(LocalTime startTime) {
      this.startTime = Objects.requireNonNull(startTime, "startTime");
      initBits &= ~INIT_BIT_START_TIME;
      return (MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder) this;
    }

    /**
     * Initializes the value for the {@link MarketSegmentTradingCalendar.TradingDay.StateInterval#getEndTime() endTime} attribute.
     * @param endTime The value for endTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endTime")
    public final MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder endTime(LocalTime endTime) {
      this.endTime = Objects.requireNonNull(endTime, "endTime");
      initBits &= ~INIT_BIT_END_TIME;
      return (MarketSegmentTradingCalendar.TradingDay.StateInterval.Builder) this;
    }

    /**
     * Builds a new {@link ImmutableStateInterval ImmutableStateInterval}.
     * @return An immutable instance of StateInterval
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableStateInterval build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return ImmutableStateInterval.validate(new ImmutableStateInterval(id, startTime, endTime));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_START_TIME) != 0) attributes.add("startTime");
      if ((initBits & INIT_BIT_END_TIME) != 0) attributes.add("endTime");
      return "Cannot build StateInterval, some of required attributes are not set " + attributes;
    }
  }
}
