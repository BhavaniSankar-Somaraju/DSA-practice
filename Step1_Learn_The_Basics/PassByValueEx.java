package Step1_Learn_The_Basics;

public class PassByValueEx {
    void givevalue(int a){
        a=a+10;
    }
    public static void main(String args[]){
        int a= 10;
        //givevalue(a);
        System.out.println(a);
        //eturn 0;

    }
}
