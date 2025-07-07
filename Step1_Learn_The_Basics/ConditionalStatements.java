package Step1_Learn_The_Basics;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String grade = null;
        System.out.println("Enter your marks to allot grades:");
        int marks=s.nextInt();
        if (marks<35){
            grade="F";
        }
        else if (marks<55){
            grade="E";
        }
         else if (marks<65){
            grade="D";
        }
        else if (marks<75){
            grade="C";
        }
         else if (marks<85){
            grade="B";
        }
         else if (marks>90){
            grade="A";
        }
        System.out.println("Your grade is: " + grade);
        s.close();
    }
}
