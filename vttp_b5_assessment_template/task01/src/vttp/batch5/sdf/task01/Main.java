package vttp.batch5.sdf.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vttp.batch5.sdf.task01.models.BikeEntry;
import vttp.batch5.sdf.task01.models.BikeEntry1;

// Use this class as the entry point of your program

public class Main {

	public static void main(String[] args) {

		String inputFile = args[0];
		Map<String, BikeEntry1> = new HashMap<>();

		try(BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			String line;
			while ((line = br.readLine()) != null)
				String[] values = line.split(",");
	
			
	

			String position = bikeEntry.getPosition();
            int total = bike.getOrDefault(weekday, 0);
            total++;

			 }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return; 
        }

		String highestPosition = null;
        int highestCount = 0;

		for (Map.Entry<String, Integer> entry : bikeMap.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                highestPosition = entry.getKey();
            }
        }

		if (highestPosition!= null) {
            System.out.println("Highest position: " + highestPosition + " with count: " + highestCount);
        } else {
            System.out.println("No data found.");
        }

		BikeEntry1 bike = bikeMap.get("9F9AdB7B8A6f7F2");
        if (bike != null) {
            System.out.println(bike.toString());
        } else {
            System.out.println("Bike entry not found.");
        }



			
			
		}




		System.out.printf("hello, world\n");

	}
}
