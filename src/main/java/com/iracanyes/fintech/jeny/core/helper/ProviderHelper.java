/**
 * Description:
 * Platforms have different notations for representing
 * - currency pair (Ex: GBPUSD, GBP_USD, ...),
 * - trade action name : Short (selling) or Long (buying), etc.
 * The interface provides methods for address those issues.
 * When consuming data from external sources (Twitter & sites),
 * each source has its own way of denoting a currency pair or trades(short/long).
 * The interface allow to convert those notation into the platform specific ones.
 */
package com.iracanyes.fintech.jeny.core.helper;

/**
 *
 * @param <T> The type of notation (Long/Short)
 */
public interface ProviderHelper <T>{
  /**
   * @param instrument In ISO standard. Ex: GBPUSD
   * @return currency pair denoted in the platform specific format
   */
  String fromISOFormat(String instrument);

  /**
   * @param instrument in platform specific format such as GBP_USD
   * @return currency pair denoted in ISO format
   */
  String toISOFormat(String instrument);

  /**
   * @param instrument In a 7 characters format with arbitrary separator
   * @return  currency pair denoted in the platform specific format
   */
  String fromPairWithSeparatorFormat(String instrument);

  /**
   * For converting Twitter Currency Hashtag to platform specific format
   *
   * @param instrument In an hashtag format, ex: #GBPUSD
   * @return currency pair denoted in the platform specific format
   */
  String fromHashtagCurrencyFormat(String instrument);

  /**
   * @return T Which denotes the action of buying the currency pair on the platform
   */
  T getLongNotation();

  /**
   * @return T Which denotes the action of selling the currency pair on the platform
   */
  T getShortNotation();

}
