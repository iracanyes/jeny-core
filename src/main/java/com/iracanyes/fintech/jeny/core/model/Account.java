package com.iracanyes.fintech.jeny.core.model;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
/**
 *
 * @param <T> Type of the accountId parameter
 */
public class Account<T> {
  /**
   * Account ID
   */
  private final T accountId;

  /**
   * Base currency
   */
  private final String currency;

  /**
   * Total amount of assets
   */
  private final double totalBalance;

  /**
   * Unrealised Profit and losses
   */
  private final double unrealisedPnl;

  /**
   * Realised Profit and losses
   */
  private final double realisedPnl;

  /**
   * Total net assets value
   */
  private final double netAssetValue;

  /**
   * Amount available to trade divided by total amount
   */
  private final double amountAvailableRatio;

  /**
   *
   */
  private final double marginUsed;

  /**
   * Margin available for this account
   */
  private final double marginAvailable;

  private final double marginRate;

  /**
   * Number of open trades for this account
   */
  private final long openTrades;


  @Override
  public String toString(){
    return String.format(
      "Account<%s>[" +
        "currencty=%s, " +
        "netAssetValue=%5.2f, " +
        "totalBalance=%5.2f, " +
        "unrealisedPnL=%5.2f, " +
        "realisedPnL=%5.2f, " +
        "openTrades=%d, " +
        "amountAvailableRatio=%1.5f, " +
        "marginUsed=%5.2f, " +
        "marginAvailable=%5.2f, " +
        "marginRate=%1.2f]",
      accountId,
      currency,
      netAssetValue,
      totalBalance,
      unrealisedPnl,
      realisedPnl,
      openTrades,
      amountAvailableRatio,
      marginUsed,
      marginAvailable,
      marginRate
    );

  }




}
