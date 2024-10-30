package vttp.batch5.sdf.task02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws Exception {

		String inputFile = args[0];

		if (args.length < 0)
			System.err.println("No TTT configuration file provided.");

		TicTacToe game = new TicTacToe();
	}
    
}
