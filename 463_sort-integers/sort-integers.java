/*
@Copyright:LintCode
@Author:   imgaojp
@Problem:  http://www.lintcode.com/problem/sort-integers
@Language: Java
@Datetime: 16-10-22 06:17
*/

public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        // Write your code here
        for(int i=0;i<A.length;i++){
            int k=0;
            for(int j=0;j<A.length-k-1;j++){
                if(A[j]>A[j+1]){
                    int temp;
                    temp=A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
            k++;
        }
    }
}