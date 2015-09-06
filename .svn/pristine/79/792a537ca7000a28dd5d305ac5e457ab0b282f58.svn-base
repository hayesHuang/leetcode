package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
		if(s==null||"".equals(s)) return 0;
		int length=s.length();
		int i=0,j=0;
		int maxLength=0;
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
        while(j<length){
        	char c=s.charAt(j);
        	Integer index = charMap.get(c);
        	if(index==null||index<i){
        		charMap.put(c, j);
        		int tmpLength=j-i+1;
        		if(tmpLength>maxLength)maxLength=tmpLength;
        	}else{
        		charMap.put(c, j);
        		int tmpLength=j-index;
        		if(tmpLength>maxLength)maxLength=tmpLength;
        		i=index+1;
        	}
        	j++;
        }
        return maxLength;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco";
		int res= new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
		System.out.println(res);
			

	}

}
