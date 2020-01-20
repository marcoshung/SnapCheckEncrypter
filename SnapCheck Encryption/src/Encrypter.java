//Marcos Hung
/*This program creates a encrypted message from user input (w/o whitespace) by creating a grid with dimensions:
 * floor(sqrt(x)) <= row <= column <= ceiling(sqrt(x)), where x = length of input.
 * The encrypted message is formed by printing the column values then a space followed by the next column values
 */
public class Encrypter {
	
	//2D array that represents the grid
	char[][] encrypted;
	
	//final encoded message
	String encoded;
	
	public Encrypter(String input) {
		//takes out any whitespace
		input = input.replaceAll("\\s", "");
		createGrid(input);
		encoded = getEncodedMessage();
	}
	
	//creates a 2D array to represent the grid of the string input
	private void createGrid(String input) {
		
		//sets dimensions of the 2D array
		int row = (int) Math.floor(Math.sqrt(input.length()));
		int column = (int) Math.ceil(Math.sqrt(input.length()));
		
		if(row * column < input.length()) {
			row++;
		}
		//the new encrypted string will be stored here
		encrypted = new char[row][column];
		
		//loads the inputed string into the 2D array
		for(int i = 0; i < input.length(); i++) {
			int colPos = i % column;
			int rowPos = i/column;
			encrypted[rowPos][colPos] = input.charAt(i);
		}	
	}
	
	//returns a string with the encryption pattern
	private String getEncodedMessage() {
		String value = "";
		//column value
		for(int i = 0; i < encrypted[0].length; i++) {
			//row value
			for(int j = 0; j < encrypted.length; j++) {
				value += encrypted[j][i];
			}
			value += " ";
		}
		return value.trim();
	}
	
	
}	
