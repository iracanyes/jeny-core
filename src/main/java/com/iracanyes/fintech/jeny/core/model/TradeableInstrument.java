/**
 * Description:
 * Tradeable instrument
 * the smallest move a currency can make. Pips are used by investors to calculate the spread between the purchase price and the selling price of a currency pair, and to express the value of the gain or loss of their position
 */
package com.iracanyes.fintech.jeny.core.model;

//import com.google.common.hash.Hashing;
//import com.google.common.hash.HashFunction;

/**
 *
 * @param <T> Type of id (ID of the tradeable instrument)
 */
public class TradeableInstrument < T >{

  private T id;

  private String name;

  private String description;

  /**
   * Point in percentage, is the smallest move a currency can make.
   * Pips are used by investors to calculate the spread between the purchase price and the selling price of a currency pair,
   * and to express the value of the gain or loss of their positiont
   */
  private double pip;

  private final int hash;

  /**
   *
   */
  private InstrumentPairInterestRate istrumentPairInterestRate;

  TradeableInstrument(String name, String description){
    this.name = name;
    this.description = description;
    this.hash = 0;
    //this.hash = setHashCode();
  }

  /*
  private int setHashCode(){
    HashFunction hf = Hashing.md5();
    HashCode hc = hf.newHasher()
      .putInt(this.name == null ? 0 : this.name.hashCode());
    return hc.asInt();
  }
  */


  public double getPip() {
    return pip;
  }
}
