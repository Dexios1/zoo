package com.chrisdare.zoo;

/**
 * Created by Chris Dare on 4/23/2017.
 */
public class Monkey extends Animal{
  public Monkey(){
    super();
    String[] food = {"chips", "bananas"};
    this.setFood(food);
    this.setType("monkey");
  }
}
