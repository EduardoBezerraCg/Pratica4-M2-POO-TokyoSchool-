package CondicioIF;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor para o quadrado");
        double valor = in.nextInt();

        double area = (valor) * valor;

        System.out.println("A area do quadrado é: \n" + area);

    }
}
