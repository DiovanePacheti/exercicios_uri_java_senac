/*
Leia 6 valores. Em seguida, mostre 
quantos destes valores digitados 
foram positivos. Na próxima linha, 
deve-se mostrar a média de todos 
os valores positivos digitados, 
com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que 
podem ser valores inteiros ou 
de ponto flutuante. Pelo 
menos um destes números será 
positivo.

Saída
O primeiro valor de saída 
é a quantidade de valores 
positivos. A próxima linha 
deve mostrar a média dos 
valores positivos digitados.
 */
package br.com.uri.exercicios.repeticaoI.positivosemedia1064;
import java.util.Scanner;
/**
 *
 * @author diovane
 */
public class PositivosEMedia {
    
    public static void main(String[] args) {
        
        //declarndo variaveis
        double num = 0;
        double media = 0;
        int limite;
        int cont = 0;
        int qtdNumPositivos = 0; //variavel que ira armazenar a quantidade de numeros positivos aparecem
        double somaNumPositivos = 0;
        limite = 6; //inicializando variavel
        
        Scanner scan = new Scanner(System.in);
        
        do{
            
            //System.out.println("Digite o valor");
            num = scan.nextDouble();
            
            if(num>=0){//se num for maior ou igual a zero
                
                somaNumPositivos = somaNumPositivos + num; 
                qtdNumPositivos++;
            }//fim do if
            
            cont++;
        }while(cont<limite);//enquanto cont for menor que limite faça
        
      //calculando a media resultado da soma dos num positivos dividido por num de veze que e adicionado um num positivo
        media = somaNumPositivos/qtdNumPositivos;
        
        
        System.out.printf("%d valores positivos \n%.1f\n",qtdNumPositivos, media);
    }//fim do metodo main
    
}//fim da class
