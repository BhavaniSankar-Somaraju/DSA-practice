package Step2_Arrays_and_Sorting;
import java.util.*;
public class ArrayList2d {
      public static void main(String args[]){
    int row;
   // Scanner s=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list=new ArrayList<>(/*Default size if you want to add add it here*/);
    list.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
    list.add(new ArrayList<>(Arrays.asList(5,6,7,8)));
    list.add(new ArrayList<>(Arrays.asList(9,10,11,12)));
    list.add(new ArrayList<>());
    
    // to print whole array
    System.out.println(list);
 //s.close();   
}
}