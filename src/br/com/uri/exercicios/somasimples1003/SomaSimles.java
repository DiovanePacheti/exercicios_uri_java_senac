/*
 Leia dois valores inteiros, 
no caso para variáveis A e B. A seguir, 
calcule a soma entre elas e atribua à variável SOMA. 
A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável SOMA com todas as letras maiúsculas, 
com um espaço em branco antes e depois da igualdade 
seguido pelo valor correspondente à soma de A e B. 
Como todos os problemas, não esqueça de imprimir o 
fim de linha após o resultado, caso contrário, 
você receberá "Presentation Error".
 */
package br.com.uri.exercicios.somasimples1003;
// importando o pacote SCANNER
import java.util.Scanner;

/**
 *
 * @author diovane
 */
public class SomaSimles {
    
    /*  Metodo Main(principal)
    publico estatico vazio principal */
    public static void main(String[] args) {
        
        // instanciando um objeto scanner 
        Scanner scan = new Scanner(System.in);
        
        // Declarando variaveis
        int valorA = 0;
        int valorB = 0;
        int soma = 0;
        
        System.out.println("Digite o valor da variavel A : ");
        valorA = scan.nextInt();
        
        //System.out.println("Digite o valor da variavel B : ");
        valorB = scan.nextInt();
        
        soma = valorA + valorB;
        
        System.out.println("SOMA = " + soma);

    }//fim do method main
    
}//fim da class Soma Simples
