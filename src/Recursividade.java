import java.util.Scanner;

public class Recursividade {

    public static void main(String[] args) {


        int numeroEscolhido;
        int result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numeroEscolhido = sc.nextInt();


        result = fator(numeroEscolhido);
        System.out.println("O fatorial de " + numeroEscolhido + " é: " + result);

    }

    private static int fator(int num) {
        if( num == 0){
            return 1;
        }
        return num * fator(num - 1);
    }


}

// Usando método recursivos é que geralmente são mais simples de se ler, economizando linhas de cógidos.
