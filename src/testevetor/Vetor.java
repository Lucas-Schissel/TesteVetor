/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testevetor;
import java.util.Random;

/**
 *
 * @author IFSC
 */
public class Vetor {
    
    int[] vet;
            
      /* Construtor */     
    public Vetor(int size){       
    vet = new int[size];
    }
    /* Preenche o vetor com valores aleatórios*/     
    public void randomFill(){
    Random r = new Random();
    for(int i=0 ; i < vet.length ; i++){
        vet[i] = r.nextInt(1000);
    }
    }       
   
    /* Implementa o método de ordenação bubbleSort*/     
    public void bubbleSort(){}       
    
    /* Converte o vetor para String*/     
    public String toString(){
     return 
    }       
    
    /* Compara se dois vetores são iguais */     
    public boolean equals(int[] v){}       
    
    /* Atribui um valor na posição pos do vetor */     
    public void setAt(int pos, int value){}       
    
    /* Retorna o valor na posição pos do vetor. */     
    public int valueAt(int pos){}       
    
    /* Retorna o tamanho do vetor */     
    public int length(){}       
    
    /* Concatena dois vetores */     
    public Vetor Concat(Vetor v){} 
    
}
