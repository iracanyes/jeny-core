package com.iracanyes.fintech.jeny.core.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @param <T> Type of the accountId parameter
 */
@Document("account")
@Data
@Getter
@Builder
@NoArgsConstructor(force = true)
//@RequiredArgsConstructor
public class Account<T> {
  @Id
  private final ObjectId _id;
  /**
   * Account ID
   */
  private final T accountId;

  /**
   * Base currency
   */
  @Setter
  private String currency;

  /**
   * Total amount of assets
   */
  @Setter
  private double totalBalance;

  /**
   * Unrealised Profit and losses
   */
  @Setter
  private double unrealisedPnl;

  /**
   * Realised Profit and losses
   */
  @Setter
  private double realisedPnl;

  /**
   * Total net assets value
   */
  @Setter
  private double netAssetValue;

  /**
   * Amount available to trade divided by total amount
   */
  @Setter
  private double amountAvailableRatio;

  /**
   *
   */
  @Setter
  private double marginUsed;

  /**
   * Margin available for this account
   */
  @Setter
  private double marginAvailable;

  @Setter
  private double marginRate;

  /**
   * Number of open trades for this account
   */
  @Setter
  private long openTrades;

  public Account(ObjectId id, T accountId){
    this._id = id;
    this.accountId = accountId;
    this.currency = "USD";
    this.netAssetValue = 0;
    this.totalBalance = 0;
    this.unrealisedPnl = 0;
    this.realisedPnl = 0;
    this.amountAvailableRatio = 0;
    this.marginUsed = 0;
    this.marginAvailable = 0;
    this.marginRate = 0;
    this.openTrades = 0;
  }

  /**
   * REMARQUE: Les paramètres du constructeur doivent être déclarée dans l'ordre de leur définition
   * @param accountId     Account ID
   * @param currency      Currency used
   * @param netAssetValue Net asset value
   * @param totalBalance  Total Balance of the account
   * @param unrealisedPnl Unrealized Profit and Loss
   * @param realisedPnl   Realized Profit and Loss
   * @param amountAvailableRatio  Amount available ratio
   * @param marginUsed            Margin used
   * @param marginAvailable       Margin available
   * @param marginRate            Margin rate
   * @param openTrades            Number of open trades
   */
  public Account(
      ObjectId id,
      T accountId,
      String currency,
      double netAssetValue,
      double totalBalance,
      double unrealisedPnl,
      double realisedPnl,
      double amountAvailableRatio,
      double marginUsed,
      double marginAvailable,
      double marginRate,
      long openTrades
  ){
    this._id = id;
    this.accountId = accountId;
    this.currency = currency;
    this.netAssetValue = netAssetValue;
    this.totalBalance = totalBalance;
    this.unrealisedPnl = unrealisedPnl;
    this.realisedPnl = realisedPnl;
    this.openTrades = openTrades;
    this.amountAvailableRatio = amountAvailableRatio;
    this.marginUsed = marginUsed;
    this.marginAvailable = marginAvailable;
    this.marginRate = marginRate;
  }

  @Override
  public String toString(){
    return String.format(
      "Account<%s>{" +
        "currency: %s, " +
        "netAssetValue: %5.2f, " +
        "totalBalance: %5.2f, " +
        "unrealisedPnL: %5.2f, " +
        "realisedPnL: %5.2f, " +
        "openTrades: %d, " +
        "amountAvailableRatio: %1.5f, " +
        "marginUsed: %5.2f, " +
        "marginAvailable: %5.2f, " +
        "marginRate: %1.2f}",
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
