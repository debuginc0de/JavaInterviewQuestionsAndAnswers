package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.Polymorphism;

public class OverLoadingExample {

    class ExampleClass{

        //Same method name but different parameter are there
        public int overLoaded(){
            return 0;
        }
        public int overLoaded(int a){
            return a;
        }
        public int overLoaded(int a,int b){
            return a+b;
        }
    }
    public void methodOverloading(){
        ExampleClass ec=new ExampleClass();
        System.out.println(ec.overLoaded());
        System.out.println(ec.overLoaded(10));
        System.out.println(ec.overLoaded(10,20));
    }
    public static void main(String[] args) {
        OverLoadingExample o=new OverLoadingExample();
        o.methodOverloading();
    }
}
