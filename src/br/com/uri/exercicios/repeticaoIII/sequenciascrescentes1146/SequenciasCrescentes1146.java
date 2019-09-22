/*
Este programa deve ler uma variável 
inteira X inúmeras vezes 
(deve parar quando o valor no arquivo de entrada for igual a zero). 
Para cada valor lido imprima a sequência de 1 até X, 
com um espaço entre cada número e seu sucessor.

Obs: cuide para não deixar espaço em branco após o 
último valor apresentado na linha ou você receberá 
Presentation Error.

Entrada
O arquivo de entrada contém vários 
números inteiros. O último número no arquivo de entrada é 0.

Saída
Para cada número N do arquivo 
de entrada deve ser impressa 
uma linha de 1 até N, conforme 
o exemplo abaixo. Não deve 
haver espaço em branco após 
o último valor da linha.
 */

package br.com.uri.exercicios.repeticaoIII.sequenciascrescentes1146;
import java.util.Scanner;
/**
 *
 * @author diovane
 */
public class SequenciasCrescentes1146 {
    

    public static void main(String[] args) {
        
        //declarando variavel do tipo primitivo inteira
        int valorx = 0;
        String concatenandoValores = "";
        String formandoSaida;
        boolean sair = false;
        
        // instanciando um objeto da class Scanner 'scan' 
        Scanner scan = new Scanner(System.in);
        
        /* - do white - estrutura de repetição que vai repitir executando 
        o bloco e depois efetuando o teste de comparação */
        do{
        
          //System.out.println("Digite o valor da variavel x : ");
            valorx = scan.nextInt();
            
            
            if(valorx == 0){
                sair =true;
            }else{    
                concatenandoValores += valorx+",";
            }    
                
        }while(!sair); 
        
        String[] listaDeValores = concatenandoValores.split(",");
                
        /*estrutura for que */      
        for(int i = 0;i<listaDeValores.length;i++){ 
          
            String valor = listaDeValores[i];
     
            //limpando a variavel 
            formandoSaida =  " ";
            int num = Integer.parseInt(valor);
            for(int j = 1;j<=num;j++){
                formandoSaida += j + " ";
            }//fim do for j
            
            System.out.println(formandoSaida.substring(1, formandoSaida.length() -1));
        
        }//fim do for i
        
        
    }//fim do metodo maim
    
}//fim da class sequências crescentes nº 1146


