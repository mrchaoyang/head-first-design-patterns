package com.headfirst.designpatterns.compound.combining.composite;

public class GooseAdapter implements Quackable {
  Goose goose;
  
  public GooseAdapter(Goose goose) {
    this.goose = goose;
  }
  
  public void quack() {
    goose.honk();
  }
}