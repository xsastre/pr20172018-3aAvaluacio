/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExempleLecturaFitxer;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author xavier
 */
public class ExempleFitxer {
    public static final String SEPARATOR=";";

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter br_output = null;

       try {

          br =new BufferedReader(new FileReader("./src/ExempleLecturaFitxer/fitxer_csv.csv"));
          br_output =new BufferedWriter(new FileWriter(".\\src\\ExempleLecturaFitxer\\fitxer_csv2.csv"));
          String line = br.readLine();
          while (null!=line) {
            br_output.write(line);
            br_output.newLine();
            String [] fields = line.split(SEPARATOR);
            System.out.println(Arrays.toString(fields));
            System.out.println(fields[0]);
            System.out.println(fields[1]);
            System.out.println(fields[2]);
            System.out.println(fields[3]);

            //fields = removeTrailingQuotes(fields);
            //System.out.println(Arrays.toString(fields));

            line = br.readLine();
          }

       } catch (IOException e) {
          System.out.println("S'ha trobat un error llegint el fitxer especificat: "+e.getMessage());
       } finally {
          if (null!=br) {
             br.close();
             br_output.close();
          }
       }
    }
}
    
