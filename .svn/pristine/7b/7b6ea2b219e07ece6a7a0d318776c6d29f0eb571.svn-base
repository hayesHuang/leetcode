package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
	
	private void ipAddress(List<String> res,String s,String ip,int section){
		if(section*3<s.length()||s.length()<1) return;
		if(section==1&&Integer.parseInt(s)<256){
			if(s.length()>1&&s.startsWith("0")){
				return;
			}else{
				ip+="."+s;
				res.add(ip);
				return;
			}
			
		}
		if(section==4){
			if(s.length()>1){
				ipAddress(res,s.substring(1),s.substring(0,1),section-1);
			}
			if(!s.startsWith("0")){
				if(s.length()>2){
					ipAddress(res,s.substring(2),s.substring(0,2),section-1);
				}
				if(s.length()>3&&Integer.parseInt(s.substring(0,3))<256){
					ipAddress(res,s.substring(3),s.substring(0,3),section-1);
				}
			}
			
		}else{
			if(s.length()>1){
				ipAddress(res,s.substring(1),ip+"."+s.substring(0,1),section-1);
			}
			if(!s.startsWith("0")){
				if(s.length()>2){
					ipAddress(res,s.substring(2),ip+"."+s.substring(0,2),section-1);
				}
				if(s.length()>3&&Integer.parseInt(s.substring(0,3))<256){
					ipAddress(res,s.substring(3),ip+"."+s.substring(0,3),section-1);
				}
			}
			
		}
		
	}
	
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        ipAddress(res,s,"",4);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
