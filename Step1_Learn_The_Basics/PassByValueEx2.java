package Step1_Learn_The_Basics;

import java.util.Arrays;

public class PassByValueEx2 {
    public static void main(String args[]){
        int[] a= {10,20,30};
         System.out.println("array value of a is"+Arrays.toString(a));
        givevalue(a);
        System.out.println("array value of a is"+Arrays.toString(a));//here for objects the copy of value of the reference is passed so the array is changing here.
       

    }
    public static void givevalue(int[] c){
        c[0]=1000;
        System.out.println("array value of a is"+Arrays.toString(c));
    }
}
