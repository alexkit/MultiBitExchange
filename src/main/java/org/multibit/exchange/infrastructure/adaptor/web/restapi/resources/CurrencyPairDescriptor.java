package org.multibit.exchange.infrastructure.adaptor.web.restapi.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * <p>A Descriptor to provide the following to resources:</p>
 * <ul>
 * <li>The set of fields required to create a security</li>
 * </ul>
 *
 * @since 0.0.1
 *  
 */
public class CurrencyPairDescriptor {

  private final String baseCurrency;

  private final String counterCurrency;

  public CurrencyPairDescriptor(
      @JsonProperty("baseCurrency") String baseCurrency,
      @JsonProperty("counterCurrency") String counterCurrency) {

    checkArgument(!Strings.isNullOrEmpty(baseCurrency), "baseCurrency must not be null or empty: '%s'", baseCurrency);
    checkArgument(!Strings.isNullOrEmpty(counterCurrency), "counterCurrency must not be null or empty: '%s'", counterCurrency);

    this.baseCurrency = baseCurrency;
    this.counterCurrency = counterCurrency;
  }

  public String getBaseCurrency() {
    return baseCurrency;
  }

  public String getCounterCurrency() {
    return counterCurrency;
  }
}
