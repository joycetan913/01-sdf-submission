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
            
                int total = entry.getTotal();
                int currentCount = positionsMap.getOrDefault(total, 0);
                currentCount++;
                positionsMap.put(position, total);


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return; 
        }

        String highestPosition = null;
        int highestCount = 0;
        for (Map.Entry<String, Integer> entry : positionsMap.entrySet()) {
            if (entry.getTotal() > highestCount) {
                highestCount = entry.getTotal();
                highestPosition = entry.getPosition();
            }
        }

        if (highestPosition != null) {
            System.out.println("Position: " + highestPosition + " with count: " + highestCount);
        } else {
            System.out.println("No data found.");
        }

        System.out.println("The " + position + "recorded number of cyclists was in" + season +", on a " + weekday 
        + "in the month of " + month + ". " 
        + "There were a total of " + total + "cyclist. The weather was " + weather + ". " + day + "was not a holiday.")

	}

}
