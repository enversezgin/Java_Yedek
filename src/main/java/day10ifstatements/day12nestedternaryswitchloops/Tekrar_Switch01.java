package day10ifstatements.day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar_Switch01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a name of day");
        String dayName = input.nextLine();

        switch (dayName.trim().toLowerCase()){
            case "sunday" :
                System.out.println("it is first day");
                break;
            case "monday" :
                System.out.println("it is second day");
                break;
            case "tuesday" :
                System.out.println("it is third day");
                break;
            case "wednesday" :
                System.out.println("it is fourth day");
                break;
            case "thursday" :
                System.out.println("it is fifth day");
                break;
            case "friday" :
                System.out.println("it is sixth day");
                break;
            case "saturday" :
                System.out.println("it is sevent day");
                break;
            default:
                System.out.println("Wrong entry made");

        }
    }
}
