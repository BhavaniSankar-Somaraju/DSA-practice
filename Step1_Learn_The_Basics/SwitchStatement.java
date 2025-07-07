package Step1_Learn_The_Basics;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your grade to check pass status: ");
    String grade=s.nextLine();
    switch (grade){
        case "A":
        System.out.println("Wow! You are excellent ");
        break;
        case "B":
        System.out.println("Good! You scored well ");
        break;
        case "C":
        System.out.println("Well done.  ");
        break;
        case "D":
        System.out.println("Ok but you need to improve.");
        break;
        case "E":
        System.out.println("Thank god! you just passed");
        break;
        case "F":
        System.out.println("Sorry! You failed better luck next time.");
        break;
        default:
        System.out.println("Enter proper grades only...");

    }
    }
}
