/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendo_arquivos_de_texto_com_classes_File_e_Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File arquivo = new File ("C:\\Users\\Henrique\\Documents\\NetBeansProjects\\trabalhando_com_arquivos\\in.txt");
        
        Scanner sc = null;
        
        try {
            sc = new Scanner(arquivo);
            
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
    
}
