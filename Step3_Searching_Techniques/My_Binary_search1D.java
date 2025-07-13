/*Time complexity for Binary search will always be in worst case: O(logN) and in
best case: O(1)space complexity will be O(1)
Remember binary search will be performed when the array is sorted array. If array is not sorted 
first make the array sorted in either ascending or descending then perform binary search.
Here the time complexity is O(logN) which is far more efficient than the linear search because here
we will not wasting our time by going and checking the entire array for our required element
like as we did in linear search here what we do is we exactly breaks the code by dividing into halves
Ex: We have a={1,2,3,4,5,6,7,8}; and our target=7. We will first make sure to initialize variables
start, end wherer start = 0 and end = array_length -1 which are pointing to first and last index at 
the beginning. then we will create a while loop which states that this loop wont end until start>end
that means if start values exceeds end value then loop ends. You'll know why that loop condition was
written later. then we will calculate the mid value to divide the array into two and check in array
we have to find mid by using the formular mid= start+(end-start)/2 to calculate mid. You may also 
think why we have to use that formula instead when we can write mid=(start+end)/2. This is because
in java sometimes the value of (start+end) may exceed the integer limit when we have start and end
as too much high integer values but this mid=(start+end)/2 formula can be written in programming 
languages like python. So now we had calculated mid. Now we'll know what actually going to happen.

We have start, mid, end and while loop is running. First of all, why we are here to find the target
element how we are doing it in O(logN) time complexity. By following the steps below.
1. we'll check the value of if (a[mid]==target) and if yes then return mid. It will be our required index.
2. IF no then we'll check else if (a[mid]<target). This means that our target is more than the element
in the mid position so we'll update our start value to mid+1 by writing start=mid+1. This means
as the target element is greater than the mid element there is no use in checking the elements which
are to the left side of mid so we are changing start value to the mid+1 and then performing the
binary search to the only right side elements by again calculating the mid value as we are still in 
while loop.
3.Again If step 1 is no there will be other case i.e else if(a[mid]>target).This means that our target is
less than the element in the mid position so we'll update our end value to mid-1 by writing end=mid-1. This
means as the target element is less than the mid element there is no use in checking the elements which
are to the right side of mid so we are changing end value to the mid-1 and then performing the
binary search to the only left side elements by again calculating the mid value as we are still in 
while loop.
4.If the loop is running but we still dont found our target element then what happens means there is no such
target element in our actual array so at this case the start will pass the end that means start>end and loop breaks
This returns -1 as the final answer which means there is no element found.
Going to example a={1,2,3,4,5,6,7,8}; and our target=7
here start=0, end=(arraylength)8-1=7, while(start<=end) -> mid=start+(end-start)/2==>0+(7-0)/2=3
1.)if a[3]==target as 4 !=7 2.) if a[3]<7 as 4<7 yes then start=mid+1 i.e start=3+1==>4 now again calculate mid
mid=start+(end-start)/2==>4+(7-4)/2=5. Now check a[5]==7 no as 6!=7 and check if 6<7 yes then start=mid+1
start=5+1=6. And mid=start+(end-start)/2==>6+(7-6)/2=6. a[6]==7 or not YES>>>> Hence our target element is found we
will return the index of the mid... If not found in this process start will exceed end loop breaks and returns -1.
 */     



package Step3_Searching_Techniques;

public class My_Binary_search1D {
      public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int target=8;
        int index_of_target=binarysearch(a,target);
        System.out.println("The index position of target element is:"+index_of_target);

    }
    static int binarysearch(int[] a,int target){
        int start=0,end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (a[mid]<target){
                start=mid+1;
            }
            else if (a[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
