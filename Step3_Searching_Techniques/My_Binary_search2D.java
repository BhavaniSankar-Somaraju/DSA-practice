
/*Time complexity for binary search will always be in worst case: O(logN) and in
best case: O(1)space complexity will be O(1)
Remember binary search will be performed when the array is sorted array. If array is not sorted 
first make the array sorted in either ascending or descending then perform binary search*/
package Step3_Searching_Techniques;
import java.util.Arrays;

public class My_Binary_search2D {
    public static void main(String[] args){
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=8;
        System.out.print(Arrays.toString(search(a,target)));

    }
static int[] rowsearch(int[][] a,int target,int r,int cstart,int cend){
    while(cstart<=cend){
        int cmid=(cstart+(cend-cstart)/2);
        if (a[r][cmid]==target){
            return new int[]{r,cmid};
        }
        else if(a[r][cmid]<target){
            cstart=cmid+1;
        }
        else{
            cend=cmid-1;
        }
    }return new int[]{-1,-1};
}
static int[] search(int[][] a,int target){
 int row=a.length,col=a[0].length;
 if (row==1){
    return rowsearch(a, target, 0, 0, col-1);
 }
 int rstart=0,rend=row-1,cmid=col/2;
 while(rstart<rend-1){
    int rmid=rstart+(rend-rstart)/2;
    if (a[rmid][cmid]==target){
        return new int[]{rmid,cmid};
    }
    else if (a[rmid][cmid]<target){
        rstart=rmid;
    }
    else{
        rend=rmid;
    }
 }

 //still no array is returned and we are left with only two rows then check if our element is present in any one of those rows
 if (target<=a[rstart][col-1]){
    return rowsearch(a, target, rstart, 0, col-1);
 }
 else if (target>a[rstart][col-1] && target<=a[rend][col-1]){
    return rowsearch(a, target, rend, 0, col-1);
 }
 
    return new int[]{-1,-1};
}
}
