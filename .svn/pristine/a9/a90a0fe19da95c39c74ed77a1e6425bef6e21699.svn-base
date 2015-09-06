package leetcode;

import java.util.LinkedList;

public class ReverseInteger {
	public int reverse(int x) {
		int tmp=x;
		int reg=0;
		LinkedList arrays=new LinkedList();
		boolean negative=false;
		if(x<0){
			negative=true;
			tmp=-x;
		}
		
		do{
			reg=tmp%10;
			tmp=tmp/10;
			arrays.add(reg);
		}while(tmp>0);
		int result=0;
		for(int i=0;i<arrays.size();i++){
			result=result*10+(int)arrays.get(i);
		}
		if(negative){
			result=-result;
		}
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
