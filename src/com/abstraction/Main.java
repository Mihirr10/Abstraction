package com.abstraction;

import com.abstraction.vehicle.*;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.start();
    car.changeGear();
    car.stop();
  }
}