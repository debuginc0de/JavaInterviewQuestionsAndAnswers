package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.Polymorphism;

public class OverridingExample {

    /*Same method name same parameter but different parameter which is
    defined by inherit

    Name, parameters, and return type must match the parent method.
    Java picks which method to run, based on the actual object type, not just the variable type.
    Static methods cannot be overridden.
    The @Override annotation catches mistakes like typos in method names.
     */


    class Bank{
        public void ROI() {
            System.out.println("5% interest");
        }
    }
    class PNB extends Bank{
        public void ROI(){
            System.out.println("7% interest");
        }
    }
    class SBI extends Bank{

        @Override
        public void ROI(){
            System.out.println("8% Interest");
        }
    }

    public static void main(String[] args) {

    }
}
