package org.anupam;

import java.util.Scanner;

public class Student {
    private String studentName;
    private int studentId;
    private int rollNo;

    public String getStudentName(){
        return this.studentName;
    }
    public int getStudentId(){
        return this.studentId;
    }

    public int getStudentRollNo(){
        return this.rollNo;
    }

    public void addDetail(){
        System.out.print("Please enter the Student Name: ");
        Scanner input = new Scanner(System.in);
        this.studentName = input.nextLine();
        while(this.studentName.isEmpty()){
            System.out.println("Please enter again.....");
            this.studentName = input.nextLine();
        }
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
