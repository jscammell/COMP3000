/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList; 


/**
 *
 * @author josh
 */
public class NmapScanClass {
// class called NmapScanClass    
   

public ArrayList<String> NetworkScan(String Command, String IP) {
        String result = null;
        // Method that returns Arraylist, with 2 string inputs: Command & IP
      
        ArrayList <String> Output = new ArrayList<String>();  
        // Initialising an Arraylist called Output
        
        try {
            Runtime r = Runtime.getRuntime();             

            Process p = r.exec(Command + IP);
            // Attempts to open process using Command and IP inputted
            
            BufferedReader in =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                result += inputLine;
                
              
                Output.add(inputLine);
                
            }
            in.close();
            // The terminal is opened in the background, so the bufferedreader gets the data

        } catch (IOException e) {
            System.out.println("Error");
        }
        // If a connection is not made with the terminal, an error is thrown
        
        return Output;
        // Returns the arraylist which cotains the output of the run command
        
}
    
}
