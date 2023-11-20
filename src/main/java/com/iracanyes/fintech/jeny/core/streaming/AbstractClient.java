package com.iracanyes.fintech.jeny.core.streaming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.web.reactive.function.client.WebClient;


public class AbstractClient {
  private static final Logger LOGGER = LoggerFactory.getLogger(AbstractClient.class);
  private final String apiKey;
  //private static WebClient client;

  AbstractClient(String providerURL, String pApiKey){
    //client = WebClient.create(providerURL);
    apiKey = pApiKey;
  }




}
