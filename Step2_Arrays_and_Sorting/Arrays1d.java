package Step2_Arrays_and_Sorting;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays1d {
    public static void main(String args[]){
    int n,row;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    n=s.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter elements into array:");
    for(row=0;row<n;row++)
    {
        arr[row]=s.nextInt();
    }
    System.out.println("The 1 D array will be as shown below:");
    // to print whole array
    System.out.println(Arrays.toString(arr));
 s.close();   
}
}