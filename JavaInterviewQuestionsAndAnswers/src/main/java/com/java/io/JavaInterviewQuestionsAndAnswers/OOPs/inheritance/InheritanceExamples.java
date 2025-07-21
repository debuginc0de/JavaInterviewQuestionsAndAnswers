package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.inheritance;

abstract class Animal{
    abstract String bark();
}
class Dog extends Animal{

    @Override
    String bark() {
        return "BOW BOW";
    }
}
class Cat extends Animal{
    String bark(){
        return "MEW MEW";
    }
}
public class InheritanceExamples {
    public static void main(String[] args) {
        Animal animal=new Cat();
        System.out.println(animal.bark());

    }
}
