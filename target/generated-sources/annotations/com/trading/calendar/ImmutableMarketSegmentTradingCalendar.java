package com.trading.calendar;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MarketSegmentTradingCalendar}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new MarketSegmentTradingCalendar.Builder()}.
 */
@Generated(from = "MarketSegmentTradingCalendar", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableMarketSegmentTradingCalendar
    implements MarketSegmentTradingCalendar {
  private final ZoneId zoneId;
  private final String id;
  private final String description;
  private final List<MarketSegmentTradingCalendar.TradingDay> tradingDays;

  private ImmutableMarketSegmentTradingCalendar(ImmutableMarketSegmentTradingCalendar.Builder builder) {
    this.zoneId = builder.zoneId;
    this.id = builder.id;
    this.tradingDays = createUnmodifiableList(true, builder.tradingDays);
    this.description = builder.description != null
        ? builder.description
        : Objects.requireNonNull(MarketSegmentTradingCalendar.super.getDescription(), "description");
  }

  private ImmutableMarketSegmentTradingCalendar(
      ZoneId zoneId,
      String id,
      String description,
      List<MarketSegmentTradingCalendar.TradingDay> tradingDays) {
    this.zoneId = zoneId;
    this.id = id;
    this.description = description;
    this.tradingDays = tradingDays;
  }

  /**
   * @return The value of the {@code zoneId} attribute
   */
  @JsonProperty("zoneId")
  @Override
  public ZoneId getZoneId() {
    return zoneId;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public String getDescription() {
    return description;
  }

  /**
   * @return The value of the {@code tradingDays} attribute
   */
  @JsonProperty("tradingDays")
  @Override
  public List<MarketSegmentTradingCalendar.TradingDay> getTradingDays() {
    return tradingDays;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketSegmentTradingCalendar#getZoneId() zoneId} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for zoneId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketSegmentTradingCalendar withZoneId(ZoneId value) {
    if (this.zoneId == value) return this;
    ZoneId newValue = Objects.requireNonNull(value, "zoneId");
    return new ImmutableMarketSegmentTradingCalendar(newValue, this.id, this.description, this.tradingDays);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketSegmentTradingCalendar#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketSegmentTradingCalendar withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableMarketSegmentTradingCalendar(this.zoneId, newValue, this.description, this.tradingDays);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketSegmentTradingCalendar#getDescription() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketSegmentTradingCalendar withDescription(String value) {
    String newValue = Objects.requireNonNull(value, "description");
    if (this.description.equals(newValue)) return this;
    return new ImmutableMarketSegmentTradingCalendar(this.zoneId, this.id, newValue, this.tradingDays);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MarketSegmentTradingCalendar#getTradingDays() tradingDays}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketSegmentTradingCalendar withTradingDays(MarketSegmentTradingCalendar.TradingDay... elements) {
    List<MarketSegmentTradingCalendar.TradingDay> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMarketSegmentTradingCalendar(this.zoneId, this.id, this.description, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MarketSegmentTradingCalendar#getTradingDays() tradingDays}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of tradingDays elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketSegmentTradingCalendar withTradingDays(Iterable<? extends MarketSegmentTradingCalendar.TradingDay> elements) {
    if (this.tradingDays == elements) return this;
    List<MarketSegmentTradingCalendar.TradingDay> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMarketSegmentTradingCalendar(this.zoneId, this.id, this.description, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMarketSegmentTradingCalendar} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMarketSegmentTradingCalendar
        && equalTo(0, (ImmutableMarketSegmentTradingCalendar) another);
  }

  private boolean equalTo(int synthetic, ImmutableMarketSegmentTradingCalendar another) {
    return zoneId.equals(another.zoneId)
        && id.equals(another.id)
        && description.equals(another.description)
        && tradingDays.equals(another.tradingDays);
  }

  /**
   * Computes a hash code from attributes: {@code zoneId}, {@code id}, {@code description}, {@code tradingDays}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + zoneId.hashCode();
    h += (h << 5) + id.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + tradingDays.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MarketSegmentTradingCalendar} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "MarketSegmentTradingCalendar{"
        + "zoneId=" + zoneId
        + ", id=" + id
        + ", description=" + description
        + ", tradingDays=" + tradingDays
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link MarketSegmentTradingCalendar} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MarketSegmentTradingCalendar instance
   */
  public static ImmutableMarketSegmentTradingCalendar copyOf(MarketSegmentTradingCalendar instance) {
    if (instance instanceof ImmutableMarketSegmentTradingCalendar) {
      return (ImmutableMarketSegmentTradingCalendar) instance;
    }
    return new MarketSegmentTradingCalendar.Builder()
        .from(instance)
        .build();
  }

  /**
   * Builds instances of type {@link ImmutableMarketSegmentTradingCalendar ImmutableMarketSegmentTradingCalendar}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MarketSegmentTradingCalendar", generator = "Immutables")
  public static class Builder {
    private static final long INIT_BIT_ZONE_ID = 0x1L;
    private static final long INIT_BIT_ID = 0x2L;
    private long initBits = 0x3L;

    private ZoneId zoneId;
    private String id;
    private String description;
    private List<MarketSegmentTradingCalendar.TradingDay> tradingDays = new ArrayList<MarketSegmentTradingCalendar.TradingDay>();

    /**
     * Creates a builder for {@link ImmutableMarketSegmentTradingCalendar ImmutableMarketSegmentTradingCalendar} instances.
     * <pre>
     * new MarketSegmentTradingCalendar.Builder()
     *    .zoneId(java.time.ZoneId) // required {@link MarketSegmentTradingCalendar#getZoneId() zoneId}
     *    .id(String) // required {@link MarketSegmentTradingCalendar#getId() id}
     *    .description(String) // optional {@link MarketSegmentTradingCalendar#getDescription() description}
     *    .addTradingDays|addAllTradingDays(com.trading.calendar.MarketSegmentTradingCalendar.TradingDay) // {@link MarketSegmentTradingCalendar#getTradingDays() tradingDays} elements
     *    .build();
     * </pre>
     */
    public Builder() {
      if (!(this instanceof MarketSegmentTradingCalendar.Builder)) {
        throw new UnsupportedOperationException("Use: new MarketSegmentTradingCalendar.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code MarketSegmentTradingCalendar} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.Builder from(MarketSegmentTradingCalendar instance) {
      Objects.requireNonNull(instance, "instance");
      zoneId(instance.getZoneId());
      id(instance.getId());
      description(instance.getDescription());
      addAllTradingDays(instance.getTradingDays());
      return (MarketSegmentTradingCalendar.Builder) this;
    }

    /**
     * Initializes the value for the {@link MarketSegmentTradingCalendar#getZoneId() zoneId} attribute.
     * @param zoneId The value for zoneId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("zoneId")
    public final MarketSegmentTradingCalendar.Builder zoneId(ZoneId zoneId) {
      this.zoneId = Objects.requireNonNull(zoneId, "zoneId");
      initBits &= ~INIT_BIT_ZONE_ID;
      return (MarketSegmentTradingCalendar.Builder) this;
    }

    /**
     * Initializes the value for the {@link MarketSegmentTradingCalendar#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final MarketSegmentTradingCalendar.Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return (MarketSegmentTradingCalendar.Builder) this;
    }

    /**
     * Initializes the value for the {@link MarketSegmentTradingCalendar#getDescription() description} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link MarketSegmentTradingCalendar#getDescription() description}.</em>
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final MarketSegmentTradingCalendar.Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      return (MarketSegmentTradingCalendar.Builder) this;
    }

    /**
     * Adds one element to {@link MarketSegmentTradingCalendar#getTradingDays() tradingDays} list.
     * @param element A tradingDays element
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.Builder addTradingDays(MarketSegmentTradingCalendar.TradingDay element) {
      this.tradingDays.add(Objects.requireNonNull(element, "tradingDays element"));
      return (MarketSegmentTradingCalendar.Builder) this;
    }

    /**
     * Adds elements to {@link MarketSegmentTradingCalendar#getTradingDays() tradingDays} list.
     * @param elements An array of tradingDays elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.Builder addTradingDays(MarketSegmentTradingCalendar.TradingDay... elements) {
      for (MarketSegmentTradingCalendar.TradingDay element : elements) {
        this.tradingDays.add(Objects.requireNonNull(element, "tradingDays element"));
      }
      return (MarketSegmentTradingCalendar.Builder) this;
    }


    /**
     * Sets or replaces all elements for {@link MarketSegmentTradingCalendar#getTradingDays() tradingDays} list.
     * @param elements An iterable of tradingDays elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tradingDays")
    public final MarketSegmentTradingCalendar.Builder tradingDays(Iterable<? extends MarketSegmentTradingCalendar.TradingDay> elements) {
      this.tradingDays.clear();
      return addAllTradingDays(elements);
    }

    /**
     * Adds elements to {@link MarketSegmentTradingCalendar#getTradingDays() tradingDays} list.
     * @param elements An iterable of tradingDays elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketSegmentTradingCalendar.Builder addAllTradingDays(Iterable<? extends MarketSegmentTradingCalendar.TradingDay> elements) {
      for (MarketSegmentTradingCalendar.TradingDay element : elements) {
        this.tradingDays.add(Objects.requireNonNull(element, "tradingDays element"));
      }
      return (MarketSegmentTradingCalendar.Builder) this;
    }

    /**
     * Builds a new {@link ImmutableMarketSegmentTradingCalendar ImmutableMarketSegmentTradingCalendar}.
     * @return An immutable instance of MarketSegmentTradingCalendar
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMarketSegmentTradingCalendar build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMarketSegmentTradingCalendar(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ZONE_ID) != 0) attributes.add("zoneId");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build MarketSegmentTradingCalendar, some of required attributes are not set " + attributes;
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
}
