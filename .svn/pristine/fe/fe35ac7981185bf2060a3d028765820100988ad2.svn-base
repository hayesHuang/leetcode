package leetcode;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
    	if(path.equals("/")) return path;
        if(path.endsWith("/")){
        	path=path.substring(1,path.length()-1);
        }else{
        	path=path.substring(1);
        }
        String[] paths=path.split("/");
        Stack<String> absPath = new Stack<String>();
        for(String str:paths){
        	if(str.equals(".")||str.length()==0){
        		continue;
        	}else if(str.equals("..")){
        		if(!absPath.isEmpty()){
        			absPath.pop();
        		}
        	}else{
        		absPath.push(str);
        	}
        }
        if(absPath.isEmpty()){
        	return "/";
        }
        StringBuilder absPathStr = new StringBuilder();
        for(String str:absPath){
        	absPathStr.append("/");
        	absPathStr.append(str);
        }
        return absPathStr.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
