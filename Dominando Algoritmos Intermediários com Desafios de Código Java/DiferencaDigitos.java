// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.
/*Desafio
O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a soma dos seus digitos.

Entrada 
• Para encontrar o produto do valor, os dígitos deverão ser multiplicados.

• A soma, basta realizar uma adição entre os dígitos.

• A diferença, é necessário substrair o resultado final dos dois valores.

Saída
A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.

Entrada	Saída
243

15
Explicação:
Produto de dígitos = 2 * 3 * 4 = 24
Soma dos dígitos = 2 + 3 + 4 = 9
Resultado = 24 - 9 = 15

 */

import java.util.Arrays;
import java.util.Scanner;

public class DiferencaDigitos {
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

    int numero = scan.nextInt();

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

    int multiplicacao = 1;
    int soma = 0;
   

        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.
    
    for (int count = 0; count<=ints.length-1; count++) {
        multiplicacao = ints[count]*multiplicacao;
        soma = ints[count]+soma;
    }    

    System.out.println(multiplicacao - soma);
        
    scan.close();    
    }
}