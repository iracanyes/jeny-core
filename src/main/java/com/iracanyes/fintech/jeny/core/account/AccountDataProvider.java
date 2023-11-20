package com.iracanyes.fintech.jeny.core.account;

import com.iracanyes.fintech.jeny.core.model.Account;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

/**
 * @param <T> Type of account ID
 * @see Account
 */
public interface AccountDataProvider<T> {
  /**
   * @param accountID Type of accountID
   * @return Account
   */
  Mono<Account<T>> getAccountInfo(T accountID);

  /**
   * @param accountID Type of accountID
   * @return Account
   */
  public Mono<Account<T>> getSpotAccountInfo(T accountID);

  /**
   * @param accountID Type of accountID
   * @return Account
   */
  Mono<Account<T>> getMarginAccountInfo(T accountID);

  /**
   *
   * @return A collection of all accounts with info
   */
  Flux<Account<T>> getAllAccountInfo();
}
