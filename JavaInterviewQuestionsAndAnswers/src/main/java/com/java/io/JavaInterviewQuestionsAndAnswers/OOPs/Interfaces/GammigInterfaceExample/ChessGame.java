package com.java.io.JavaInterviewQuestionsAndAnswers.OOPs.Interfaces.GammigInterfaceExample;

import java.sql.SQLOutput;

public class ChessGame implements GammingConsole{

    @Override
    public void up() {
        System.out.println("Move up way");
    }

    @Override
    public void down() {
        System.out.println("Move Down Way");
    }

    @Override
    public void left() {
        System.out.println("Move left side");
    }

    @Override
    public void right() {
        System.out.println("Move right side");
    }
}
