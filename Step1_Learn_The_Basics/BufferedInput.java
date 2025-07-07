package Step1_Learn_The_Basics;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferedInput {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name=br.readLine();
        System.out.println("Enter your age:");
        String agestr=br.readLine();
        int age=Integer.parseInt(agestr);
        System.out.println("Hello,"+name+" you are just "+age+" years old. Don't Worry.");
        br.close();
    }
}
