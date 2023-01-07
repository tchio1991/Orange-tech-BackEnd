// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

/*Desafio
No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as pessoas que estavam na posição impar da fila para entrarem no camarote. Ele fez isso em diversos shows e as pessoas foram a loucura para competirem por essas posições. Você resolveu criar um programa para saber, de acordo com o número de pessoas na fila, quantas entrariam no camarote.

Entrada
A entrada será o tamanho da fila que aguardava para ver o show.

Saída
A saída deve ser o número de pessoas que foram colocadas no camarote. (sem as aspas)

Exemplo
  Entrada	        Saída
   100	    "50 pessoas no camarote" 
    40	    "20 pessoas no camarote"
    25	    "13 pessoas no camarote" */

import java.util.Scanner; 
    
public class DesafioCamarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        pessoasNoCamarote = (int)Math.ceil((float)tamanhoDaFila/2);

        System.out.println(pessoasNoCamarote + " pessoas no camarote");

    }
}