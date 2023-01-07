// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

/* Desafio
   Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês, ele quer saber quanto terá se juntar todo o dinheiro, sem gastar nada, durante alguns meses. E você, como um bom tio com habilidades de programação, vai criar um programa que com as entradas do seu sobrinho vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses.

   Entrada
   A entrada será o número de meses que o sobrinho polpará o dinheiro.

   Saída
   A saída deve ser o valor que o sobrinho terá ao final dos meses. (sem as aspas)

   Exemplo
   Entrada	Saída
     2	 "Voce tera 100 reais" 
     4	 "Voce tera 200 reais"
    10	 "Voce tera 500 reais"*/

import java.util.Scanner; 
    
public class DesafioMesadaSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int finalMeses = (entrada * mesada);
        
        System.out.println(finalMeses);
        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

    }
}