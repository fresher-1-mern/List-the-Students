package org.anupam;

import java.util.Scanner;

public class Student {
    private String studentName;
    private int studentId;
    private int rollNo;

    public void getStudentName(){
        if(!(this.studentName.isEmpty()) || this.studentName == null){
            System.out.println("Write something first");

        }
    }
    public int getStudentId(){
        return studentId;
    }

    public void addDetail(){
        System.out.print("Please enter the Student Name: ");
        Scanner input = new Scanner(System.in);
        this.studentName = input.nextLine();
        System.out.print("Please enter the Student Roll no: ");
        boolean isNumber = false;
        while(!(isNumber)) {
            try {
                this.rollNo = input.nextInt();
            } catch (Exception except) {
                input.nextLine();
                System.out.println("Pleage try again ....");
                continue;
            }
            isNumber = true;
        }

        System.out.println("Please enter the Student Id: ");
        isNumber = false;
        while(!(isNumber)) {
            try {
                this.studentId = input.nextInt();
            } catch (Exception except) {
                input.nextLine();
                System.out.println("Pleage try again ....");
                continue;
            }
            isNumber = true;
        }
    }

}
