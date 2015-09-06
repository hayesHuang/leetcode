package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordLadder {
	
	
    public int ladderLength(String start, String end, Set<String> dict) {
    	HashSet<String> thisLevel = new HashSet<String>();
        thisLevel.add(start);
        int level=1;
        while(!thisLevel.isEmpty()){
        	HashSet<String> nextLevel = new HashSet<String>();
        	for(String str:thisLevel){
            	for(int i=0;i<str.length();i++){
            		StringBuilder sb=new StringBuilder(str);
            		for(char c='a';c<='z';c++){
            			sb.setCharAt(i, c);
            			String strnext=sb.toString();
            			if(strnext.equals(end)){
            				return level+1;
            			}else{
            				if(dict.contains(strnext)){
            					dict.remove(strnext);
            					nextLevel.add(strnext);
            				}
            			}
            		}
            	}
            }
        	level++;
        	thisLevel=nextLevel;
        }
        return 0;
        
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dicts ={"hot","dog","dot"};
		HashSet<String> set= new HashSet<String>(Arrays.asList(dicts));
		System.out.println(new WordLadder().ladderLength("hot", "dog", set));

	}

}
