/*
Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
Efetue a soma de A e B atribuindo o seu resultado na variável X. 
Imprima X conforme exemplo apresentado abaixo. 
Não apresente mensagem alguma além daquilo que está sendo especificado 
e não esqueça de imprimir o fim de linha após o resultado, 
caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) 
seguido pelo valor da variável X e pelo final de linha. 
Cuide para que tenha um espaço antes e depois do 
sinal de igualdade, conforme o exemplo abaixo.
 */
package br.com.uri.exercicios.extremamentebasico1001;

import java.util.Scanner;

/**
 *
 * @author diovane
 */
public class ExtremamenteBasico {
        public static void main(String[] args) {

        //instanciando um objeto da classe Scannner
        Scanner scan = new Scanner(System.in);

        
         int valorA = 0 ;
         int valorB = 0 ;
         int valorX = 0 ;

        //System.out.print("Digite o valor da variavel A : ");
        valorA =  scan.nextInt();

        // System.out.print("Digite o valor da variavel B : ");
        valorB =  scan.nextInt();

        //somando os valores de A e B e inserindo na variavel X
        valorX = valorA + valorB;

        System.out.println("X = " + valorX);


    }//fim do method main

}//fim da class
