package com.trading.calendar;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MarketCalendar}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new MarketCalendar.Builder()}.
 */
@Generated(from = "MarketCalendar", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableMarketCalendar implements MarketCalendar {
  private final String id;
  private final List<MarketSegmentTradingCalendar> marketSegmentTradingCalendar;

  private ImmutableMarketCalendar(
      String id,
      List<MarketSegmentTradingCalendar> marketSegmentTradingCalendar) {
    this.id = id;
    this.marketSegmentTradingCalendar = marketSegmentTradingCalendar;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code marketSegmentTradingCalendar} attribute
   */
  @JsonProperty("marketSegmentTradingCalendar")
  @Override
  public List<MarketSegmentTradingCalendar> marketSegmentTradingCalendar() {
    return marketSegmentTradingCalendar;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketCalendar#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketCalendar withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableMarketCalendar(newValue, this.marketSegmentTradingCalendar);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MarketCalendar#marketSegmentTradingCalendar() marketSegmentTradingCalendar}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketCalendar withMarketSegmentTradingCalendar(MarketSegmentTradingCalendar... elements) {
    List<MarketSegmentTradingCalendar> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMarketCalendar(this.id, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MarketCalendar#marketSegmentTradingCalendar() marketSegmentTradingCalendar}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of marketSegmentTradingCalendar elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMarketCalendar withMarketSegmentTradingCalendar(Iterable<? extends MarketSegmentTradingCalendar> elements) {
    if (this.marketSegmentTradingCalendar == elements) return this;
    List<MarketSegmentTradingCalendar> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMarketCalendar(this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMarketCalendar} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMarketCalendar
        && equalTo(0, (ImmutableMarketCalendar) another);
  }

  private boolean equalTo(int synthetic, ImmutableMarketCalendar another) {
    return id.equals(another.id)
        && marketSegmentTradingCalendar.equals(another.marketSegmentTradingCalendar);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code marketSegmentTradingCalendar}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + marketSegmentTradingCalendar.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MarketCalendar} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "MarketCalendar{"
        + "id=" + id
        + ", marketSegmentTradingCalendar=" + marketSegmentTradingCalendar
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link MarketCalendar} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MarketCalendar instance
   */
  public static ImmutableMarketCalendar copyOf(MarketCalendar instance) {
    if (instance instanceof ImmutableMarketCalendar) {
      return (ImmutableMarketCalendar) instance;
    }
    return new MarketCalendar.Builder()
        .from(instance)
        .build();
  }

  /**
   * Builds instances of type {@link ImmutableMarketCalendar ImmutableMarketCalendar}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MarketCalendar", generator = "Immutables")
  public static class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private long initBits = 0x1L;

    private String id;
    private List<MarketSegmentTradingCalendar> marketSegmentTradingCalendar = new ArrayList<MarketSegmentTradingCalendar>();

    /**
     * Creates a builder for {@link ImmutableMarketCalendar ImmutableMarketCalendar} instances.
     * <pre>
     * new MarketCalendar.Builder()
     *    .id(String) // required {@link MarketCalendar#id() id}
     *    .addMarketSegmentTradingCalendar|addAllMarketSegmentTradingCalendar(com.trading.calendar.MarketSegmentTradingCalendar) // {@link MarketCalendar#marketSegmentTradingCalendar() marketSegmentTradingCalendar} elements
     *    .build();
     * </pre>
     */
    public Builder() {
      if (!(this instanceof MarketCalendar.Builder)) {
        throw new UnsupportedOperationException("Use: new MarketCalendar.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code MarketCalendar} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketCalendar.Builder from(MarketCalendar instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      addAllMarketSegmentTradingCalendar(instance.marketSegmentTradingCalendar());
      return (MarketCalendar.Builder) this;
    }

    /**
     * Initializes the value for the {@link MarketCalendar#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final MarketCalendar.Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return (MarketCalendar.Builder) this;
    }

    /**
     * Adds one element to {@link MarketCalendar#marketSegmentTradingCalendar() marketSegmentTradingCalendar} list.
     * @param element A marketSegmentTradingCalendar element
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketCalendar.Builder addMarketSegmentTradingCalendar(MarketSegmentTradingCalendar element) {
      this.marketSegmentTradingCalendar.add(Objects.requireNonNull(element, "marketSegmentTradingCalendar element"));
      return (MarketCalendar.Builder) this;
    }

    /**
     * Adds elements to {@link MarketCalendar#marketSegmentTradingCalendar() marketSegmentTradingCalendar} list.
     * @param elements An array of marketSegmentTradingCalendar elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketCalendar.Builder addMarketSegmentTradingCalendar(MarketSegmentTradingCalendar... elements) {
      for (MarketSegmentTradingCalendar element : elements) {
        this.marketSegmentTradingCalendar.add(Objects.requireNonNull(element, "marketSegmentTradingCalendar element"));
      }
      return (MarketCalendar.Builder) this;
    }


    /**
     * Sets or replaces all elements for {@link MarketCalendar#marketSegmentTradingCalendar() marketSegmentTradingCalendar} list.
     * @param elements An iterable of marketSegmentTradingCalendar elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("marketSegmentTradingCalendar")
    public final MarketCalendar.Builder marketSegmentTradingCalendar(Iterable<? extends MarketSegmentTradingCalendar> elements) {
      this.marketSegmentTradingCalendar.clear();
      return addAllMarketSegmentTradingCalendar(elements);
    }

    /**
     * Adds elements to {@link MarketCalendar#marketSegmentTradingCalendar() marketSegmentTradingCalendar} list.
     * @param elements An iterable of marketSegmentTradingCalendar elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final MarketCalendar.Builder addAllMarketSegmentTradingCalendar(Iterable<? extends MarketSegmentTradingCalendar> elements) {
      for (MarketSegmentTradingCalendar element : elements) {
        this.marketSegmentTradingCalendar.add(Objects.requireNonNull(element, "marketSegmentTradingCalendar element"));
      }
      return (MarketCalendar.Builder) this;
    }

    /**
     * Builds a new {@link ImmutableMarketCalendar ImmutableMarketCalendar}.
     * @return An immutable instance of MarketCalendar
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMarketCalendar build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMarketCalendar(id, createUnmodifiableList(true, marketSegmentTradingCalendar));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build MarketCalendar, some of required attributes are not set " + attributes;
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
