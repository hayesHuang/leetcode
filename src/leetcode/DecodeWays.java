package leetcode;

public class DecodeWays {	
    public int numDecodings(String s) {
        if(s==null||s.length()==0) return 0;
        int size=s.length();
        int[] ways = new int[size];
        if(s.charAt(size-1)=='0'){
        	ways[size-1]=0;
        }else{
        	ways[size-1]=1;
        }
        if(s.length()==1) return ways[size-1];
        if(s.charAt(size-2)=='0'){
        	ways[size-2]=0;
        }else if(s.charAt(size-2)<'2'){
        	ways[size-2]=1+ways[size-1];
        }else if(s.charAt(size-2)=='2'&&s.charAt(size-1)<='6'){
        	ways[size-2]=1+ways[size-1];
        }else{
        	ways[size-2]=ways[size-1];
        }
        
        for(int i=size-3;i>=0;i--){
        	if(s.charAt(i)=='0'){
        		ways[i]=0;
        	}else if(s.charAt(i)<'2'){
            	ways[i]=ways[i+1]+ways[i+2];
            }else if(s.charAt(i)=='2'&&s.charAt(i+1)<='6'){
            	ways[i]=ways[i+1]+ways[i+2];
            }else{
            	ways[i]=ways[i+1];
            }
        }
        return ways[0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
