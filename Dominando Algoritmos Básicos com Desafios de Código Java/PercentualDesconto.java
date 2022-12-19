import java.util.Scanner;

public class PercentualDesconto {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
            
        int M = input.nextInt();
        int D = input.nextInt(); 

        int percentual = ((M - D) * 100)/M;

        System.out.println("O desconto foi de " + percentual + "%");

    
        input.close();
    }
    
}
