package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagrams {
	private String generateKey(String str){
		char[] strArray = str.toCharArray();
		Arrays.sort(strArray);
		return String.valueOf(strArray);
	}
    public List<String> anagrams(String[] strs) {
        HashMap<String,List> usedCharSetMap = new HashMap<String,List>();
        if(strs==null||strs.length==0) return new ArrayList();
        for(String str:strs){
        	String key = generateKey(str);
        	List anagramsList = usedCharSetMap.get(key);
        	if(anagramsList==null){
        		anagramsList = new ArrayList();
        		anagramsList.add(str);
        		usedCharSetMap.put(key, anagramsList);
        	}else{
        		anagramsList.add(str);
        	}
        }
        Set<String> keys = usedCharSetMap.keySet();
        List ans = new ArrayList();
        for(String key: keys){
        	List anagramsList = usedCharSetMap.get(key);
        	if(anagramsList.size()>1){
        		ans.addAll(anagramsList);
        	}
        }
        return ans;        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams test = new Anagrams();
		String[] strs = new String[]{"",""};
		List list = test.anagrams(strs);
		System.out.println(list);

	}

}
