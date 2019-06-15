package com.headfirst.designpatterns.singleton.subclass;

public class CoolerSingleton extends Singleton {
  
  protected static Singleton uniqueInstance;
  
  private CoolerSingleton() {
    super();
  }
}