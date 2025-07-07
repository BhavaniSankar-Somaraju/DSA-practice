package Step1_Learn_The_Basics;

public class WhileLoop {
    public static void main(String[] args){
    int num=5,a=num,factorial=1;
    while (a>0){
        factorial=factorial*a;
        a--;
    }
    System.out.println("Factorial of "+num+" is "+factorial);
}
}
