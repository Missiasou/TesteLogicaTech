

public class OrdemCrescente {

    public static void main(String[] args) {


        int[] numerosVetor = {8, 4, 6, 9, 2, 5, 10, 7, 1, 3};

        int variavelAuxiliar = 0;


        for (int i = 0; i < numerosVetor.length; i++) {

            for (int j = 0; j < numerosVetor.length - 1; j++) {

                if (numerosVetor[j] > numerosVetor[j+1]){
                    variavelAuxiliar = numerosVetor[j];
                    numerosVetor[j] = numerosVetor[j + 1];
                    numerosVetor[j + 1] = variavelAuxiliar;
                }
                
            }
            
        }

        int result = 0;
        while(result <= numerosVetor.length){
            switch (result){
                case 1:
                    System.out.println("1 (UM)");
                break;
                case 2:
                    System.out.println("2 (DOIS)");
                break;
                case 3:
                    System.out.println("3 (TRÊS)");
                break;
                case 4:
                    System.out.println("4 (QUATRO)");
                    break;
                case 5:
                    System.out.println("5 (CINCO)");
                    break;
                case 6:
                    System.out.println("6 (SEIS)");
                    break;
                case 7:
                    System.out.println("7 (SETE)");
                    break;
                case 8:
                    System.out.println("8 (OITO)");
                    break;
                case 9:
                    System.out.println("9 (NOVE)");
                    break;
                case 10:
                    System.out.println("10 (DEZ)");
                    break;

            }
            result++;

        }

    }


}    