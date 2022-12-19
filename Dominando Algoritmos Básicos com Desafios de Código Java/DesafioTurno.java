import java.util.Scanner;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

public class DesafioTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

//TODO: Implemente uma solução para que seja impresso a saída correto do seu turno: 

        if (turno == 'M') {
            System.out.println("Bom dia!");
        }else if (turno == 'V') {
            System.out.println("Boa tarde!");
        }else if (turno == 'N') {
            System.out.println("Boa noite!");
        }else {
            System.out.println("Valor inválido!");
        }

        leitor.close();        
    }
    
}
