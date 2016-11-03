package caveExplorer;

public class Practice {

	public static void main(String[] args) {
		boolean [][] mines = new boolean [6][6];
		createMines(mines, 10);
		String [][] field = new String[mines.length][mines[0].length];
		matchValues(field, mines);
		printPic(field);
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		// TODO Auto-generated method stub
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[row].length;col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}
				else{
					field[row][col] = countAdjacent(mines,row,col);
				}
			}
		}
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		// TODO Auto-generated method stub
		// r and c represent coordinates of element we are providing a String for
		int count = 0;
		//loop through row above to row below 
		for(int row = r-1; row <= r+1; row++){
			//loop through col left to col right
			for(int col = c-1; col <= c+1;col++){
				if(row!=r && col!=c){
					if(row>=0 && row < mines.length && col >=0 && col < mines[row].length ){
						
					}
				}
			}
		}	
		return null;
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		// TODO Auto-generated method stub
		while(numberOfMines > 0){
			int row = (int)Math.random()*mines.length;
			int col = (int)Math.random()*mines.length;
			if(mines[row][col]){
				mines[row][col] = true;
				numberOfMines --;
			}
		}
		
	}

	public static void printPic(String[][] arr) {
		for(String[] a : arr){
			for( String b: a){
				System.out.print(b);
			}
			System.out.println();
		}
		
	}
	
	public static void picDrawing(){
		String[][] test = new String[10][12];
		for(int row = 0; row < test.length; row++){
			for(int col = 0; col < test[row].length;col++){
				test[row][col] = " ";
			}
		}
		
		for(int row = 7; row < test.length; row++){
			for(int col = 0; col < test[row].length;col++){
				test[row][col] = "M";
			}
		}
		test[1][2] = "O";
		test[0][2] = "|";
		test[2][2] = "|";
		test[1][1] = "-";
		test[1][3] = "-";
		test[0][1] = "\\";
		test[2][3] = "\\";
		test[0][3] = "/";
		test[2][1] = "/";
		
		//top row is "_"
		for(int col = 0; col < test[0].length;col++){
			test[0][col] = "_";
			test[test.length-1][col] = "_";
		}
		//left and right col is "|"
		for(int row = 1; row < test.length; row++){
			test[row][0]= "|";
			test[row][test[row].length-1] = "|";
		}
		
		printPic(test);
	}
}
