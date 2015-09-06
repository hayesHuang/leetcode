package leetcode;

public class ContainerWithMostWater {
	public int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
	public int maxArea(int[] height) {
		int i=0,j=height.length-1;
		int maxArea=min(height[i],height[j])*(j-i);
		while(i<j){
			if(height[i]<height[j]){
				i++;
			}else{
				j--;
			}
			int tmpArea=min(height[i],height[j])*(j-i);
			if(tmpArea>maxArea)maxArea=tmpArea;
		}
		return maxArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
