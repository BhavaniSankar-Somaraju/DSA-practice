/*Sliding window and Two pointer problems are generally of 4 types. They are 
 * 1.Constant Window problems
 * 2.Longest Substring/subarray where <condition>
 * 3.Number of Subarrays where <condition>
 * 4.Finding the shortest/minimum window/length <condition>
Constant window problems: In this program I will discuss about the constant window problems. 
So in constant window problems the window remains constant without changing size throughout the
problem and with that constant window only we can solve the problem that was given to us.
 
 As you see in the below example. 
 Q.)You are given an integer array nums consisting of n elements, 
 and an integer k.Find a contiguous subarray whose length is equal to k that has the maximum 
 average value and return this value. Any answer with a calculation error less than 10-5 will be 
 accepted.
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:
Input: nums = [5], k = 1
Output: 5.00000. 
Here in the above problem the window remains constant and we maintain that window and calculate the
sum. This is the example of constant window problem.*/
package Step4_SlidingWIndow_and_TwoPointer_Approach;
class Solution {
    public double findMaxAverage(int[] a, int k) {
        int l=1,r=k; double maxsum=0;
        for(int i=0;i<k;i++){
            maxsum+=a[i];
        }
        
        double newsum=maxsum;
        while (r<a.length){
            newsum=newsum-a[l-1]+a[r];
            //double avg=sum/k;
            if (maxsum<newsum){
                maxsum=newsum;
            }
            l++;
            r++;
        }
        return maxsum/k;
    }
}