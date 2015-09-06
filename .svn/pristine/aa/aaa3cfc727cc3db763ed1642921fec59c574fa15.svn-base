package leetcode;

public class MultiplyStrings {
	
    public String multiply(String num1, String num2) {
    	if(num1==null||num2==null||num1.length()==0||num2.length()==0) return "0";
    	char[] number1=num1.toCharArray();
    	char[] number2=num2.toCharArray();
    	int length1=number1.length;
    	int length2=number2.length;
    	int length3=length1+length2;
    	char[] number3= new char[length3];
    	for(int i=0;i<length3;i++){
    		number3[i]='0';
    	}
    	for(int i=length1-1;i>=0;i--){
    		int carry=0;
    		int numChar1=number1[i]-'0';
    		for(int j=length2-1;j>=0;j--){
    			int numChar2=number2[j]-'0';
    			int numChar3=number3[i+j+1]-'0';
    			int tmp=numChar1*numChar2+carry+numChar3;
    			if(tmp>=10){
    				carry=tmp/10;
    				tmp=tmp%10;
    			}else{
    				carry=0;
    			}
    			number3[i+j+1]=(char) ('0'+tmp);
    		}
    		int k=i;
    		while(carry>0){
    			int numChar3=number3[k]-'0';
    			int tmp=carry+numChar3;
    			if(tmp>=10){
    				carry=tmp/10;
    				tmp=tmp%10;
    			}else{
    				carry=0;
    			}
    			number3[k]=(char) ('0'+tmp);
    			k--;
    		}
    		
    	}
    	String num3 = new String(number3);
    	int i=0;
    	while(i<num3.length()&&num3.charAt(i)=='0'){
    		i++;
    	}
    	if(i==num3.length()){
    		i--;
    	}
        return num3.substring(i);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyStrings test = new MultiplyStrings();
		System.out.println(test.multiply("999", "0"));

	}

}
