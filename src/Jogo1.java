import java.util.Scanner;

public class Jogo1 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu Nickname: ");
        String nome = sc.nextLine();

        int pokemon = 0;
        int acao = 0;
        int danoinimigo;
        int level = 0;
        int vidapokemon = 50;
        int dano = 0;
        int caminho;
        int continuar = 1;
        int estado = 2;
        int loja = 3;
        int centropokemon = 4;
        int pokemonselvagem;
        int moeda = 0;
        IO.println("Bem-Vindo " + nome + " ao Centro Pokemon");
        IO.println("Escolha um Pokemon");
        IO.println("\n" + "(1)Bulbassauro | (2)Squirtle | (3)Charmander");
        int escolha = sc.nextByte();

        if (escolha == 1) {
            IO.println("Voce escolheu o Bulbassauro");
            pokemon += 100;
        } else if (escolha == 2) {
            IO.println("Voce escolheu o Squirtle");
            pokemon += 200;
        } else if (escolha == 3) {
            IO.println("Voce escolheu o Charmander");
            pokemon += 300;
        } else
            IO.println("Fica sem então");

        if (pokemon == 100) {
            do {
                IO.println("Escolha uma opção:");
                IO.println("\n" + "(1)Caminhar | (2)Ver o Estado do Pokemon");
                IO.println("\n" + "(3)Ir para loja | (4)Ir para o centro Pokemon");
                caminho = sc.nextInt();

                if (caminho == 1) {
                    IO.println("Um Ratata Selvagem Apareceu");
                    do {
                        IO.println("Bulbassauro/ " + vidapokemon + "HP");
                        IO.println("\n" + "(1)Atacar | (2)Correr");
                        acao = sc.nextInt();
                        if (acao == 1) {
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Chicote de Vinha | (2)Folha Narvalha");
                            IO.println("\n" + "(3)Pó de Veneno     | (4)Investida      ");
                            int acao2 = sc.nextInt();
                            if (acao2 == 1) ;
                            vidapokemon -= 50;
                        }
                    } while (acao != 2);
                    IO.println("Voce Correu");
                }


            } while (vidapokemon <= 0);
        }
    }
}