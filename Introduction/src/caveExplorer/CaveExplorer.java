package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static CaveRoom caves[][];
	private static Scanner in;
	public static CaveRoom currentRoom;
	private static Inventory inventory;
	
	public static void main(String[] args){
		
		caves = new CaveRoom[5][5];
		for(int row = 0; row < caves.length;row++){
			for(int col = 0; col < caves[row].length;col++){
				caves[row][col] = new CaveRoom("This cave has coordinates ("+row+","+col+")");
			}
		}
		currentRoom = caves[0][1];
		currentRoom.enter();
		caves[0][1].setConnection(CaveRoom.EAST,caves[0][2],new Door());
		caves[0][2].setConnection(CaveRoom.SOUTH,caves[1][2],new Door());
		caves[1][2].setConnection(CaveRoom.SOUTH,caves[2][2],new Door());
		inventory = new Inventory();
		startExploring();
	}

	private static void startExploring(){
		while(true){
			printMap();
			System.out.println(inventory.getDescription());
			
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
	}
	public static void printMap(){
		//TODO HOMEWORK FINISH THIS 
		String[][] test = new String [(caves.length*2)+1][(caves[0].length*2)+1];
		for(int row = 0; row < test.length;row++){
			if(row%2==0){
				for(int col = 0; col < test[row].length;col++){
					test[row][col] = "_";
					if(row!=0&&col%2==0){
						test[row][col] = "|";
					}
				}
			}
			else{
				for(int col = 0; col < test[row].length;col++){
					if(col%2==0){
						test[row][col] = "|";
					}
					else if (currentRoom == caves[(row-1)/2][(col-1)/2]){
						test[row][col] = "X";
					}
					else{
						test[row][col] = " ";
					}
				}
			}

		}
		printPic(test);
	}
	
	private static void printPic(String[][] arr) {
		for(String[] a : arr){
			for( String b: a){
				System.out.print(b);
			}
			System.out.println();
		}
		
	}
}
