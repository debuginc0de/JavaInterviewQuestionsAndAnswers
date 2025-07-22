package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.Polymorphism;

public class polymorphismExample {
    class Superclass{
        public int methodOverride(){
            return -1;
        }
    }
    class Subclass extends Superclass{
        public int methodOverride(){
            //super.methodOverride();
            return 1;
        }
    }
    class Subclass2 extends Superclass{
        public int methodOverride(){
            //super.methodOverride();
            return 2;
        }
    }
    public void polyExample(){
        Superclass[] superclass={new Superclass(),new Subclass(),
                new Subclass2()};
        System.out.println(superclass[1].methodOverride());
        System.out.println(superclass[0].methodOverride());
        System.out.println(superclass[2].methodOverride());
    }
    public static void main(String[] args) {
        polymorphismExample ps=new polymorphismExample();
        ps.polyExample();
    }
}

