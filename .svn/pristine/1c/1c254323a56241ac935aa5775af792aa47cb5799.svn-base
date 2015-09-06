package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        Vector<Integer> digitsVector = new Vector<Integer>();
        for(int digit:digits){
        	digitsVector.add(digit);
        }
        for(int i=digitsVector.size()-1;i>=0;i--){
        	int tmp = digitsVector.get(i)+1;
        	if(tmp<10){
        		digitsVector.set(i, tmp);
        		break;
        	}else{
        		tmp=0;
        		digitsVector.set(i, tmp);
        		if(i==0){
        			digitsVector.add(0, 1);
        		}
        	}
        }
        int[] result = new int[digitsVector.size()];
        for(int i=0;i<digitsVector.size();i++){
        	result[i]=digitsVector.get(i);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
