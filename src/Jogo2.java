import java.util.Scanner;

public class Jogo2 {
    void main(){
        Scanner sc = new Scanner(System.in);
        int opcao2;
        int ganho = 0;
        int perda = 0;
        int empate = 0;


        for(int pare = 0; pare < 3;pare++){
            IO.println("Escolha");
            IO.println("\n"+"(0)Pedra"+"\n"+"(1)Papel"+"\n"+"(2)Tesoura");
            int opcao = sc.nextInt();
            if (opcao == 0) {
                opcao2 = (int) (Math.random() * 2);
                if (opcao == opcao2) {
                    IO.println("🤜/🤛");
                    IO.println("Empate");
                    empate+=1;
                } else if (opcao2 == 1) {
                    IO.println("🤜/🖐️");
                    IO.println("Voce Perdeu");
                    perda+=1;
                } else if (opcao2 == 2) {
                    IO.println("🤜/✌️");
                    IO.println("Voce Ganhou");
                    ganho+=1;
                }


            } else if (opcao == 1) {
                opcao2 = (int) (Math.random() * 2);
                if (opcao == opcao2) {
                    IO.println("🖐️/🖐️");
                    IO.println("Empate");
                    empate+=1;
                } else if (opcao2 == 0) {
                    IO.println("🖐️/🤛");
                    IO.println("Voce Ganhou");
                    ganho+=1;
                } else if (opcao2 == 2) {
                    IO.println("🖐️/✌️");
                    IO.println("Voce Perdeu");
                    perda+=1;
                }
            } else if (opcao == 2) {
                opcao2 = (int) (Math.random() * 2);
                if (opcao == opcao2) {
                    IO.println("️✌️/✌️");
                    IO.println("Empate");
                    empate+=1;
                } else if (opcao2 == 0) {
                    IO.println("✌️️/🤛");
                    IO.println("Voce Perdeu");
                    perda+=1;
                } else if (opcao2 == 1) {
                    IO.println("✌️/🖐️");
                    IO.println("Voce Ganhou");
                    ganho+=1;
                }
            }
            IO.println("Partidas");
            IO.println("Ganhas: "+ganho);
            IO.println("Perdas: "+perda);
            IO.println("Empates: "+empate);
        }
    }}


