package leetcode;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
    	String[] v1 = null,v2 = null;
    	if(version1.contains(".")){
    		v1 =version1.split("\\.");
    	}else{
    		v1=new String[]{version1};
    	}
        if(version2.contains(".")){
        	v2 =version2.split("\\.");
        }else{
        	v2=new String[]{version2};
        }
        int i=0;
        for(i=0;i<v1.length&&i<v2.length;i++){
        	int section1=Integer.parseInt(v1[i]);
        	int section2=Integer.parseInt(v2[i]);
        	if(section1<section2){
        		return -1;
        	}else if(section1>section2){
        		return 1;
        	}
        }
        while(i<v1.length||i<v2.length){
        	if(i<v1.length){
        		int section1=Integer.parseInt(v1[i]);
        		if(section1>0){
        			return 1;
        		}
        		i++;
        	}else{
        		int section2=Integer.parseInt(v2[i]);
        		if(section2>0){
        			return -1;
        		}
        		i++;
        	}
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result= new CompareVersionNumbers().compareVersion("1.0", "1.1");
		System.out.println(result);
	}

}
