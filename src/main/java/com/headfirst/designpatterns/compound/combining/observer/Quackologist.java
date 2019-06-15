package com.headfirst.designpatterns.compound.combining.observer;

public class Quackologist implements Observer {
  
  public void update(QuackObservable duck) {
    System.out.println("Quackologist: " + duck + " just quacked.");
  }
}