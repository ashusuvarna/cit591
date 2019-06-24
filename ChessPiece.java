/**
 * This is a default ChessPiece class created for MCIT CIT-591 course
 * at University of Pennsyalvania
 * Just another comment for version 2 change
 */

/**
 * @author Ashu Suvarna
 *
 */
public class ChessPiece {

	String color;
	String type;
	
	public ChessPiece(String pColor, String pType) {
		
		this.color = pColor;
		this.type = pType;
	}
	
	public statis void main(String args[]){
		
		ChessPiece blackPawn1 = new ChessPiece("Black", "Pawn");
		System.out.println("Color of the new chess piece is: " + blackPawn1.color);
		System.out.println("Type of the new chess piece is: " + blackPawn1.type);
	}
	
}
