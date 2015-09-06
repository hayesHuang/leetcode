package leetcode;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
    	s=s.trim();
        String[] stringArrays = s.split("\\s+");
        StringBuilder sb= new StringBuilder();
        if(stringArrays.length>0)sb.append(stringArrays[stringArrays.length-1]);
        for(int i=stringArrays.length-2;i>=0;i--){
        	sb.append(" ");
        	sb.append(stringArrays[i]);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1    1";
		s=s.trim();
		String[] stringarray=s.split("\\s+");
		System.out.println(stringarray.length);

	}

}
