package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.Interfaces;

public class ExampleInterfacesRules {

    interface DemoInterface1{

        // By default - public static final. No other modifier allowed
        // value1,value2,value3,value4 all are - public static final

        int value=10;
        public int value2=20;
        public static int value3=30;
        public static final int value4=40;

        // By default - public abstract. No other modifier allowed
        void Method1();


        //Interface can have a default definition of method.
        //NEW FEATURE
        default void Method5(){
            System.out.println("Default method");
        }

    }
    interface DemoInterface2{
        void Method2();
    }

    // An interface can extend another interface
// Class implementing SubInterface1 should
// implement method3 and method1(from ExampleInterface1)
    interface subInterface extends DemoInterface1{
        void Method3();
    }
    class SampleInterface implements DemoInterface1,DemoInterface2{


        /*
         * A class should implement all the methods in an interface. If either of
         * method1 or method2 is commented, it would result in compilation error.
         */

        @Override
        public void Method1() {
            System.out.println("sample Interface for method 1");
        }

        @Override
        public void Method2() {
            System.out.println("sample Interface for method 2");
        }
    }

}
