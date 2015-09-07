package leetcode;

public class AddDigits {
	private int sumDigits(int num){
		int sum=0;
		while(num>9){
			sum+= num%10;
			num/=10;
		}
		sum+=num;
		return sum;
	}
	
    public int addDigits(int num) {
        while(num>9){
        	num=sumDigits(num);
        }
        return num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ok");
	}

}
