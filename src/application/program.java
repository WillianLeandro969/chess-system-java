package application;

import chass.ChassMatch;

public class program {

	public static void main(String[] args) {
		
		ChassMatch chessMatch = new ChassMatch();
		UI.printBoar(chessMatch.getPieces());
	}

}
