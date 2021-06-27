/*
 * @lc app=leetcode id=1528 lang=java
 *
 * [1528] Shuffle String
 */

// @lc code=start
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            ch[indices[i]]= s.charAt(i);
            
        }
        String string = new String(ch);
        return string;
    }
}
// @lc code=end

