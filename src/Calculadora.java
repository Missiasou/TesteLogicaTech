import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int primeiroNumero;
        int segundoNumero;
        int operacao;
        double resultado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, qual operação você deseja realizar? (Escolha 1 para Adição, 2 para Subtração, 3 para Multiplicação ou 4 para Divisão)");
        operacao = sc.nextInt();

        System.out.println("Digite o primeiro número:");
        primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo número:");
        segundoNumero = sc.nextInt();

        if(operacao == 1){
            resultado = primeiroNumero + segundoNumero;
        } else if (operacao == 2){
            resultado = primeiroNumero - segundoNumero;
        }else if (operacao == 3){
            resultado = primeiroNumero * segundoNumero;
        }else if (operacao == 4){
            if (segundoNumero == 0){
                System.out.println("ERRO: Não existe divisão por zero");
            }else {
                resultado = primeiroNumero / segundoNumero;
            }
        }

        System.out.println(resultado);
    }
}
