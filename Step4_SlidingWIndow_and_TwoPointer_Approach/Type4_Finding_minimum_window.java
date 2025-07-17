/*
4.Finding the shortest/minimum window/length <condition>
Finding Minimum window subarray: In this type of problems they generally give a condition and
based on that condition we need to find out the length of the shortest substring possible using
sliding window and two pointer approach because it is the only way to find out the solution in
Time complexity of O(N). As the brute force approach may take time complexity of O(N^2).
 
 As you see in the below example. We will find the minimum length subarray and return it. this is
 just like somewhat opposite of finding longest subsequence subarray.
Q.)Given an array of positive integers nums and a positive integer 
 target, return the minimal length of a subarray whose sum is greater than or equal to target. If 
 there is no such subarray, return 0 instead.
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0*/
package Step4_SlidingWIndow_and_TwoPointer_Approach;

public class Type4_Finding_minimum_window {
    public static void main(String args[]){
        int target=7;
        int[] array={2,3,1,2,4,3};
        System.out.print(minSubArrayLen(target,array));
    }
    public static int minSubArrayLen(int k, int[] a) {
        int l=0,r=0,sum=0,minlen=Integer.MAX_VALUE;
        while(r<a.length){
            sum+=a[r];
            while (sum>=k){
                int len=r-l+1;
                if (len<minlen)
                {minlen=len;}
                sum=sum-a[l];
                l++;}

                r++;
            
        }
        if ( minlen==Integer.MAX_VALUE){return 0;}
        else {return minlen;}
    }
}

