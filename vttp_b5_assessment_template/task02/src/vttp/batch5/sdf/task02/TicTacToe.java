package vttp.batch5.sdf.task02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TicTacToe {

    private String inputFile;
    private char[][] board = null;
    private int width = 0;
    private int height = 0;
    private char currentPlayer;
    
    public TicTacToe(char [][] b){
        board = b;
        b = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '';
            }
        currentPlayer = 'X'; 
        }
    }

	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			System.out.print(" " + board[i][0] + board[i][1] + board[i][2] + " ");
			if (i < 2)
				System.out.println("\n");
			}
		}

	public String getUtility(){
		for (int i = 0; i < 3; i++) {
			if ((board[0][0] == player)) {
				return 0;
			} else if ((board[1][0] == player || board[1][2] == player )) {
				return -1;
		    } else if ((board[2][2]) == player)) {
				return 1;
			}
        }   
    }

    public void readFile() throws Exception {

        try(BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			String line;
			while ((line = br.readLine()) != null)
				String[] values = line.trim();

		} catch (IOException e) {
			System.out.println("Error reading file:" + e.getMessage());
		}
    }

}
