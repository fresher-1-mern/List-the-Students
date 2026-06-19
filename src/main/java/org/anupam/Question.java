package org.anupam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    final static String pressExit = "Press 6 to exit the program";
    public static void giveInstruction(){
        System.out.println("Press 1 to Start inserting the Student data");
        System.out.println("Press 2 to remove all the data");
        System.out.println("Press 3 to remove the individual Student");
        System.out.println("Press 4 to show all the data");
        System.out.println("Press 5 to to show the instructions again");
        System.out.println(Question.pressExit);
    }

    public static void casesToPerform(int pressedNumber , ArrayList studentDetails , RunningTheSystem runTheSys){
        switch(pressedNumber){
            case 1:
                Student stud = new Student();
                stud.addDetail();
                studentDetails.add(stud);
                break;
            case 2:
                if(!(studentDetails.isEmpty())){
                    studentDetails.clear();
                    break;
                }
                System.out.println("It's already empty........");
                break;
            case 3:
                System.out.println("hello this is a good program");
                break;

            case 4:
                System.out.println("hello this is a good program");
                break;

            case 5:
                System.out.println("hello this is a good program");
                break;

            case 6:
                runTheSys.shouldRun = false;
                break;

            default:
                System.out.println("this is a default statement running");
                break;
        }
    }

}
