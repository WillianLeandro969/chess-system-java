package chass;

import BoardGame.Board;
import BoardGame.Piece;

public class ChasPiece extends Piece {
	
	private Color color;

	public ChasPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
