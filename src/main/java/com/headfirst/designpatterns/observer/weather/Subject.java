package com.headfirst.designpatterns.observer.weather;

public interface Subject {
  void registerObserver(Observer o);
  void removeObserver(Observer o);
  void notifyObservers();
}