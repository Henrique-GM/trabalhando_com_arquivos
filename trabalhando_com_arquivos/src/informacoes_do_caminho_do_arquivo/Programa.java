/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacoes_do_caminho_do_arquivo;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Programa {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        //Colocar esse caminho: C:\Users\Henrique\Documents\NetBeansProjects\trabalhando_com_arquivos\in.txt
        
        System.out.println("Entre com o caminho do arquivo: ");
        String strArquivo = sc.nextLine();
        
        File arquivo = new File(strArquivo);
        
        //Pega o nome do arquivo
        System.out.println("getName " + arquivo.getName());
        
        //so o caminho e desprezando o nome
        System.out.println("getParent "+ arquivo.getParent());
        
        //Todo o caminho
        System.out.println("getPath " + arquivo.getPath());
        
        sc.close();
    }
}
