package Step1_Learn_The_Basics;
import java.util.Scanner;
public class ForLoop {
   public static void main(String[] args) {
    System.out.println("Will increment given number step by step for 10 steps: ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for (int i=1;i<=10; i++){
        System.out.println("In Step "+i+" -> "+num+" + "+i+ " = "+(num+i));
    }
    sc.close();
   } 
}
