import java.util.Scanner;

public class Jogo1 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu Nickname: ");
        String nome = sc.nextLine();

       int sair=0;
       int danoinimigo = 0;
       int vidainimigo = 0;
        int pokemon = 0;
        int acao = 0;
        int level = 0;
        int vidapokemon = 50;
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
           int ataque =10;
           int ataque2 = 15;
           int ataque3 = 5;
           int ataque4 = 12;
            do {
                IO.println("Escolha uma opção:");
                IO.println("\n" + "(1)Caminhar | (2)Ver o Estado do Pokemon");
                IO.println("\n" + "(3)Ir para loja | (4)Ir para o centro Pokemon");
                caminho = sc.nextInt();

                if (caminho == 1) {
                    pokemonselvagem = (int)(Math.random() * 4);

                    if(pokemonselvagem == 1)
                        IO.println("Um Ratata Selvagem Apareceu");
                    vidainimigo += 30;
                   do {
                        IO.println("Bulbassauro/ " + vidapokemon + "HP");
                        IO.println("\n" + "(1)Atacar | (2)Correr");
                        acao = sc.nextInt();
                        if (acao == 1) {
                            IO.println("Ratata/ "+ vidainimigo+"HP");
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n"+"(1)Chicote de Vinha | (2)Folha Narvalha");
                            IO.println("\n"+"(3)Pó de Veneno     | (4)Investida");
                            int acao2 = sc.nextInt();

                            if (acao2 == 1) {
                                IO.println("Bulbassauro usou Chicote de Vinha");
                                vidainimigo -= ataque;
                                if (vidainimigo == 0) {
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    IO.println("Nuvel: "+level++);
                                    ataque ++;
                                    ataque3++;
                                    ataque2++;
                                    ataque4++;
                                }else
                                    IO.println();

                            }else if (acao2 == 2){
                                IO.println("Bulbassauro usou Folha Narvalha");
                                vidainimigo -= ataque2;
                                if (vidainimigo == 0){
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    IO.println("Nuvel: "+level++);
                                    ataque ++;
                                    ataque3++;
                                    ataque2++;
                                    ataque4++;
                                }else
                                    IO.println();
                            }else if(acao2 == 3){
                                IO.println("Bulbassauro usou semente Sangue-Suga");
                                vidainimigo -= ataque3;
                                vidapokemon += 10;
                                if (vidainimigo == 0){
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    IO.println("Nuvel: "+level++);
                                    ataque ++;
                                    ataque3++;
                                    ataque2++;
                                    ataque4++;
                                }else
                                    IO.println();

                            }else if(acao2 == 4){
                                IO.println("Bulbassauro usou investida");
                                vidainimigo -= ataque4;
                                if(vidainimigo == 0){
                                IO.println("Seu Bulbassauro subiu de nivel: ");
                                IO.println("Nuvel: "+level++);
                                ataque ++;
                                ataque3++;
                                ataque2++;
                                ataque4++;
                                }else
                                    IO.println();

                            }else
                                IO.println("Voce Mandou o Bulbassauro ficar parado");

                        } danoinimigo = (int)(Math.random()* 3);

                    } while (acao != 2 && vidapokemon >= 0 && vidainimigo >=0);
                    IO.println("Voce Correu");
                }
            } while (true);
        }
    }
}