package leetcode;

public class CountandSay {
	public String readoff(String lastSequence) {
        char last;
        char c=lastSequence.charAt(0);
        int count=1;
        StringBuilder result= new StringBuilder();
        for(int i=1;i<lastSequence.length();i++){
        	last=c;
        	c=lastSequence.charAt(i);
        	if(c==last){
        		count++;
        	}else{
        		result.append(Integer.toString(count)+last);
        		count=1;
        	}
        }
        result.append(Integer.toString(count)+c);
        return result.toString();
    }
	public String countAndSay(int n) {
		if(n<1) return null;
		String str="1";
		for(int i=1;i<n;i++){
			str=readoff(str);
		}
        return str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<20;i++){
			System.out.println(new CountandSay().countAndSay(i));
		}
		

	}

}
