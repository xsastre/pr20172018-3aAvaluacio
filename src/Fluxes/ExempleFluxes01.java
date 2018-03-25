/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fluxes;

import java.io.*;

/**
 *
 * @author xavier
 */
public class ExempleFluxes01 {
    public static void main(String[]args) {
        String s=new String("En un lugar de la macha de cuyo nombre no quiero acordarme");
        s=s+"no ha mucho tiempo que viviía un hidalgo de los de lanza en astillerom, ";
        s=s+"adarga antigua, rocín flaco y galgo corredor...";
        char[] matriu=new char[s.length()];
        int car=0;
        StringReader fluxeEntrada=new StringReader(s);
        CharArrayWriter fluxeSortida = new CharArrayWriter();
        try {
            /*while ((car=fluxeEntrada.read()) != -1) {
                fluxeSortida.write(car);
            }*/
            for (int i=0;i<256325;i++){
                fluxeSortida.write(fluxeEntrada.read());
            }
           
            matriu=fluxeSortida.toCharArray();
            System.out.println(matriu);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            fluxeEntrada.close();
            fluxeSortida.close();
        }
    }
}
