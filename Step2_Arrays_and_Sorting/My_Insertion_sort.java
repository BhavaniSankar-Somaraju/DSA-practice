/*In Insertion sort what actually happens is in every step the larger elemement may or may not go to its correct placement at every iteration.
So Insertion sort actually start to sort from the left hand side i.e means if we have elements [5,4,3,2,1] it first sorts left side two 
elements 5 and 4 [5,4  || 3,2,1] -> [4,5  || 3,2,1], then it goes by taking next element to the right i.e 3 and again start sorting 
left hand side i.e [4,5,3  || 2,1] -> [3,4,5  || 2,1] it goes on like this until all gets sorted in expected manner(ascending/descending)
[4,5,3,2 || 1] -> [2,3,4,5  || 1] ....... then .....[4,5,3,2,1] -> [1,2,3,4,5]. This will be the final array after sorting
Time complexity: Best Case=O(n), Worst Case=O(n^2) and Space complexity=O(1).*/
package Step2_Arrays_and_Sorting;
import java.util.*;
public class My_Insertion_sort {
    public static void main(String[] args) {
    int[] a={5,4,3,2,1};
    insertion(a);
    System.out.print(Arrays.toString(a));
}
static void insertion(int[] a){
    for(int i=0;i<a.length-1;i++){
     for(int j=i+1;j>0;j--){
    swap(a,j,j-1);
     }
    }
}
static void swap(int[] a, int start,int last){
    int temp=a[start];
    a[start]=a[last];
    a[last]=temp;
}
}
