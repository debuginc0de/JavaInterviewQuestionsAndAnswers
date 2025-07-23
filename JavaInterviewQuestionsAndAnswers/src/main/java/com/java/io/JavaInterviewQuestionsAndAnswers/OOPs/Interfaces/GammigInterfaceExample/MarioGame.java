package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.Interfaces.GammigInterfaceExample;

public class MarioGame implements GammingConsole{
    @Override
    public void up() {
        System.out.println("Move up");
    }

    @Override
    public void down() {
        System.out.println("Move Down");
    }

    @Override
    public void left() {
        System.out.println("Move left");
    }

    @Override
    public void right() {
        System.out.println("Move right");
    }
}
