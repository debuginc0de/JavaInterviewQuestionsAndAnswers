package com.java.io.JavaInterviewQuestionsAndAnswers.Objects;
 class Animal{
    String type;
    String name;

     public Animal(String name,String type){
         this.name=name;
         this.type=type;
     }

     @Override
     public String toString() {
         return "Animal{" +
                 "type='" + type + '\'' +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
public class ToStringExamples {
    public static void main(String[] args) {
        Animal animal=new Animal("Tommy","Dog");
        System.out.println(animal);


    }
}
