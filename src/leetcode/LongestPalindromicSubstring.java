package leetcode;

public class LongestPalindromicSubstring {
	private String lengthofPalindrome(String s, int left, int right){
		if(left==right||left==right-1){
			if(s.charAt(left)!=s.charAt(right)){
				return "";
			}
		}else{
			return "";
		}
		while(left>0&&right<s.length()-1){
			if(s.charAt(left-1)==s.charAt(right+1)){
				left--;
				right++;
			}else{
				return s.substring(left,right+1);
			}
		}
		return s.substring(left,right+1);
	}
	
	private String lengthofPalindrome(String s, int middle){
		return lengthofPalindrome(s,middle,middle);
	}
    public String longestPalindrome(String s) {
    	String longest="";
    	for(int i=0;i<s.length()-1;i++){
    		String tmp=lengthofPalindrome(s,i,i+1);
    		if(tmp.length()>longest.length()){
    			longest=tmp;
    		}
    	}
    	for(int i=0;i<s.length();i++){
    		String tmp=lengthofPalindrome(s,i);
    		if(tmp.length()>longest.length()){
    			longest=tmp;
    		}
    	}
    	return longest;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new LongestPalindromicSubstring().longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(s);
	}

}
