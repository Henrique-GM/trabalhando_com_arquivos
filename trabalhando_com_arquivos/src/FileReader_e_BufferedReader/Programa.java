/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReader_e_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Henrique
 */
public class Programa {
    
    public static void main(String[] args) {
        
        String arquivo = "C:\\Users\\Henrique\\Documents\\NetBeansProjects\\trabalhando_com_arquivos\\in.txt";       
        
        //função dentro do try para ler aruivos
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
           
            String linha = br.readLine();
            
            while(linha != null) {
                System.out.println(linha);
                
                linha = br.readLine();
            }
        }
        
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } 
    }
}
