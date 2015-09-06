package leetcode;

public class LongestCommonPrefix {

	private boolean isCharatIsame(String[] strs, int i){
		char c=strs[0].charAt(i);
		for(int j=1;j<strs.length;j++){
			if(c!=strs[j].charAt(i)){
				return false;
			}
		}
		return true;
	}
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0) return "";
        int short_str_length=strs[0].length();
        for(int i=1;i<strs.length;i++){
        	if(short_str_length>strs[i].length()){
        		short_str_length=strs[i].length();
        	}
        }
        int commonPrefixlength=-1;
        for(int i=0;i<short_str_length;i++){
        	if(isCharatIsame(strs,i)){
        		commonPrefixlength=i;
        	}else{
        		break;
        	}
        }
        String commonPrefix=strs[0].substring(0,commonPrefixlength+1);
        return commonPrefix;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"abccc","abbbb"};
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));

	}

}
