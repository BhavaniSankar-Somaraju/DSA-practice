/*Time complexity for Binary search will always be in worst case: O(logN) and in
best case: O(1)space complexity will be O(1)
Remember binary search will be performed when the array is sorted array. If array is not sorted 
first make the array sorted in either ascending or descending then perform binary search.

So what's the major change in Order Agnostic binary search why we should use it and whats special in
it. 
During the cases when we face a array where you know array is sorted but you dont know that array is sorted or unsorted
like you may say i have eyes i can see but what if that array is given by user. So in such cases
to handle such arrays we need to check that either the array is in ascending order or is it in
descending order to handle accordingly.
So for this extent we are just writing a check statement that if it is ascending or descending and
also writing the required codes of how to handle search in ascending and in descending array to 
the binary search code that i had discussed before.
So how do we make a check. let's see example:
Ex:[1,2,3,4,5,6,7,8,9]. Here we have to check just by comparing values but we dont compare all values
which may increase time complexity again so for that we should compare only two values and we should
know the entire concept of the array(which direction sorted). 
You may think lets compare first two values if second value is greater than first then it is ascending
order sorted or else it is descending order sorted. But what if first two values are duplicate values
that means repeating values like (1,1,2,3,4,5,6) in such case comparing first two gives nothing.
So we should compare first and last values of array two know about array sorted order.
If first and last values are same then all values in array are with same duplicate so then
like [1,1,1,1,1,1] then check if the target is same as that element and return its first occurance
which is 0. If not that case apply binary search and adjust our previous code for binary search as suitable for ascending and descending sorted arrays.
*/

package Step3_Searching_Techniques;

public class Order_Agnostic_Binarysearch {
      public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int target=8;
        
        int index_of_target=binarysearch(a,target);
        System.out.println("The index position of target element is:"+index_of_target);

    }
    static int binarysearch(int[] a,int target){
        int start=0,end=a.length-1;
         if (a[start] == a[end]) {
               // All elements might be the same
            if (a[start] == target) {
                 return start; // Or any valid index, since all are the same
            } else {
               return -1; // Target not present
            }
            }
        boolean isAsc=a[start]<a[end];//checks true or false
        while(start<=end){
            int mid=start+(end-start)/2;
           
            if (a[mid]==target){
                return mid;
            }
            if (isAsc){     // checks if ascending order sorted if yes then performs below updation
                 if (a[mid]>target){
                     end=mid-1;
                    }
                 else{
                    start=mid+1;
                    }
                    }
            else{//if descending order sorted then performs below updation
                  if (a[mid]>target){
                      start=mid+1;
                    }
                  else{
                      end=mid-1;
                     }

                }
                
           
        }
        return -1;

    }
}
