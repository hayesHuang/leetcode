package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
	private List<String> list = new ArrayList<String>();
	private String digitsStr;
	String[] map = new String[10];  
	private void combine(String str, int index,int length){
		int ifomap=digitsStr.charAt(index)-'0';
		String mapstr = map[ifomap];
		if(index==length-1){
			for(char c:mapstr.toCharArray()){
				list.add(str+c);
			}
		}else{
			for(char c:mapstr.toCharArray()){
				combine(str+c, index+1,length);
			}
		}
		
	}
	public List<String> letterCombinations(String digits) {		
        map[0] = "";  
        map[1] = "";  
        map[2] = "abc";  
        map[3] = "def";  
        map[4] = "ghi";  
        map[5] = "jkl";  
        map[6] = "mno";  
        map[7] = "pqrs";  
        map[8] = "tuv";  
        map[9] = "wxyz";  
        digitsStr=digits;
        int length=digits.length();
        if(length>0){
        	combine("", 0,length);
        }else{
        	list.add("");
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCombinationsofaPhoneNumber test= new LetterCombinationsofaPhoneNumber();
		test.letterCombinations("2");

	}

}
