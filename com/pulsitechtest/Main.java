package com.pulsitechtest;

import javax.swing.*;
import org.metawidget.swing.*;

public class Main {

  public static void main(String[] args) {
    //this is just from the tutorial in the docs, but we have to get a person anyway so...
    Person person = new Person();

    SwingMetawidget metawidget = new SwingMetawidget();
    metawidget.setToInspect(person);

    //so this is the window that gets openned - can we set it to a website address or what?
    JFrame frame = new JFrame("Metawidget Tutorial"); //so we can embed this into a web page... not sure this is efficient but...
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(metawidget);
    frame.setSize(400, 250);
    frame.setVisible(true);
  }
}
