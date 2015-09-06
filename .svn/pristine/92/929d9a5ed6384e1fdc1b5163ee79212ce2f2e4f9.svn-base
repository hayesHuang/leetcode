package leetcode;

public class Pow {
    public double pow(double x, int n) {
    	if(x==0) return 0;
    	if(n==0) return 1;
    	boolean negative = false;
    	long nLong = (long)n;
    	if(n<0){
    		negative = true;
    		nLong = Math.abs(nLong);
    	}
    	int size = (int) (Math.log(nLong)/Math.log(2))+1;
    	long[] index = new long[size];
    	double[] value = new double[size];
    	index[0]=1;
    	value[0] = x;
    	for(int i=1;i<size;i++){
    		index[i]=index[i-1]*2;
    		value[i]=value[i-1]*value[i-1];
    	}
    	double res=1;
    	for(int i=size-1;i>=0;i--){
    		if(nLong>=index[i]){
    			res=res*value[i];
    			nLong=nLong-index[i];
    		}
    	}
    	if(negative){
    		res=1/res;
    	}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow test = new Pow();
		double res = test.pow( -1.00000, -2147483648);
		

	}

}
