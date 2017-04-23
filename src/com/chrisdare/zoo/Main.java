package com.chrisdare.zoo;

import static java.lang.System.out;

import java.awt.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	// write your code here

      Monkey lion = new Monkey();
      lion.setName("Guy");
      lion.setColor(Color.black);
      lion.setType("lion");
      lion.setSound("roar");
//      ArrayList<Monkey> alpha = null;
//      alpha.add(lion);

      out.println(lion.getName());

      Zoo zoo = new Zoo();
      String zooName= "VVU Zoo";
      zoo.setName(zooName);
      zoo.showZooActivity();
    }

}
