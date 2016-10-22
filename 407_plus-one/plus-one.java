/*
@Copyright:LintCode
@Author:   imgaojp
@Problem:  http://www.lintcode.com/problem/plus-one
@Language: Java
@Datetime: 16-10-22 08:12
*/

public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        boolean flag=true;
        int len=digits.length;
        int a[]=new int[len+1];
        for(int i=len-1;i>=0;i--){
            if(digits[i]==9&&flag){
                digits[i]=0;
                flag=true;
            }else if(digits[i]!=9&&flag) {
                digits[i]=digits[i]+1;
                flag=false;
            }else{
                digits[i]=digits[i];
                flag=false;
            }
            a[i+1]=digits[i];
            if(i==0&&flag){
                a[0]=1;
                return a;
            }
        }
        return digits;
    }
}