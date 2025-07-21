package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.inheritance;

/*if we call the abstract method it should be created
on another class and it can @Override the method*/

//abstract class
abstract class Animal{

    //abstract method: can't describe anything.and use only abstract class
    abstract String bark();
}
class Dog extends Animal{

    @Override
    String bark() {
        return "BOW BOW";
    }
}
class Cat extends Animal{

    @Override
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
