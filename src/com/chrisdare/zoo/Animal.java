package com.chrisdare.zoo;

import java.awt.*;
import java.util.List;
import java.lang.reflect.Array;

/**
 * Created by Chris Dare on 4/23/2017.
 */
public class Animal {
  private String name = "";
  private int eyes = 2;
  private int limbs = 4;
  private String animalSound;
  private boolean quadruped = true;
  private Color color;
  private boolean isAsleep = false;
  private boolean isHungry = true;
  private String[] validFoods = {"water"};
  private String type;

  public Animal(){
    setAsleep();
  }

  public void setType(String type) {
    this.type = type;
  }
  public String getType() {
    return type;
  }

  public void setColor(Color color) {
    this.color = color;
  }
  public Color getColor(){
    return color;
  }
  public void setFood(String[] validFoods){
    this.validFoods = validFoods;
  }
  public void move(){
//    move from a distance to a certain distance
  }
  public void sleep(){
    this.isAsleep = true;
  }
  public void setAsleep(){
    int n = (int) Math.floor(Math.random() * 2);
    if (n==1)
      this.isAsleep = true;
    else if (n==2)
      this.isAsleep = false;
  }
  public void setSound(String sound){
    this.animalSound = sound;
  }
  public String getSound(){
    return animalSound;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public String wakeUp(){
    String message;
    if (this.isAsleep){
      this.isAsleep = false;
      message = this.name + " is awake!";
    }
    else {
      message = this.name + " is already awake!";
    }
    return message;
  }
  public String eat(String food){
    String message = "s";
    if(this.isHungry){
      for(int i=0; i<validFoods.length; i++){
        if(food==this.validFoods[i]){
          message = this.name + "is eating";
          break;
        }
        else message = "sorry hun, " +this.name + "can't eat this kind of food!";
      }
    }
    else message = this.name + "says, he's not hungry";

    return message;
  }

}
