/*
Faça um programa que mostre os números pares 
entre 1 e 100, inclusive.

Entrada
Neste problema extremamente simples de repetição não há entrada.

Saída
Imprima todos os números pares entre 1 e 100, 
inclusive se for o caso, um em cada linha.
*/
package br.com.uri.exercicios.repeticaoI.numerospares1059;

/**
 *
 * @author diovane
 */
public class NumerosPares1059 {
    
    public static void main(String[] args) {
        for(int i = 1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }//fim do metodo main
  
    
}//fim da class
