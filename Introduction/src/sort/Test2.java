package sort;

public class Test2 {

	private static boolean[][] snap;

	public static void main(String[] args) {
		snap = new boolean[5][5];
		print2DArray(snap);
		buttonClick(3,3);
		print2DArray(snap);
		buttonClick(3,3);
		print2DArray(snap);

	}

	public static void buttonClick(int r, int c) {
		if(r>0&&r<snap.length){
			switchRow(snap[r],c);
		}
		switchCol(snap,r,c);
		boolean win = true;
		A: for(int j = 0; j < snap.length;j++){
			for(int i = 0; i < snap[j].length;i++){
				if(snap[j][i]){
					win = false;
					break A;
				}
			}
		}
		if(win)System.out.println("You have solved the puzzle!");
	}

	private static void switchRow(boolean[] arr, int x){
		if(x>=0 && x<arr.length){
			for(int i = -1; i < 2; i++){
				if(x + i >=0 && x + i < arr.length){
					arr[x+i] = !arr[x+i];
				}
			}
		}
	}
	private static void switchCol(boolean[][] grid, int r, int c){
		switchIfValid(grid,r-1,c);
		switchIfValid(grid,r+1,c);
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r>=0&&r<grid.length&&c>=0&&c<grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}

	public static void print2DArray(boolean[][] arr){
		for(boolean[] b:arr){
			for(boolean a:b){
				if(a){
					System.out.print(" O ");
				}
				else{
					System.out.print(" X ");
				}
			}
			System.out.println();
		}
		System.out.println("- - - - - - - - -");
	}



}

