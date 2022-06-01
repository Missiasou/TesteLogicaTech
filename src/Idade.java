import java.util.Scanner;
import java.io.*;


public class Idade {

    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED = "\u001B[31m";




        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite a idade do usuário:");
        idade = sc.nextInt();

        if (idade < 18){

            System.out.println(ANSI_RED + "SEM PERMISSÂO" + ANSI_RESET);
        }else if(idade> 18 && idade < 140){
            System.out.println(ANSI_GREEN + "PERMISSÃO CONCEDIDA" + ANSI_RESET);
        }else{
            System.out.println(ANSI_RED + "Por favor, digite uma idade válida" + ANSI_RESET);
        }
    }
}
