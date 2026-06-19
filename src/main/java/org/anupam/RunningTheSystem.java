package org.anupam;

import java.util.ArrayList;
import java.util.Scanner;

public class RunningTheSystem {
    public boolean shouldRun;
    public static void runTheSystem(ArrayList<Student> studentDetai){
        boolean pressedWrongedNumber = false;
        boolean shouldRun = true;
        int pressedNumber = 0;
        RunningTheSystem runTheSystem = new RunningTheSystem();
        runTheSystem.shouldRun = true;
        while(runTheSystem.shouldRun){
            Question.giveInstruction();
            System.out.println();

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter only number: ");

            boolean isnumbercorrect = false;
            while(!(isnumbercorrect)) {
                try {
                    pressedNumber = input.nextInt();
                    input.nextLine();
                } catch (Exception exception) {
                    System.out.println("This number is unfortunatly wrong please try Again!!!!");
                    input.nextLine();
                    continue;
                }
                isnumbercorrect = true;
            }

            if(isnumbercorrect){
                Question.casesToPerform(pressedNumber , studentDetai, runTheSystem , input);
            }
            continue;
        }
    }
}
