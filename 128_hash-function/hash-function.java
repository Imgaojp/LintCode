/*
@Copyright:LintCode
@Author:   imgaojp
@Problem:  http://www.lintcode.com/problem/hash-function
@Language: Java
@Datetime: 16-10-22 07:46
*/

class Solution {
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        long ans=key[0];
        int len=key.length;
        for(int i=1;i<len;i++){
            // ans = (ans + key[i] %HASH_SIZE)*33;
            ans=ans*33%HASH_SIZE+key[i];
        }
        return (int)ans%HASH_SIZE;
    }
};