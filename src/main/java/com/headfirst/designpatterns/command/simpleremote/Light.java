package com.headfirst.designpatterns.command.simpleremote;

public class Light {
  
  public Light() {}
  
  public void on() {
    System.out.println("Light is On");
  }
  
  public void off() {
    System.out.println("Light is Off");
  }
}