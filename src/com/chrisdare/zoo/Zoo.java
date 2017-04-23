package com.chrisdare.zoo;

import com.github.javafaker.Faker;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by Chris Dare on 4/23/2017.
 */
public class Zoo {
  private ArrayList<Animal> zooList = new ArrayList<>();
  private int size = 20;
  private String name;
  public Zoo(){
    populate();
  }
  protected void populate(){
    Faker faker = new Faker();
    while(this.size >0){
      if (size%2==0){
        Lion lion = new Lion();
        lion.setName(faker.name().firstName());
        lion.setColor(Color.black);
        lion.setSound("roar");
        lion.setType("lion");
        zooList.add(lion);
      }
      else{
        Monkey monkey = new Monkey();
        monkey.setName(faker.name().firstName());
        monkey.setColor(Color.green);
        monkey.setSound("hoot!");
        zooList.add(monkey);
      }
      size--;
    }

  }
  public void showZooActivity(){
    out.println("There are "+ this.zooList.size() +" animals in the zoo");
    for(Animal animal : this.zooList){
      out.println(animal.getName()+" is a "+ animal.getType());
      out.println(animal.wakeUp());
      out.println("Trying to feed animal with Banana");
      animal.eat("banana");
      out.println("Trying to feed animal with antelope");
      animal.eat("antelope");
    }
  }
  public List<Animal> getZooList(){
    return zooList;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }




}
