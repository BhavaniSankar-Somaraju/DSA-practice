/*
3.Number of Subarrays where <condition>
Number of Subarrays where <condition>: In this type of problems they generally give a condition and
based on that condition we need to find out the number of subarrays that can be possibly generated
by using the approach of sliding window and two pointer because it is the only way to find out the 
solution in Time complexity of O(N). As the brute force approach may take time complexity of O(N^2).
 
As you see in the below example. We will find the number of subarrays that are possible to be generated
when sum=k; This is a tricky question and the approach is also different. In this question we will
use the maths logic to solve question without getting any consequences. We will use the formula of
No. of subarrays with sum=k "is equal to" (No. of subarrays with sum<=k) - (No. of subarrays with sum<=k=1)
Then all the values that are lesser than k will be removed and only values with = k remains.If we see 
mathematically it was correct and that will be used here. See the example below of how to perform it.

**Most important point to remember we dont use the same exact approach for all kind of number of subarrays 
type of questions. Let me explain to you when we use this kind of approach and when we dont.
--->1.When to use this approach:- 
   i.)When the problem is monotonic we will use this kind of approach. So monotonic means A property that 
   only ever increases or stays the same when the window is expanding. So in this question we are solving now, the 
   window is expanding the sum increases when 1 occurs and remains same when 0 occurs. So the monotonic property
   is satisfied. At such cases we use this approach of atMost(k) - atMost(k-1).
   ii.) Another example would be -> when you had given an array and asked you to return the number of subarrays 
   that contain k distinct integers. That array may also contain duplicates when duplicate occurs we dont consider it
   like as we did in previous example when '0' occurs we dont considered like that.
   why it satisfies monotonic property.As the "number of distinct elements"—is still monotonic here.
    Let's see: let given array is nums = [1,2,1,3,4], k = 3Output: 3
    Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4]
    The number of distinct elements never decreases when you add a new element. Since it's a monotonic property.
    Therefore, atMost(k) - atMost(k-1) is the correct solution.

--->2.When not to use this approach:- 
    i.)The Golden Rule: Do not use this pattern if the property you are measuring is NOT MONOTONIC as you expand the window.
    ii.)When array contains Negative Numbers: Sum is not monotonic. 5 -> 7 -> 4. The window sum can go up or down.
    iii.) When in question they dont ask you to return the Goal which is Not "Exactly k"
    Just think why we are doing the entire purpose of the atMost(k) - atMost(k-1) trick just to isolate the count for ==k. 
    So, If the problem already asks you to find the number of subarrays with a sum at most k or at least k, then you just 
    implement only a single sliding window directly as we discussed in previous methods of longest subsequence type of questions. 
    As Using the subtraction would be unnecessary and incorrect in such situations.



Q.) Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
A subarray is a contiguous part of the array.
Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15*/

package Step4_SlidingWIndow_and_TwoPointer_Approach;

public class Type3_Number_Of_subarrays {
    public static void main(String[] args) {
        int[] a={1,0,1,0,1};
        int k=2;
        int number_Of_subarrays_with_sum_lessthan_or_equals_k = fun(a,k);
        int number_Of_subarrays_with_sum_lessthan_or_equals_k_minus_one=fun(a,k-1);
        int number_Of_subarrays_with_sumequals_k = number_Of_subarrays_with_sum_lessthan_or_equals_k - number_Of_subarrays_with_sum_lessthan_or_equals_k_minus_one;
        System.out.print(number_Of_subarrays_with_sumequals_k);
    }
    public static int fun(int[] a,int k){
        if (k<0){
            return 0;
        }
        int l=0,r=0,sum=0,count=0;
        while(r<a.length){
           sum+=a[r];
           while (sum>k){
                sum=sum-a[l];
                l++;
           }
            count=count+(r-l+1);
            r++;      
        }
        return count;
    }
}
