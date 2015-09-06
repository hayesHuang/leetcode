package leetcode;

public class IntegertoRoman {
    public String intToRoman(int num) {
    	if(num>=5000) return "";
        char[] romanCharacter = new char[]{'I','V','X','L','C','D','M'};
        int[] intofCharacter = new int[]{1,5,10,50,100,500,1000};
        int[] numofCharacter=new int[7];
        String[] strofCharacter = new String[7];
        for(int i=6;i>=0;i=i-2){
        	numofCharacter[i]=num/intofCharacter[i];
        	num=num%intofCharacter[i];
        	if(numofCharacter[i]==9){
        		strofCharacter[i]=romanCharacter[i]+""+romanCharacter[i+2];
        	}else{
        		if(numofCharacter[i]>=5){
        			strofCharacter[i]=String.valueOf(romanCharacter[i+1]);
        			for(int j=numofCharacter[i]-5;j>0;j--){
        				strofCharacter[i]+=String.valueOf(romanCharacter[i]);
        			}
        		}else{
        			if(numofCharacter[i]==4){
        				strofCharacter[i]=romanCharacter[i]+""+romanCharacter[i+1];
        			}else{
        				strofCharacter[i]="";
        				for(int j=numofCharacter[i];j>0;j--){
            				strofCharacter[i]+=String.valueOf(romanCharacter[i]);
            			}
        			}
        		}
        	}
        }
        String res ="";
        for(int i=6;i>=0;i=i-2){
        	res+=strofCharacter[i];
        }
        return res;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
