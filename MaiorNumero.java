
package maiornumero;


import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero A:");
        int num1 = sc.nextInt();

        System.out.println("Digite o valor B:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Valor Maior:" + num1 );
        } else {
            System.out.println("Valor Maior:\n" + num2 );
        }
    }
}
