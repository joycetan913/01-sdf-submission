package vttp.batch5.sdf.task02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	
	public static void main(String[] args) throws Exception {

		String inputFile = args[0];

		if (args.length < 0)
			System.err.println("No TTT configuration file provided.");

		try(BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			String line;
			while ((line = br.readLine()) != null)
				String[] values = line.split("");

		} catch (IOException e) {
			System.out.println("Error reading file:" + e.getMessage());
		}

		char [][]board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '.';
            }
        }
        currentPlayer = 'X'; // X starts first
    

    	public void printBoard() {
        	for (int i = 0; i < 3; i++) {
             	System.out.print(board[i][0] + board[i][1] + board[i][2]);
            	if (i < 2)
                	System.out.println("\n-----------");
			}
    	}
    
	
	}
}
