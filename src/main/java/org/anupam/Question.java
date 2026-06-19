package org.anupam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    final static String pressExit = "Press 5 to exit the program";
    public static void giveInstruction(){
        System.out.println("Press 1 to Start inserting the Student data");
        System.out.println("Press 2 to remove all the data");
        System.out.println("Press 3 to show all the data");
        System.out.println("Press 4 to to show the instructions again");
        System.out.println(Question.pressExit);
    }

    public static void casesToPerform(int pressedNumber , ArrayList<Student> studentDetails , RunningTheSystem runTheSys, Scanner input){
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
                System.out.println("It's already empty........ Tap enter to redirected to the start");
                input.nextLine();
                break;
            case 3:
                if(studentDetails.isEmpty()){
                    System.out.println("This is empty you have to insert again");
                    input.nextLine();
                    break;
                }
                for(Student student : studentDetails){
                    System.out.println("This is a Student name: " + student.getStudentName());
                    System.out.println("This is a Student Id: " + student.getStudentId());
                    System.out.println("This is the Student roll no: " + student.getStudentRollNo());
                }
                input.nextLine();
                break;

            case 4:
                input.nextLine();
                break;

            case 5:
                runTheSys.shouldRun = false;
                break;

            default:
                System.out.println("this is a default statement running");
                break;
        }
    }

}
