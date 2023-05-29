package com.pulsitechtest;

import org.metawidget.inspector.annotation.UiComesAfter;

public class Person {

  private String mName;
  private int mAge;
  private boolean mRetired;
  //so it is going by variable type, and it shows the variable in the pop up as 'Num Kids'
  private int mNumKids;

  //changes the order
  @UiComesAfter("name")
  public int getNumKids() {
    return mNumKids;
  }

  public void setNumKids(int numKids) {
    mNumKids = numKids;
  }

  public String getName() {
    return mName;
  }

  public void setName(String name) {
    mName = name;
  }

  public int getAge() {
    return mAge;
  }

  public void setAge(int age) {
    mAge = age;
  }

  public boolean isRetired() {
    return mRetired;
  }

  public void setRetired(boolean retired) {
    mRetired = retired;
  }
}
