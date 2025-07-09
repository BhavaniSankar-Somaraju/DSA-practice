package Step1_Learn_The_Basics;

public class PassByValueEx1 {
    public static void main(String args[]){
        int a= 10;
         System.out.println("a value is"+a);
        givevalue(a);
        System.out.println("a value is"+a);
        //eturn 0;

    }
    public static void givevalue(int c){
        c=20;
        System.out.println("a value is"+c);
    }
}
