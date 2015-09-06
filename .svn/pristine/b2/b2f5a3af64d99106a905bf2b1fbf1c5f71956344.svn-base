package leetcode;

public class ValidPalindrome {
	public boolean isAlphanumeric(char c){
		if((c>='A'&&c<='Z')||(c>='a'&&c<='z')||(c>='0'&&c<='9')){
			return true;
		}else{
			return false;
		}
	}
	public boolean isPalindrome(String s) {
		if(s==null||"".equals(s)){
			return true;
		}else{
			StringBuilder sb=new StringBuilder();
			for(char c:s.toCharArray()){
				if(isAlphanumeric(c)){
					sb.append(c);
				}
			}
			String valid_s=sb.toString().toLowerCase();
			String valid_sr= sb.reverse().toString().toLowerCase();
			if(valid_s.equals(valid_sr)){
				return true;
			}else{
				return false;
			}
			
		}
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new ValidPalindrome().isPalindrome("aA"));
	}

}
