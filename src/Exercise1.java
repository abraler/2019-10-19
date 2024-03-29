//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
/*
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        Map<Character,Integer>map=new HashMap<>();
        int max=0;
        int left=0;
        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
                }
                map.put(s.charAt(i),i);
                max=Math.max(max,i-left+1);

        }
        return  max;
    }
}
