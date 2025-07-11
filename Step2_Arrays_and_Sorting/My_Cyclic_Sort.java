/*Cyclic sort remember this name which is one of the most asked sorting question in many coding assessments or 
coding interviews in top companies like Google, Amazon, Facebook etc. So when do we apply Cyclic sort. If you observe
any question pattern which says something like given numbers ranging [0,n] or [1,n] in array. Find the missing element
in the array or find the most repeated element in the array. or Find the duplicate element in the array.
***One of the biggest clue to find the cyclic sort program is observing the range given like [0,n] or [1,n] i.e
first n numbers etc. and the second biggest clue is if they asked to solve the problem in 
Time complexity of O(n) and space complexity of O(1). Because only cyclic sort gives you these features for 
time complexity in sorting. So these are important points to remember to identify a cyclic sort problem.***

So Cyclic sort works mostly when the range of numbers is given like [0,n] or [1,n] or first n numbers etc.
"So how the sorting is actually being done here is based on the index numbers we sort the elements by simply 
seeing the element and asking that if the element is in correct position or not. so you may ask how do you know 
that the index is in correct position or not simple just by checking if index of number = number-1.
Ex:[5,2,1,4,3] 
1.)Here the index of 5=0,2=1,1=2,4=3,3=4. So in program we check if index of 5=5-1 if not, then swaps
5 with the element in position of 5-1 i.e index=4 which is 3 here. so 5 and 3 are swapped ->[3,2,1,4,5].
2.)Again check if index of 3=3-1 i.e 2 or not. if not, then swaps 3 with the element in position of 3-1 i.e 
index=2 which is 1 here. so 3 and 1 are swapped ->[1,2,3,4,5].
3.)Again check if index of 1=1-1 i.e 0 or not. Here it is true, so no need to swap so move forward and check next 
element which is 2.
4.)Again check if index of 2=2-1 i.e 1 or not. Here it is true, so no need to swap so move forward and check next 
element which is 3.
5.)This process continues and checks all elements whether they are in their correct index positions or not if not
then swaps. So this is what cyclic sort means.*/

package Step2_Arrays_and_Sorting;
import java.util.*;
public class My_Cyclic_Sort {
    public static void main(String[] args) {
        int[] a={5,4,2,1,3};
        cyclic(a);
        System.out.println(Arrays.toString(a));
    }
    static void cyclic(int[] a){
        int i=0;
        while (i<a.length){
            int correctindex=a[i]-1;
            if (a[i]!=a[correctindex]){
                int temp=a[i];
                a[i]=a[correctindex];
                a[correctindex]=temp;
            }
            else{
                i++;
            }
        }
    }
}
