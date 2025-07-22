package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.encapsulation;


//Encapsulation is wrapping the data(variable) and method(function)


public class EncapsulationsDemo {
    public static void main(String[] args) {
        CricketScore cs=new CricketScore();
        cs.four();
        cs.six();
        cs.four();
        cs.single();
        cs.printScore();
    }

    static class CricketScore{
        //variable
        private int score=0;

        //getter
        public int getScore(){
            return score;
        }
        //method
        public void addRuns(int score){
            this.score=this.score+score;
        }
        public void six(){
            addRuns(6);
        }
        public void four(){
            addRuns(4);
        }
        public void single(){
            addRuns(1);
        }
        public void printScore(){
            System.out.println("Score: "+score);
        }
    }
}
