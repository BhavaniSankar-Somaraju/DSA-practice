  /*In bubble sort what actually happens is in every step if we want to do the ascending order sort the 
largest element in array moves to the end of the array and this continues until all elements move to their actual
places in array. if we are doing descending order sort then smallest element
in array moves to the start of the array. [5,4,3,2,1] -> [1,2,3,4,5]
Time complexity: Best Case=O(n), Worst Case=O(n^2) and Space complexity=O(1).*/
package Step2_Arrays_and_Sorting;
import java.util.*;
public class My_Bubble_sort {
    public static void main(String[] args){
        int[] a={5,4,3,2,1};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }
        static void bubble(int[] a){
        for(int i=0;i<a.length;i++){
            boolean sorted=false;

            for(int j=1;j<a.length-i;j++){
                if (a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                sorted=true;
            }
        }
            if (!sorted){
                break; 
            
        }
    }

        }
        
    
}

