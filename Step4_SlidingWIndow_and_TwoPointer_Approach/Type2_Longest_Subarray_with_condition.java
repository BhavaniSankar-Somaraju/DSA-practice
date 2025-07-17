/*
2.Longest Substring/subarray where <condition>
Longest Substring/subarray problems: In this type of problems they generally give a condition and
based on that condition we need to find out the length of the longest  substring possible using
sliding window and two pointer approach because it is the only way to find out the solution in
Time complexity of O(N).As the brute force approach may take time complexity of O(N^2).

As you see in the below example. 
Q.)Given a string s, find the length of the longest substring 
without duplicate characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pw
Here in the above problem we need to find out the longest substring length where string should
not contain duplicate characters. This is the example of Longest substring problem.*/

package Step4_SlidingWIndow_and_TwoPointer_Approach;
import java.util.*;
class Type2_Longest_Subarray_with_condition {
    public static void main(String[] args){
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
         int l=0,r=0,maxcount=0;
         HashMap<Character, Integer> a=new HashMap<>();
         while (r<s.length()){
            a.put(s.charAt(r),a.getOrDefault(s.charAt(r),0)+1);
            while (a.getOrDefault(s.charAt(r),0)>1){
                a.put(s.charAt(l),a.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            
            int len=(r-l+1);
            if (maxcount<len){
                maxcount=len;
            }r++;
            
         }return maxcount;
    }
}