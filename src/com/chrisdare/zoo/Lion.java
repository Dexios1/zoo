package com.chrisdare.zoo;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Chris Dare on 4/23/2017.
 */
public class Lion extends Animal {

  public Lion(){
    super();
    String[] food ={"cow and chicken", "meat"};
    this.setFood(food);
    this.setType("lion");
  }
}
