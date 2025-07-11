package Step2_Arrays_and_Sorting;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays2d {
    public static void main(String args[]){
    int r,c,row,column;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the rows of 2d array:");
    row=s.nextInt();
    System.out.println("Enter the columns of 2d array:");
    column=s.nextInt();
    int[][] arr=new int[row][column];
    
    for(r=0;r<row;r++)
    {
        System.out.println("Enter "+column+" elements into "+(r+1)+ " row of array:");
     for(c=0;c<column;c++)
     {
               arr[r][c]=s.nextInt();
    }
    }
    System.out.println("The 2 D array will be as shown below:");
    //Method1 to print whole array
     System.out.println("Method1: ");
    for(r=0;r<row;r++){
    System.out.println(Arrays.toString(arr[r]));
    }
    //Method2 to print whole array
    System.out.println("Method2: ");
    for(r=0;r<row;r++){
    for(c=0;c<column;c++){
    System.out.print(arr[r][c]+" ");
    }
    System.out.println();
    }
    //Method3 to print whole array
    System.out.println("Method3: ");
    for(int[] i:arr){
    System.out.print(Arrays.toString(i));
    }

    
 s.close();   
}
}