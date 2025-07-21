package com.java.io.JavaInterviewQuestionsAndAnswers.Objects.Constructor;

class Animal {
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor with name");

    }

    //getter->It also a method which is return the name as per constructor
    public String getName() {
        return this.name;
    }

    static class Dog extends Animal {

        //parameterized constructor
        public Dog(String name) {
            super(name);
            //System.out.println("exit");
        }

        //Non-parameterized/default constructor
        public Dog() {
            super("Default Dog Name");
            //System.out.println("Default");
        }
    }
}
