/*You are given a string s and an integer k. You can choose any character of the string and change it to any other 
uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above 
operations.
Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.*/package Step4_SlidingWIndow_and_TwoPointer_Approach;

import java.util.HashMap;

public class Longest_Repeating_Character_replacement {
    public static void main(String[] args) {
        String string="AABABBA";
        int k=1;
        System.out.print("Maximum characters length is:"+characterReplacement(string,k ));
    }
    public static int characterReplacement(String a, int k) {
       int l=0,r=0,maxlen=0,maxfreq=0;
       HashMap<Character,Integer> m=new HashMap<>();
       while(r<a.length()){
        m.put(a.charAt(r),m.getOrDefault(a.charAt(r),0)+1);
        maxfreq=max(maxfreq,m.get(a.charAt(r)));
        int changes=(r-l+1)-maxfreq;
        if (changes>k){
            m.put(a.charAt(l),m.get(a.charAt(l))-1);
         //   maxfreq=max(maxfreq,m.get(a.charAt(l)));
            l++;
       }
       else{
        maxlen=max(maxlen,r-l+1);
       }
       r++;
    }
    return maxlen;
}
public static int max(int a,int b){
    if (a<b){
        return b;
    }
    else{
        return a;
    }
}
}
