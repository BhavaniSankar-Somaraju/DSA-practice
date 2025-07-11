package Step2_Arrays_and_Sorting;
import java.util.*;
public class ArrayList1d {
    public static void main(String args[]){
    int n,row;
    Scanner s=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>(/*Default size if you want to add add it here*/);
    System.out.println("Enter the size of array:");
    n=s.nextInt();
    System.out.println("Enter elements into array:");
    for(row=0;row<n;row++)
    {
        list.add(s.nextInt());
    }
    System.out.println("The 1 D array will be as shown below:");
    // to print whole array
    System.out.println(list);
    s.close();   
}
}
