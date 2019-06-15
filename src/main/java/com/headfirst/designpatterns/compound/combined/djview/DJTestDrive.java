package com.headfirst.designpatterns.compound.combined.djview;

public class DJTestDrive {
  
  public static void main (String[] args) {
    BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
  }
}