package com.headfirst.designpatterns.compound.combining.observer;

public interface QuackObservable {
  void registerObserver(Observer observer);
  void notifyObservers();
}