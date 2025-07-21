package com.java.io.JavaInterviewQuestionsAndAnswers.Objects.Constructor;


public class ConstructorsExample {
    public static void main(String[] args) {
        /*Animal animal=new Animal("Cat");
        Animal.Dog dog=new Animal.Dog();
        dog.getName();
        animal.getName();
        */
        Animal animal=new Animal("cats",4);
        Animal animal2=new Animal(animal);
        System.out.println(animal2.getName());
        System.out.println(animal2.getLegs());

    }
}
