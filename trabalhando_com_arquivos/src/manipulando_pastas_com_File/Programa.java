/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulando_pastas_com_File;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Programa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com uma pasta: ");
        String strArquivo = sc.nextLine();
        
        File arquivo = new File (strArquivo);
        
        //Função para listar somente quem for diretorio, ou pasta.
        File[] pastas = arquivo.listFiles(File::isDirectory);
        
        System.out.println("PASTAS: ");
        
        for (File pasta : pastas) {
            
            System.out.println(pasta);
        }
        
        //Função para listar somente quem for arquivos
        File[] arquivos = arquivo.listFiles(File::isFile); 
        
        System.out.println("ARQIVOS: ");
        
        for (File arquiv : arquivos) {
            
            System.out.println(arquiv);
        }
        
        //Criando uma subpasta
        boolean sucesso = new File(strArquivo + "\\subpasta").mkdir();
        
        System.out.println("Diretório criado com sucesso: " + sucesso);
        
        sc.close();
    }
}
