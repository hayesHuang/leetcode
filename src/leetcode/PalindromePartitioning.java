package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	private List<List<String>> ans = new ArrayList<List<String>>();

	private boolean isPalindrome(String s,int begin,int end){
		while(begin<=end){
			if(s.charAt(begin)==s.charAt(end)){
				begin++;
				end--;
			}else{
				return false;
			}
		}
		return true;
	}
	
	private void dfs(String s, int begin, char[][] palindromeMap,List<String> array){
		if(begin==s.length()) ans.add(array);
		for(int i=begin;i<s.length();i++){
			if(palindromeMap[begin][i]==1){
				List<String> tmp=new ArrayList<String>(array);
				tmp.add(s.substring(begin,i+1));
				dfs(s,i+1,palindromeMap,tmp);
			}
		}
	}
	
	public List<List<String>> partition(String s) {
        if(s.length()==0) return ans;
        char[][] palindromeMap=new char[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
        	for(int j=i;j<s.length();j++){
        		if(isPalindrome(s,i,j)){
        			palindromeMap[i][j]=1;
        		}
        	}
        }
        dfs(s,0,palindromeMap,new ArrayList<String>());
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "01234567";
		System.out.println(test.substring(6,8));
		new PalindromePartitioning().partition("bb");

	}

}
