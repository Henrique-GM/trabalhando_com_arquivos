/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileWriter_e_BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Henrique
 */
public class Programa {
    
    public static void main(String[] args) {
        
        String[] linhas = new String[] {"Olá Mundo!"};
        
        String arquivo = "C:\\Users\\Henrique\\Documents\\NetBeansProjects\\trabalhando_com_arquivos\\out.txt";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            //O true é um parametro que indica que você não quer recriar o arquivo e gravar de novo
            
            for (String linha : linhas) {
                
                bw.write(linha);
                bw.newLine();
            }
        }
        
        catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
