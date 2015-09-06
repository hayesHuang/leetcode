package leetcode;

public class RomantoInteger {
	public boolean isLittleLeft(char left,char right){
		if(left=='I'){
			if(right=='V'||right=='X'){
				return true;
			}else{
				return false;
			}
		}else if(left=='X'){
			if(right=='L'||right=='C'){
				return true;
			}else{
				return false;
			}
		}else if(left=='C'){
			if(right=='D'||right=='M'){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	public int rchar2Int(char c){
		int weight;
		switch(c){
		case 'I': weight=1;break;
		case 'V': weight=5;break;
		case 'X': weight=10;break;
		case 'L': weight=50;break;
		case 'C': weight=100;break;
		case 'D': weight=500;break;
		case 'M': weight=1000;break;
		default :weight=0;
		}
		return weight;
	}
	
	 public int romanToInt(String s) {
		int result=0;
		char[] romanArray=s.toCharArray();
		for(int i=0;i<romanArray.length-1;i++){
			if(isLittleLeft(romanArray[i],romanArray[i+1])){
				result=result-rchar2Int(romanArray[i]);
			}else{
				result=result+rchar2Int(romanArray[i]);
			}
		}
		result=result+rchar2Int(romanArray[romanArray.length-1]);
		return result;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
