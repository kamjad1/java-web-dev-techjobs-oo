package org.launchcode.techjobs_oo.Tests;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String name;
    private String value;

    // Common Constructors
    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }

    //Same Getters and Setters
    public int getId() {return id;}
    public String getValue() {return value;}
    public void setValue(String value){this.value=value;}

    //identical custom methods
    //toString()
    @Override
    public String toString() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return id == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
