// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

/*Desafio
Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes, principalmente as crianças que estão muito acostumadas com a tecnologia, poderiam colocar suas moedas e receber dois doces aleatórios. Cada 1 real irá render 2 doces aleatórios.

Entrada
A entrada será a quantidade de dinheiro que cada cliente, um por vez, possui.

Saída
A saída deverá ser a quantidade de doces que cada cliente conseguiu obter. (sem as aspas)

Exemplo
Entrada	        Saída
   10	 "O cliente obteve 20 doces" 
   20	 "O cliente obteve 40 doces"
   40	 "O cliente obteve 80 doces" */

import java.util.Scanner; 
    
public class DesafioLojinhaDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        
        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        System.out.println("O cliente obteve " + doce*2 + " doces");
    }
}