package com.headfirst.designpatterns.compound.combining.adapter;

public class RubberDuck implements Quackable {
  public void quack() {
    System.out.println("Squeak");
  }
}