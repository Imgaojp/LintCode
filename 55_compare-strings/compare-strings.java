/*
@Copyright:LintCode
@Author:   imgaojp
@Problem:  http://www.lintcode.com/problem/compare-strings
@Language: Java
@Datetime: 16-10-22 06:56
*/

public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        int[] a=new int[26];
        int[] b=new int[26];
        // write your code here
        // for(int i=0;i<B.length;i++){
        //     char c=B.charAt(i);
        //     if(!findInA(c,A))
        //         return false;
        // }
        countNum(a,A);
        countNum(b,B);
        for(int j=0;j<26;j++){
            if(a[j]<b[j])
                return false;
        }
        return true;
    }
    // public boolean findInA(char c,String A){
    //     for(int i=0;i<A.length;i++){
    //         if(c==A.charAt(i)){
    //             return true;
    //         }
    //     }
    //      return false;
    // }
    public void countNum(int [] c,String d){
        for(int i=0;i<d.length();i++){
            c[d.charAt(i)-'A']++;
        }
    }
}