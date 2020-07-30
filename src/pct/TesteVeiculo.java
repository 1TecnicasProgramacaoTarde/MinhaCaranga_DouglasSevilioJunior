/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author dsevi
 */
public class TesteVeiculo {
    public static void main(String[] args) {
        //Criação e instância do objeto da classe Veículo
        Veiculo minhaCaranga = new Veiculo();
        
        //Construção do objeto
        minhaCaranga.marca = "Fiat";
        minhaCaranga.modelo = "147";
        minhaCaranga.cor = 'Y';
        minhaCaranga.velocidade = 0;
        
        //Exibindo a minha caranga
        System.out.println("\n\t\t\t -- Minha Caranga --\n");
        minhaCaranga.exibirVeiculo();
        
        //Testando a aceleração
        for(int i = 0; i < 200; i++)
            minhaCaranga.acelerar();
        
        //Exibindo a minha caranga ACELERADA
        System.out.println("\n\t\t\t -- Minha Caranga ACELERADA --\n");
        minhaCaranga.exibirVeiculo();
        
        //Testando a aceleração
        for(int i = 0; i < 200; i--)
            minhaCaranga.desacelerar();
        
        //Exibindo a minha caranga DESACELERADA
        System.out.println("\n\t\t\t -- Minha Caranga DESACELERADA --\n");
        minhaCaranga.exibirVeiculo();
        
        
        
        
        
        
        
    }
    
}
