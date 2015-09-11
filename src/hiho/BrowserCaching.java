package hiho;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BrowserCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
        	int N = in.nextInt();
        	int M = in.nextInt();
        	in.nextLine();
        	LinkedHashMap<String,Integer> cacheList=new LinkedHashMap<String,Integer>();
        	for(int i=0;i<N;i++){
        		String url=in.nextLine();
        		if(cacheList.containsKey(url)){
        			System.out.println("Cache");
        			cacheList.remove(url);
        			cacheList.put(url, i);
        		}else{
        			if(cacheList.size()<M){
        				System.out.println("Internet");
        				cacheList.put(url, i);
        			}else{
        				System.out.println("Internet");
        				Iterator keys= cacheList.entrySet().iterator();
        				Map.Entry entry = (Map.Entry) keys.next(); 
        				String firstKey = (String) entry.getKey();
        				cacheList.remove(firstKey);
        				cacheList.put(url, i);
        			}
        		}
        	}
        }

	}

}
