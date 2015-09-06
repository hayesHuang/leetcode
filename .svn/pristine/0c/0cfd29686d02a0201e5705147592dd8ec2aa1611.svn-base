package leetcode;

import java.util.Hashtable;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
        Hashtable<Integer,Integer> nums = new Hashtable<Integer,Integer>();
        int[] result = new int[2];
        for(int i=0;i<numbers.length;i++){
        	Integer n=nums.get(numbers[i]);
        	if(n==null)nums.put(numbers[i], i);
        	n=nums.get(target-numbers[i]);
        	if(n!=null&&n<i){
        		result[0]=n+1;
        		result[1]=i+1;
        		return result;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new TwoSum().twoSum(new int[]{0,4,3,0}, 0);
		System.out.println(a[0]+"\t"+a[1]);

	}

}
