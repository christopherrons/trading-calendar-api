package com.trading.calendar;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MarketSegmentTradingCalendar.TradingDay}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new MarketSegmentTradingCalendar.TradingDay.Builder()}.
 */
@Generated(from = "MarketSegmentTradingCalendar.TradingDay", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableTradingDay implements MarketSegmentTradingCalendar.TradingDay {
  private final Set<DayOfWeek> daysOfWeek;
  private final List<MarketSegmentTradingCalendar.TradingDay.StateInterval> stateInterval;
  private transient final LocalTime startTime;
  private transient final LocalTime endTime;

  private ImmutableTradingDay(
      Set<DayOfWeek> daysOfWeek,
      List<MarketSegmentTradingCalendar.TradingDay.StateInterval> stateInterval) {
    this.daysOfWeek = daysOfWeek;
    this.stateInterval = stateInterval;
    this.startTime = initShim.getStartTime();
    this.endTime = initShim.getEndTime();
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "MarketSegmentTradingCalendar.TradingDay", generator = "Immutables")
  private final class InitShim {
    private byte startTimeBuildStage = STAGE_UNINITIALIZED;
    private LocalTime startTime;

    LocalTime getStartTime() {
      if (startTimeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (startTimeBuildStage == STAGE_UNINITIALIZED) {
        startTimeBuildStage = STAGE_INITIALIZING;
        this.startTime = Objects.requireNonNull(getStartTimeInitialize(), "startTime");
        startTimeBuildStage = STAGE_INITIALIZED;
      }
      return this.startTime;
    }

    private byte endTimeBuildStage = STAGE_UNINITIALIZED;
    private LocalTime endTime;

    LocalTime getEndTime() {
      if (endTimeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (endTimeBuildStage == STAGE_UNINITIALIZED) {
        endTimeBuildStage = STAGE_INITIALIZING;
        this.endTime = Objects.requireNonNull(getEndTimeInitialize(), "endTime");
        endTimeBuildStage = STAGE_INITIALIZED;
      }
      return this.endTime;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (startTimeBuildStage == STAGE_INITIALIZING) attributes.add("startTime");
      if (endTimeBuildStage == STAGE_INITIALIZING) attributes.add("endTime");
      return "Cannot build TradingDay, attribute initializers form cycle " + attributes;
    }
  }

  private LocalTime getStartTimeInitialize() {
    return MarketSegmentTradingCalendar.TradingDay.super.getStartTime();
  }

  private LocalTime getEndTimeInitialize() {
    return MarketSegmentTradingCalendar.TradingDay.super.getEndTime();
  }

  /**
   * @return The value of the {@code daysOfWeek} attribute
   */
  @JsonProperty("daysOfWeek")
  @Override
  public Set<DayOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * @return The value of the {@code stateInterval} attribute
   */
  @JsonProperty("stateInterval")
  @Override
  public List<MarketSegmentTradingCalendar.TradingDay.StateInterval> getStateInterval() {
    return stateInterval;
  }

  /**
   * @return The computed-at-construction value of the {@code startTime} attribute
   */
  @JsonProperty("startTime")
  @Override
  public LocalTime getStartTime() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getStartTime()
        : this.startTime;
  }

  /**
   * @return The computed-at-construction value of the {@code endTime} attribute
   */
  @JsonProperty("endTime")
  @Override
  public LocalTime getEndTime() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getEndTime()
        : this.endTime;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MarketSegmentTradingCalendar.TradingDay#getDaysOfWeek() daysOfWeek}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTradingDay withDaysOfWeek(DayOfWeek... elements) {
    Set<DayOfWeek> newValue = createUnmodifiableEnumSet(Arrays.asList(elements));
    return new ImmutableTradingDay(newValue, this.stateInterval);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MarketSegmentTradingCalendar.TradingDay#getDaysOfWeek() daysOfWeek}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of daysOfWeek elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTradingDay withDaysOfWeek(Iterable<DayOfWeek> elements) {
    if (this.daysOfWeek == elements) return this;
    Set<DayOfWeek> newValue = createUnmodifiableEnumSet(elements);
    return new ImmutableTradingDay(newValue, this.stateInterval);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MarketSegmentTradingCalendar.TradingDay#getStateInterval() stateInterval}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTradingDay withStateInterval(MarketSegmentTradingCalendar.TradingDay.StateInterval... elements) {
    List<MarketSegmentTradingCalendar.TradingDay.StateInterval> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTradingDay(this.daysOfWeek, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MarketSegmentTradingCalendar.TradingDay#getStateInterval() stateInterval}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of stateInterval elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTradingDay withStateInterval(Iterable<? extends MarketSegmentTradingCalendar.TradingDay.StateInterval> elements) {
    if (this.stateInterval == elements) return this;
    List<MarketSegmentTradingCalendar.TradingDay.StateInterval> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableTradingDay(this.daysOfWeek, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTradingDay} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTradingDay
        && equalTo(0, (ImmutableTradingDay) another);
  }

  private boolean equalTo(int synthetic, ImmutableTradingDay another) {
    return daysOfWeek.equals(another.daysOfWeek)
        && stateInterval.equals(another.stateInterval)
        && startTime.equals(another.startTime)
        && endTime.equals(another.endTime);
  }

  /**
   * Computes a hash code from attributes: {@code daysOfWeek}, {@code stateInterval}, {@code startTime}, {@code endTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + daysOfWeek.hashCode();
    h += (h << 5) + stateInterval.hashCode();
    h += (h << 5) + startTime.hashCode();
    h += (h << 5) + endTime.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TradingDay} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "TradingDay{"
        + "daysOfWeek=" + daysOfWeek
        + ", stateInterval=" + stateInterval
        + ", startTime=" + startTime
        + ", endTime=" + endTime
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link MarketSegmentTradingCalendar.TradingDay} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TradingDay instance
   */
  public static ImmutableTradingDay copyOf(MarketSegmentTradingCalendar.TradingDay instance) {
    if (instance instanceof ImmutableTradingDay) {
      return (ImmutableTradingDay) instance;
    }
    return new MarketSegmentTradingCalendar.TradingDay.Builder()
        .from(instance)
        .build();
  }

  /**
   * Builds instances of type {@link ImmutableTradingDay ImmutableTradingDay}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MarketSegmentTradingCalendar.TradingDay", generator = "Immutables")
  public static class Builder {
    private EnumSet<DayOfWeek> daysOfWeek = EnumSet.noneOf(DayOfWeek.class);
    private List<MarketSegmentTradingCalendar.TradingDay.StateInterval> stateInterval = new ArrayList<MarketSegmentTradingCalendar.TradingDay.StateInterval>();

    /**
     * Creates a builder for {@link ImmutableTradingDay ImmutableTradingDay} instances.
     * <pre>
     * new MarketSegmentTradingCalendar.TradingDay.Builder()
     *    .addDaysOfWeek|addAllDaysOfWeek(java.time.DayOfWeek) // {@link MarketSegmentTradingCalendar.TradingDay#getDaysOfWeek() daysOfWeek} elements
     *    .addStateInterval|addAllStateInterval(com.trading.calendar.MarketSegmentTradingCalendar.TradingDay.StateInterval) // {@link MarketSegmentTradingCalendar.TradingDay#getStateInterval() stateInterval} elements
     *    .build();
     * </pre>
     */
    public Builder() {
      if (!(this instanceof MarketSegmentTradingCalendar.TradingDay.Builder)) {
        throw new UnsupportedOperationException("Use: new MarketSegmentTradingCalendar.TradingDay.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code TradingDay} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.TradingDay.Builder from(MarketSegmentTradingCalendar.TradingDay instance) {
      Objects.requireNonNull(instance, "instance");
      addAllDaysOfWeek(instance.getDaysOfWeek());
      addAllStateInterval(instance.getStateInterval());
      return (MarketSegmentTradingCalendar.TradingDay.Builder) this;
    }

    /**
     * Adds one element to {@link MarketSegmentTradingCalendar.TradingDay#getDaysOfWeek() daysOfWeek} set.
     * @param element A daysOfWeek element
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.TradingDay.Builder addDaysOfWeek(DayOfWeek element) {
      this.daysOfWeek.add(Objects.requireNonNull(element, "daysOfWeek element"));
      return (MarketSegmentTradingCalendar.TradingDay.Builder) this;
    }

    /**
     * Adds elements to {@link MarketSegmentTradingCalendar.TradingDay#getDaysOfWeek() daysOfWeek} set.
     * @param elements An array of daysOfWeek elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.TradingDay.Builder addDaysOfWeek(DayOfWeek... elements) {
      for (DayOfWeek element : elements) {
        this.daysOfWeek.add(Objects.requireNonNull(element, "daysOfWeek element"));
      }
      return (MarketSegmentTradingCalendar.TradingDay.Builder) this;
    }


    /**
     * Sets or replaces all elements for {@link MarketSegmentTradingCalendar.TradingDay#getDaysOfWeek() daysOfWeek} set.
     * @param elements An iterable of daysOfWeek elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("daysOfWeek")
    public final MarketSegmentTradingCalendar.TradingDay.Builder daysOfWeek(Iterable<DayOfWeek> elements) {
      this.daysOfWeek.clear();
      return addAllDaysOfWeek(elements);
    }

    /**
     * Adds elements to {@link MarketSegmentTradingCalendar.TradingDay#getDaysOfWeek() daysOfWeek} set.
     * @param elements An iterable of daysOfWeek elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.TradingDay.Builder addAllDaysOfWeek(Iterable<DayOfWeek> elements) {
      for (DayOfWeek element : elements) {
        this.daysOfWeek.add(Objects.requireNonNull(element, "daysOfWeek element"));
      }
      return (MarketSegmentTradingCalendar.TradingDay.Builder) this;
    }

    /**
     * Adds one element to {@link MarketSegmentTradingCalendar.TradingDay#getStateInterval() stateInterval} list.
     * @param element A stateInterval element
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.TradingDay.Builder addStateInterval(MarketSegmentTradingCalendar.TradingDay.StateInterval element) {
      this.stateInterval.add(Objects.requireNonNull(element, "stateInterval element"));
      return (MarketSegmentTradingCalendar.TradingDay.Builder) this;
    }

    /**
     * Adds elements to {@link MarketSegmentTradingCalendar.TradingDay#getStateInterval() stateInterval} list.
     * @param elements An array of stateInterval elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.TradingDay.Builder addStateInterval(MarketSegmentTradingCalendar.TradingDay.StateInterval... elements) {
      for (MarketSegmentTradingCalendar.TradingDay.StateInterval element : elements) {
        this.stateInterval.add(Objects.requireNonNull(element, "stateInterval element"));
      }
      return (MarketSegmentTradingCalendar.TradingDay.Builder) this;
    }


    /**
     * Sets or replaces all elements for {@link MarketSegmentTradingCalendar.TradingDay#getStateInterval() stateInterval} list.
     * @param elements An iterable of stateInterval elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("stateInterval")
    public final MarketSegmentTradingCalendar.TradingDay.Builder stateInterval(Iterable<? extends MarketSegmentTradingCalendar.TradingDay.StateInterval> elements) {
      this.stateInterval.clear();
      return addAllStateInterval(elements);
    }

    /**
     * Adds elements to {@link MarketSegmentTradingCalendar.TradingDay#getStateInterval() stateInterval} list.
     * @param elements An iterable of stateInterval elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.TradingDay.Builder addAllStateInterval(Iterable<? extends MarketSegmentTradingCalendar.TradingDay.StateInterval> elements) {
      for (MarketSegmentTradingCalendar.TradingDay.StateInterval element : elements) {
        this.stateInterval.add(Objects.requireNonNull(element, "stateInterval element"));
      }
      return (MarketSegmentTradingCalendar.TradingDay.Builder) this;
    }

    /**
     * Builds a new {@link ImmutableTradingDay ImmutableTradingDay}.
     * @return An immutable instance of TradingDay
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTradingDay build() {
      return new ImmutableTradingDay(createUnmodifiableEnumSet(daysOfWeek), createUnmodifiableList(true, stateInterval));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static <T extends Enum<T>> Set<T> createUnmodifiableEnumSet(Iterable<T> iterable) {
    if (iterable instanceof EnumSet<?>) {
      return Collections.unmodifiableSet(EnumSet.copyOf((EnumSet<T>) iterable));
    }
    List<T> list = createSafeList(iterable, true, false);
    switch(list.size()) {
    case 0: return Collections.emptySet();
    case 1: return Collections.singleton(list.get(0));
    default: return Collections.unmodifiableSet(EnumSet.copyOf(list));
    }
  }
}
