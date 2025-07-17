/*Two pointer problem: Two pointer is similar to the sliding window kind of problem. May be the noticeable 
between them is in this Two pointer problem we do the problem by assigning two variables on both sides of the
array. while in sliding window problem the variables start from the same side that is from the left.
The below is an example of container problem in two pointer.
This problem may understand to you

You are given an integer array height of length n. There are n vertical lines drawn such that the two 
endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.

Notice that you may not slant the container.
Example 1:

8 |   █           █
7 |   █           █           █
6 |   █   █       █           █
5 |   █   █   █   █           █
4 |   █   █   █   █ █         █
3 |   █   █   █   █ █     █   █
2 |   █   █ █ █   █ █     █   █
1 | █ █   █ █ █   █ █     █   █
--+---------------------------------
  | 0 1 2 3 4 5 6 7 8  (Indices)
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1*/

package Step4_SlidingWIndow_and_TwoPointer_Approach;

public class Two_pointer_problem {
public static void main(String[] args){
    int[] a={1,8,6,2,5,4,8,3,7};
    System.out.println("Maximum possible area is:"+maxArea(a));
}
    public static int maxArea(int[] a) {
        int l=0,r=a.length-1,maxarea=Integer.MIN_VALUE,len=0,area=0;
        while (l<r){
            if (a[l]<a[r]){
                len=r-l;
                area=len*a[l];
                l++;
            }
            else{
                len=r-l;
                area=len*a[r];
                r--;
            }
            if (maxarea<area){
                maxarea=area;
            }
        }return maxarea;
    }
}
