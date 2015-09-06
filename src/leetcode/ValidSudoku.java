package leetcode;

import java.util.HashSet;

public class ValidSudoku {
	public boolean isValidBlock(char[][] borad,int start_row,int start_col){
		HashSet<Character> numset=new HashSet<Character>();
		for(int j=start_row;j<start_row+3;j++){
			for(int i=start_col;i<start_col+3;i++){
				if(borad[j][i]!='.'){
					if(borad[j][i]>='0'&&borad[j][i]<='9'){
						if(!(numset.add(borad[j][i]))){
							return false;
						}
					}else{
						return false;
					}
					
				}
			}
		}
		return true;
	}
	public boolean isAllrowValid(char[][] board){
		for(int j=0;j<9;j++){
			HashSet<Character> numset=new HashSet<Character>();
			for(int i=0;i<9;i++){
				if(board[j][i]!='.'){
					if(board[j][i]>='0'&&board[j][i]<='9'){
						if(!(numset.add(board[j][i]))){
							return false;
						}
					}else{
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean isAllcolValid(char[][] board){
		for(int i=0;i<9;i++){
			HashSet<Character> numset=new HashSet<Character>();
			for(int j=0;j<9;j++){
				if(board[j][i]!='.'){
					if(board[j][i]>='0'&&board[j][i]<='9'){
						if(!(numset.add(board[j][i]))){
							return false;
						}
					}else{
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public boolean isDiagonalValid(char[][] board){
		HashSet<Character> numset=new HashSet<Character>();
		for(int i=0;i<9;i++){
			if(board[i][i]!='.'){
				if(board[i][i]>='0'&&board[i][i]<='9'){
					if(!(numset.add(board[i][i]))){
						return false;
					}
				}else{
					return false;
				}
			}
		}
	    numset=new HashSet<Character>();
		for(int i=0;i<9;i++){
			if(board[i][8-i]!='.'){
				if(board[i][8-i]>='0'&&board[i][8-i]<='9'){
					if(!(numset.add(board[i][8-i]))){
						return false;
					}
				}else{
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isValidSudoku(char[][] board) {
        if(board.length==9){
        	for(int i=0;i<9;i++){
        		if(board[i].length!=9){
        			return false;
        		}
        	}
        }else{
        	return false;
        }
        for(int j=0;j<9;j=j+3){
        	for(int i=0;i<9;i=i+3){
        		if(!isValidBlock(board,j,i)){
        			return false;
        		}
        	}
        }
        if(!isAllrowValid(board)){
        	return false;
        }
        if(!isAllcolValid(board)){
        	return false;
        }
        return true;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
