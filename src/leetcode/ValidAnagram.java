package leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length()) return false;
        char[] sArray=s.toCharArray();
        char[] tArray=t.toCharArray();
        HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
        for(char c:sArray){
        	if(hashmap.containsKey(c)){
        		hashmap.put(c, hashmap.get(c)+1);
        	}else{
        		hashmap.put(c,1);
        	}
        }
        for(char c:tArray){
        	if(hashmap.containsKey(c)){
        		int num =hashmap.get(c);
        		if(num>0){
        			hashmap.put(c,num-1);
        		}else{
        			return false;
        		}
        	}else{
        		return false;
        	}
        }
        return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
