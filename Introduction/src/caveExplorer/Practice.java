package caveExplorer;

public class Practice {

	public static void main(String[] args) {
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
		//randBirds(test);
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

	public static void printPic(String[][] arr) {
		for(String[] a : arr){
			for( String b: a){
				System.out.print(b);
			}
			System.out.println();
		}
		
	}
	
	public static void randBirds(String[][] arr){
		for(int i = 0; i < 5; i++){
			int randRow = (int)Math.random()*arr.length;
			int randCol = (int)Math.random()*arr[0].length;
			while(randRow > 7){
				randRow = (int)Math.random()*arr.length;
			}
			while(randCol > 9){
				randCol = (int)Math.random()*arr[0].length;
			}
			arr[randRow][randCol] = "O";
			arr[randRow][randCol+1] = "V";
			arr[randRow][randCol+2] = "O";
		}
		
	}
	
}
