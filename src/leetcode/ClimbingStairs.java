package leetcode;

public class ClimbingStairs {
//    public int climbStairs(int n) {
//       
//       if(n>2){
//    	   return climbStairs(n-1)+climbStairs(n-2);
//       }else{
//    	   if(n==1) return 1;
//           if(n==2) return 2;
//           return 0;
//       }
//      
//    }
	public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=n;i++){
        	c=a+b;
        	a=b;
        	b=c;
        }
        return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(new ClimbingStairs().climbStairs(44));
	}

}
