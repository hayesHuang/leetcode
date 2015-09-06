package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
    public void solve(char[][] board) {
        if(board==null||board.length==0) return;
        int m=board.length;
        int n=board[0].length;
        Queue<Integer> queue=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
        	if(board[0][i]=='O'){
        		queue.add(i);
        		board[0][i]='V';
        	}
        	if(board[m-1][i]=='O'){
        		queue.add((m-1)*n+i);
        		board[m-1][i]='V';
        	}
        }
        for(int j=0;j<m;j++){
        	if(board[j][0]=='O'){
        		queue.add(j*n);
        		board[j][0]='V';
        	}
        	if(board[j][n-1]=='O'){
        		queue.add(j*n+n-1);
        		board[j][n-1]='V';
        	}
        }
        int[][] dir=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty()){
        	int index=queue.poll();
        	int x=index%n;
        	int y=index/n;
        	for(int[] direction:dir){
        		int next_x=x+direction[0];
        		int next_y=y+direction[1];
        		if(next_x>0&&next_x<n&&next_y>0&&next_y<m&&board[next_y][next_x]=='O'){
        			queue.add(next_y*n+next_x);
        			board[next_y][next_x]='V';
        		}
        	}
        }
        for(int j=0;j<m;j++){
        	for(int i=0;i<n;i++){
        		if(board[j][i]=='V'){
        			board[j][i]='O';
        		}else if(board[j][i]=='O'){
        			board[j][i]='X';
        		}
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
