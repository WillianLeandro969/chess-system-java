package chass;

import BoardGame.Board;

public class ChassMatch {
	
	private Board board;
	
	public ChassMatch() {
		board = new Board(8, 8);
	}
	public ChasPiece[][] getPieces() {
		ChasPiece[][] mat = new ChasPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat[i][j] = (ChasPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
}
