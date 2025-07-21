package com.java.io.JavaInterviewQuestionsAndAnswers.Objects.Constructor;

class Animal {
    private String name;
    private int legs;

    //constructor
    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
        System.out.println("Animal Constructor with name");

    }

    //Copy constructor
    public Animal(Animal animal) {
        this.name = animal.name;
        this.legs = animal.legs;
    }

    //getter->It also a method which is return the name as per constructor
    public String getName() {
        return this.name;
    }

    public int getLegs() {
        return this.legs;
    }

    static class Dog extends Animal {

        //parameterized constructor
        public Dog(String name, int legs) {
            super(name, legs);
            //System.out.println("exit");
        }

        //Non-parameterized/default constructor
        //public Dog() {
        //super("Default Dog Name and Legs");
        //System.out.println("Default");
    }
}
