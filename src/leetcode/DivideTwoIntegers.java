package leetcode;

public class DivideTwoIntegers {
	private long absDivide(long dividend, long divisor){
		if(divisor>dividend) return 0;
		int k=0;
		long res=0;
		while(divisor<=dividend){
			divisor=divisor<<1;
			k++;
		}
		divisor=divisor>>1;
		k--;
		for(;k>=0;k--){
			if(dividend>=divisor){
				res+=Math.pow(2, k);
				dividend=dividend-divisor;
			}
			divisor=divisor>>1;
		}
		return res;
	}
	public int divide(int dividend, int divisor) {
		if(divisor==0) return Integer.MAX_VALUE;
		boolean isNegative=false;
		if((dividend>0&&divisor<0)||(dividend<0&&divisor>0)){
			isNegative=true;
		}
		long dividendAbs=Math.abs((long)dividend);
		long divisorAbs=Math.abs((long)divisor);
        long res=absDivide(dividendAbs,divisorAbs);
        if(isNegative){
        	res=-res;
        }
        if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideTwoIntegers a = new DivideTwoIntegers();
		int res = a.divide(-2147483648, -1);
		System.out.println(res);

	}

}
