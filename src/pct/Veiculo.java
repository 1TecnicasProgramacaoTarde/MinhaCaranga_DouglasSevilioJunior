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
public class Veiculo {
    //Atributos
    String marca;
    String modelo;
    char cor; // y - yelloow; b - black; s - silver.
    int velocidade;
    
    //Métodos
    public void exibirVeiculo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.printf("Velocidade %dkm/h.\n", velocidade);        
    }
    
    public void acelerar(){
        if(velocidade < 120)
            velocidade++;
    }
    public void desacelerar(){
        if(velocidade > 120)
            velocidade--;
    }
 
}
