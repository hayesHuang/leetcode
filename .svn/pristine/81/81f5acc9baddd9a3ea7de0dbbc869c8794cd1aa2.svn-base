package leetcode;

public class WordSearch {
	private boolean find=false;
	private void dfs(int i,int j,char[][] board, boolean[][] used, int index, String word){
		if(find) return;
		int m=board.length;
		int n=board[0].length;
		if(i<0||j<0||i==m||j==n||used[i][j]){
			return;
		}
		if(board[i][j]==word.charAt(index)) {
			if(index==word.length()-1){
				find = true;
				return;
			}
			used[i][j]=true;
			dfs(i-1,j,board,used,index+1,word);
			dfs(i,j-1,board,used,index+1,word);
			dfs(i+1,j,board,used,index+1,word);
			dfs(i,j+1,board,used,index+1,word);	
			used[i][j]=false;
		}
		
	}
    public boolean exist(char[][] board, String word) {
    	if(word==null||word.length()==0) return true;
    	if(board==null||board.length<=0||board[0].length<=0) return false;
    	int m=board.length;
    	int n=board[0].length;
    	boolean[][] used = new boolean[m][n];
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    	    	dfs(i,j,board,used,0,word);
    	    	if(find) return true;
    		}
    	}
    	return find;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[][]{{'a','a'},{'a','b'}};
//		char[][] board= new char[30][];
//		for(int i=0;i<30;i++){
//			board[i]="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toCharArray();
//		}
		String word = "baaa";
		WordSearch test = new WordSearch();
		boolean res = test.exist(board,word);
		System.out.println(res);

	}

}
