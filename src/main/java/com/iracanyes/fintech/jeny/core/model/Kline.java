/*
*
*
* */
package com.iracanyes.fintech.jeny.core.model;

import java.util.Objects;

/**
 * Kline/Candlesticks that represent market activities during an interval of time
 */
public class Kline{
  private final Long openTime;
  private final Double openPrice;
  private final Double highPrice;
  private final Double lowPrice;
  private final Double closePrice;
  private final Double volume;
  private final Long closeTime;
  private final Double quoteVolume;
  private final Long numberOfTrades;
  private final Double takerBuyBaseAssetVolume;
  private final Double takerBuyQuoteAssetVolume;
  private final Long unusedYield;

  public Kline(
    long openTime,
    double openPrice,
    double highPrice,
    double lowPrice,
    double closePrice,
    double volume,
    long closeTime,
    double quoteVolume,
    long numberOfTrades,
    double takerBuyBaseAssetVolume,
    double takerBuyQuoteAssetVolume,
    long unusedYield
  ) {
    this.openTime = openTime;
    this.openPrice = openPrice;
    this.highPrice = highPrice;
    this.lowPrice = lowPrice;
    this.closePrice = closePrice;
    this.volume = volume;
    this.closeTime = closeTime;
    this.quoteVolume = quoteVolume;
    this.numberOfTrades = numberOfTrades;
    this.takerBuyBaseAssetVolume = takerBuyBaseAssetVolume;
    this.takerBuyQuoteAssetVolume = takerBuyQuoteAssetVolume;
    this.unusedYield = unusedYield;
  }


  public Long getOpenTime() {
    return openTime;
  }

  public Double getOpenPrice() {
    return openPrice;
  }

  public Double getHighPrice() {
    return highPrice;
  }

  public Double getLowPrice() {
    return lowPrice;
  }

  public Double getClosePrice() {
    return closePrice;
  }

  public Double getVolume() {
    return volume;
  }

  public Long getCloseTime() {
    return closeTime;
  }

  public Double getQuoteVolume() {
    return quoteVolume;
  }

  public Long getNumberOfTrades() {
    return numberOfTrades;
  }

  public Double getTakerBuyBaseAssetVolume() {
    return takerBuyBaseAssetVolume;
  }

  public Double getTakerBuyQuoteAssetVolume() {
    return takerBuyQuoteAssetVolume;
  }

  public Long getUnusedYield() {
    return unusedYield;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Kline kline)) return false;
    return getNumberOfTrades() == kline.getNumberOfTrades() && getOpenTime().equals(kline.getOpenTime()) && getOpenPrice().equals(kline.getOpenPrice()) && getHighPrice().equals(kline.getHighPrice()) && getLowPrice().equals(kline.getLowPrice()) && getClosePrice().equals(kline.getClosePrice()) && getVolume().equals(kline.getVolume()) && getCloseTime().equals(kline.getCloseTime()) && getQuoteVolume().equals(kline.getQuoteVolume()) && getTakerBuyBaseAssetVolume().equals(kline.getTakerBuyBaseAssetVolume()) && getTakerBuyQuoteAssetVolume().equals(kline.getTakerBuyQuoteAssetVolume()) && getUnusedYield().equals(kline.getUnusedYield());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getOpenTime(), getOpenPrice(), getHighPrice(), getLowPrice(), getClosePrice(), getVolume(), getCloseTime(), getQuoteVolume(), getNumberOfTrades(), getTakerBuyBaseAssetVolume(), getTakerBuyQuoteAssetVolume(), getUnusedYield());
  }

  @Override
  public String toString() {
    return "Kline{" +
      "openTime=" + openTime +
      ", openPrice=" + openPrice +
      ", highPrice=" + highPrice +
      ", lowPrice=" + lowPrice +
      ", closePrice=" + closePrice +
      ", volume=" + volume +
      ", closeTime=" + closeTime +
      ", quoteVolume=" + quoteVolume +
      ", numberOfTrades=" + numberOfTrades +
      ", takerBuyBaseAssetVolume=" + takerBuyBaseAssetVolume +
      ", takerBuyQuoteAssetVolume=" + takerBuyQuoteAssetVolume +
      ", unusedYield=" + unusedYield +
      '}';
  }
}
