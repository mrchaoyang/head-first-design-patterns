package com.headfirst.designpatterns.state.gumballstatewinner;

public interface State {
  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void dispense();
}