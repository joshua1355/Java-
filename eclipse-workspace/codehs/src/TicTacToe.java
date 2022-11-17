
public class TicTacToe {
	int[][] board = new int [][];
	
	private int turn;
	
	public int getTurn() {
		return turn;
	}
	public void printBoard() {
		
	}
	public boolean pickLoaction(int row, int col) {
		if(row<3 && col<3) {
			if(board[row][col] =="-") {
				return true;
			}
		}
		return false;
	}
	public void takeTurn(int row, int col) {
		if(turn%2 ==0) {
			board[row][col] ="x";
		}else {
			board[row][col] ="0";
		}
		turn++;
	}
	public boolean checkRow() {
		boolean win =false;
		for(int i=0; i<board.length; i++)
	}
	public boolean cheakCol() {
		
	}
}
