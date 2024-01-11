package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

//    protected Object Jobfield{

        int id;
        static int nextId = 1;
        String value;
 //   public String JobField(String value) {
 //       return value;

 //   }
 @Override
 public String toString() {
     return value;
 }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    public String getValue () {
        return value;
    }
    public int getId() {
            return id;
        }
        public void setValue(String value) {
            this.value = value;
        }

        public void initID() {
            id = nextId;
            nextId++;
        }

    }



