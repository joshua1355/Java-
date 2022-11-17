package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int count =0;
        String[] adhd = {"String","Hi","tide nope"};
        String a = "This is my name ";
        String repl = "zzzzzz";
        String target = "is";
        for(int i =0; i<a.length(); i++){
            a = a.substring(0,i)+repl+a.substring(target.length());

        }
        System.out.println(count);
        String [] adhd2 = {"I love", "Kevin", "Rick", "kiss "};

        for(String score : adhd2) {
            System.out.println(score);
        }

    }
}
