  /*In Selection sort what actually happens is in every step if we want to do the ascending order sort the 
largest element in array moves to the end of the array and this continues until all elements move to their 
actual places in array. if we are doing descending order sort then smallest element in array moves to the 
start of the array. But how this actually happens is first it searches for the largest element in the
specific part of the array and why i am saying this specific part of array is this part changes i.e  
decreases every time when the largest element is moved to the end of the array 
[5,4,3,2,1] ->finds max from entire array and moves it to the last position here last is end of array->[4,3,2,1,5]
[4,3,2,1,5] -> finds max only from 4 to 1 because 5 is already in its correct place so 4 moved to second last -> [3,2,1,4,5]
[3,2,1,4,5] -> finds max only from 3 to 1 because 4 is already in its correct place so 3 moved to third last -> [2,1,3,4,5].
This continues until entire array is sorted
Time complexity: Best Case=O(n^2), Worst Case=O(n^2) and Space complexity=O(1).*/
package Step2_Arrays_and_Sorting;
import java.util.Arrays;
public class My_Selection_sort {
 public static void main(String[] args){
    int[] a={5,4,3,2,1};
    selection(a);
    System.out.println(Arrays.toString(a));
 }  
 static void selection(int[] a){
    for(int i=0;i<a.length;i++){
        int last=a.length-i-1;
        int max=maxindex(a,last);
        swap(a,max,last);
    }
 }
 static void swap(int a[],int max,int last){
    int temp=a[max];
    a[max]=a[last];
    a[last]=temp;
 }

 static int maxindex(int[] a,int last){
    int maxi=0;
    for(int i=1;i<=last;i++){
        if (a[i]>a[maxi]){
            maxi=i;
        }
    }
    return maxi; 
}
}
