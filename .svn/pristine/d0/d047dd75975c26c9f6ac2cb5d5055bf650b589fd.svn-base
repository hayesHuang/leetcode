package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Combinations {
	public void combine(List<List<Integer>> res, List<Integer> oneCombine, int n, int k){
		if(n<k) return;
		if(k==0){
			ArrayList<Integer> list = new ArrayList<Integer>(oneCombine);
			Collections.reverse(list);
			res.add(list);
			return;
		}
		combine(res,oneCombine,n-1,k);
		oneCombine.add(n);
		combine(res,oneCombine,n-1,k-1);
		oneCombine.remove(oneCombine.size()-1);
	}
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> oneCombine = new ArrayList<Integer>();
        combine(res,oneCombine,n,k);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
