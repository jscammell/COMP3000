/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class


/**
 *
 * @author josh
 */
public class NmapScanClass {
    
   

public ArrayList<String> NetworkScan(String Command, String IP) {
        String result = null;
      
        ArrayList <String> Output = new ArrayList<String>();  
      
        try {
            Runtime r = Runtime.getRuntime();                    

            Process p = r.exec(Command + IP);

            BufferedReader in =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                result += inputLine;
                
              
                Output.add(inputLine);
                
            }
            in.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
        return Output;
}
    
}
