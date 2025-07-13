
/*Time complexity for linear search will be in worst case: O(N) and in
best case: O(1). And space complexity will be O(1)
Linear search need not to be done in an sorted array as the case for binary search.
Here we just linearly searches the element by comparing each and every element that we face with 
the target element if the element is found then we return the index of target element. 
Thats what simply a linear search is..*/
package Step3_Searching_Techniques;

public class My_Linear_search {
    public static void main(String[] args){
    int a[]={5,1,4,9,2,7,3,10};
    int target=7;
    int index_of_target=linearsearch(a,target);
    System.out.println("The index position of target element is:"+index_of_target);
    }
    static int linearsearch(int[] a,int target){
        for(int i=0;i<a.length;i++){
            if (a[i]==target){
                return i;
            }
        }
        return -1;

    }
}
