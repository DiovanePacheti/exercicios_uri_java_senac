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
        
        //declarando variaveis, 
        int valorx = 0;
        String concatenandoValores = "";
        String formandoSaida;
        boolean sair = false;
        
        // instanciando um objeto da class Scanner 'scan' 
        Scanner scan = new Scanner(System.in);
        
        /* - do white - estrutura de repetição que vai repitir executando 
        o bloco e depois efetuando o teste logico*/
        do{
        
          //System.out.println("Digite o valor da variavel x : ");
            valorx = scan.nextInt();
            
            //se(valorc for igual a zero)
            if(valorx == 0){
              //sair recebe verdadeiro
                sair =true;
            //senao    
            }else{ 
                //variavel concatenandoValores recebe ela mais valorx concatenado com virgula
                concatenandoValores += valorx+",";
            }    
        //enquanto sair for não sair         
        }while(!sair); 
        
      //vetor de String que vai armazenar a sequencia de concatenada por virgula separando em posiçoes no vetor 
        String[] listaDeValores = concatenandoValores.split(",");
                
        /*estrutura for */      
        for(int i = 0;i<listaDeValores.length;i++){ 
          
          //variavel local que vai receber o conteudo armazenado no vetor na posição 'i'
            String valor = listaDeValores[i];
     
            //limpando a variavel 
            formandoSaida =  " ";
           //variavel local int que vai receber a conversão do conteudo de String para number tipo primitivo int 
            int num = Integer.parseInt(valor);
            // segundo for que vai repeir a sequencia de 1 ate o valor digitado na posição encontrado no for superior
            for(int j = 1;j<=num;j++){
                // gerando a saida 
                formandoSaida += j + " ";
            }//fim do for j
            
          /*formatando a saida pro URI 
            com .substring(primeiro parametro acessamos a posição '1' 
            por que a '0' contem um espaço vazio, depois o segundo parametro
            com .length() obtemos a valor do tamanho do array e subtraimos '1'
            para eliminarmos a ultima posição que tambem armazena um espaço vazio)
          */
            System.out.println(formandoSaida.substring(1, formandoSaida.length() -1));
        
        }//fim do for i
        
        
    }//fim do metodo maim
    
}//fim da class sequências crescentes nº 1146


