package vttp.batch5.sdf.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vttp.batch5.sdf.task01.models.BikeEntry1;

// Use this class as the entry point of your program

public class Main {

	public static void main(String[] args) {

		String inputFile = args[0];
        Map<String, Integer> positionsMap = new HashMap<>();

		try(BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
			while ((line = br.readLine()) != null)
				String[] values = line.split(",");
                if (values.length < 10) {
                    System.out.println("Skipping incomplete line: " + line);
                    continue;
                }  


            String highestPosition = null;
            int highestCount = 0;
            for (int count) {
                if (entry.getValue() > highestCount) {
                    highestCount = entry.getValue();
                    highestCountry = entry.getKey();
            int[] totalSum = values.getTotal();


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return; 
        }

    public String readPara(){
        System.out.println("The " + position + "recorded number of cyclists was in" + season +", on a " + weekday 
        + "in the month of " + month + ". " 
        + "There were a total of " + total + "cyclist. The weather was " + weather + ". " + day + "was not a holiday.")

	}

}

}
