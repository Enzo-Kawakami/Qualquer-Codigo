import java.util.Scanner;

public class Jogo3 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("  |   |  ");
        IO.println("_________");
        IO.println("  |   |  ");
        IO.println("_________");
        IO.println("  |   |  ");
        IO.println("Pressione qual Posição Quer Começar");
         int posicao = sc.nextInt();

         int posicao1 = 0;
        int posicao2 = 0;
        int posicao3 = 0;
        int posicao4 = 0;
        int posicao5 = 0;
        int posicao6 = 0;
        int posicao7 = 0;
        int posicao8 = 0;
        int posicao9 = 0;
        int a = 1;

        for (int i = 1; i <=9; i++ ){
           do {
               if (posicao == 1) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a=a+1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else if (posicao == 2) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a = a+1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else if (posicao == 3) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a = a + 1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else if (posicao == 4) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a = a + 1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else if (posicao == 5) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a = a + 1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else if (posicao == 6) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a = a + 1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else if (posicao == 7) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a = a + 1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else if (posicao == 8) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a = a + 1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else if (posicao == 9) {
                   if (posicao1 == 0) {
                       posicao1 += 1;
                       a = a + 1;
                   } else {
                       IO.println("Voce nao pode colocar nesse espaço");
                   }
               } else{
                   IO.println("Esse tipo de Trapaça não é permitido");
               }
               }while (a != 2);
           }


    }
}
