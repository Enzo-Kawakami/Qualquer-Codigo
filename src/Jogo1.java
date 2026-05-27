import java.util.Scanner;


public class Jogo1 {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu Nickname: ");
        String nome = sc.nextLine();


        int sair = 0;
        int danoinimigo = 0;
        int vidainimigo = 0;
        int vidaoriginal = 10;
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
            int ataque = 10;
            int ataque2 = 15;
            int ataque3 = 5;
            int ataque4 = 12;
            do {
                IO.println("Escolha uma opção:");
                IO.println("\n" + "(1)Caminhar | (2)Ver o Estado do Pokemon");
                IO.println("\n" + "(3)Ir para loja | (4)Ir para o centro Pokemon");
                caminho = sc.nextInt();


                if (caminho == 1) {
                    pokemonselvagem = (int) (Math.random() * 4);


                    if (pokemonselvagem == 1) {
                        IO.println("Um Ratata Selvagem Apareceu");
                        vidainimigo = vidaoriginal + (level * 20);
                        do {
                            IO.println("Ratata/ " + vidainimigo + "HP");
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Atacar | (2)Correr");
                            acao = sc.nextInt();
                            if (acao == 1) {
                                IO.println("Ratata/ " + vidainimigo + "HP");
                                IO.println("Bulbassauro/ " + vidapokemon + "HP");
                                IO.println("\n" + "(1)Chicote de Vinha      | (2)Folha Narvalha");
                                IO.println("\n" + "(3)Semente Sangue-Suga   | (4)Investida");
                                int acao2 = sc.nextInt();


                                if (acao2 == 1) {
                                    IO.println("Bulbassauro usou Chicote de Vinha");
                                    vidainimigo -= ataque;
                                } else if (acao2 == 2) {
                                    IO.println("Bulbassauro usou Folha Narvalha");
                                    vidainimigo -= ataque2;
                                } else if (acao2 == 3) {
                                    IO.println("Bulbassauro usou semente Sangue-Suga");
                                    vidainimigo -= ataque3;
                                    vidapokemon += 10;
                                } else if (acao2 == 4) {
                                    IO.println("Bulbassauro usou investida");
                                    vidainimigo -= ataque4;
                                } else {
                                    IO.println("Voce Mandou o Bulbassauro ficar parado");
                                }


                                if (vidainimigo > 0) {
                                    danoinimigo = (int) (Math.random() * 3);
                                    if (danoinimigo == 1) {
                                        IO.println("Ratata usou investida");
                                        vidapokemon -= 10;
                                    } else if (danoinimigo == 2) {
                                        IO.println("Ratata usou Rugido");
                                        ataque--;
                                        ataque2--;
                                        ataque3--;
                                        ataque4--;
                                    } else if (danoinimigo == 3) {
                                        IO.println("Ratata usou Arranhão");
                                        vidapokemon -= 12;


                                    } else
                                        IO.println("Ratata errou o ataque");
                                } else {
                                    IO.println("Parabens " + nome + "!");
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    level += 1;
                                    IO.println("Nivel: " + level);
                                    ataque += 1;
                                    ataque3 += 1;
                                    ataque2 += 1;
                                    ataque4 += 1;
                                    vidapokemon += 5;
                                }
                            }
                        } while (acao != 2 && vidapokemon > 0 && vidainimigo > 0);
                        IO.println("Voce Correu");


                    } else if (pokemonselvagem == 2) {
                        IO.println("Um Pidgey Selvagem Apareceu");
                        vidainimigo = vidaoriginal + (level * 15);
                        do {
                            IO.println("Pidgey/ " + vidainimigo + "HP");
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Atacar | (2)Correr");
                            acao = sc.nextInt();
                            if (acao == 1) {
                                IO.println("Pidgey/ " + vidainimigo + "HP");
                                IO.println("Bulbassauro/ " + vidapokemon + "HP");
                                IO.println("\n" + "(1)Chicote de Vinha      | (2)Folha Narvalha");
                                IO.println("\n" + "(3)Semente Sangue-Suga   | (4)Investida");
                                int acao2 = sc.nextInt();


                                if (acao2 == 1) {
                                    IO.println("Bulbassauro usou Chicote de Vinha");
                                    vidainimigo -= ataque;
                                } else if (acao2 == 2) {
                                    IO.println("Bulbassauro usou Folha Narvalha");
                                    vidainimigo -= ataque2;
                                } else if (acao2 == 3) {
                                    IO.println("Bulbassauro usou semente Sangue-Suga");
                                    vidainimigo -= ataque3;
                                    vidapokemon += 10;
                                } else if (acao2 == 4) {
                                    IO.println("Bulbassauro usou investida");
                                    vidainimigo -= ataque4;
                                } else {
                                    IO.println("Voce Mandou o Bulbassauro ficar parado");
                                }
                                if (vidainimigo > 0) {
                                    danoinimigo = (int) (Math.random() * 3);
                                    if (danoinimigo == 1) {
                                        IO.println("Pidgey usou Bicada");
                                        vidapokemon -= 10;
                                    } else if (danoinimigo == 2) {
                                        IO.println("Pidgey usou Ataque de Areia");
                                        vidapokemon -= 5;
                                        ataque--;
                                        ataque2--;
                                        ataque3--;
                                        ataque4--;
                                    } else if (danoinimigo == 3) {
                                        IO.println("Pigdey usou Rajada");
                                        vidapokemon -= 15;


                                    } else
                                        IO.println("Pidgey errou o ataque");
                                } else {
                                    IO.println("Parabens " + nome + "!");
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    level += 1;
                                    IO.println("Nivel: " + level);
                                    ataque += 1;
                                    ataque3 += 1;
                                    ataque2 += 1;
                                    ataque4 += 1;
                                    vidapokemon += 5;
                                }
                            }
                        } while (acao != 2 && vidapokemon > 0 && vidainimigo > 0);
                        IO.println("Voce Correu");


                    } else if (pokemonselvagem == 3) {
                        IO.println("Um Caterpie Selvagem Apareceu");
                        vidainimigo = vidaoriginal + (level * 10);
                        do {
                            IO.println("Caterpie/ " + vidainimigo + "HP");
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Atacar | (2)Correr");
                            acao = sc.nextInt();
                            if (acao == 1) {
                                IO.println("Caterpie/ " + vidainimigo + "HP");
                                IO.println("Bulbassauro/ " + vidapokemon + "HP");
                                IO.println("\n" + "(1)Chicote de Vinha      | (2)Folha Narvalha");
                                IO.println("\n" + "(3)Semente Sangue-Suga   | (4)Investida");
                                int acao2 = sc.nextInt();


                                if (acao2 == 1) {
                                    IO.println("Bulbassauro usou Chicote de Vinha");
                                    vidainimigo -= ataque;
                                } else if (acao2 == 2) {
                                    IO.println("Bulbassauro usou Folha Narvalha");
                                    vidainimigo -= ataque2;
                                } else if (acao2 == 3) {
                                    IO.println("Bulbassauro usou semente Sangue-Suga");
                                    vidainimigo -= ataque3;
                                    vidapokemon += 10;
                                } else if (acao2 == 4) {
                                    IO.println("Bulbassauro usou investida");
                                    vidainimigo -= ataque4;
                                } else {
                                    IO.println("Voce Mandou o Bulbassauro ficar parado");
                                }
                                if (vidainimigo > 0) {
                                    danoinimigo = (int) (Math.random() * 3);
                                    if (danoinimigo == 1) {
                                        IO.println("Caterpie usou Ronco");
                                        vidainimigo += 10;
                                    } else if (danoinimigo == 2) {
                                        IO.println("Caterpie usou Estilingue de Teia");
                                        vidapokemon -= 1;
                                        ataque--;
                                        ataque2--;
                                        ataque3--;
                                        ataque4--;
                                    } else if (danoinimigo == 3) {
                                        IO.println("Caterpie usou Mordida de Inseto");
                                        vidapokemon -= 15;


                                    } else
                                        IO.println("Caterpie errou o ataque");
                                } else {
                                    IO.println("Parabens " + nome + "!");
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    level += 1;
                                    IO.println("Nivel: " + level);
                                    ataque += 1;
                                    ataque3 += 1;
                                    ataque2 += 1;
                                    ataque4 += 1;
                                    vidapokemon += 5;
                                }
                            }
                        } while (acao != 2 && vidapokemon > 0 && vidainimigo > 0);
                        IO.println("Voce Correu");


                    } else if (pokemonselvagem == 4) {
                        IO.println("Um Zubat Selvagem Apareceu");
                        vidainimigo = vidaoriginal + (level * 15);
                        do {
                            IO.println("Zubat/ " + vidainimigo + "HP");
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Atacar | (2)Correr");
                            acao = sc.nextInt();
                            if (acao == 1) {
                                IO.println("Zubat/ " + vidainimigo + "HP");
                                IO.println("Bulbassauro/ " + vidapokemon + "HP");
                                IO.println("\n" + "(1)Chicote de Vinha      | (2)Folha Narvalha");
                                IO.println("\n" + "(3)Semente Sangue-Suga   | (4)Investida");
                                int acao2 = sc.nextInt();


                                if (acao2 == 1) {
                                    IO.println("Bulbassauro usou Chicote de Vinha");
                                    vidainimigo -= ataque;
                                } else if (acao2 == 2) {
                                    IO.println("Bulbassauro usou Folha Narvalha");
                                    vidainimigo -= ataque2;
                                } else if (acao2 == 3) {
                                    IO.println("Bulbassauro usou semente Sangue-Suga");
                                    vidainimigo -= ataque3;
                                    vidapokemon += 10;
                                } else if (acao2 == 4) {
                                    IO.println("Bulbassauro usou investida");
                                    vidainimigo -= ataque4;
                                } else {
                                    IO.println("Voce Mandou o Bulbassauro ficar parado");
                                }
                                if (vidainimigo > 0) {
                                    danoinimigo = (int) (Math.random() * 3);
                                    if (danoinimigo == 1) {
                                        IO.println("Zubat usou Absorver");
                                        vidapokemon -= 10;
                                        vidainimigo += 10;
                                    } else if (danoinimigo == 2) {
                                        IO.println("Zubat usou Morder");
                                        vidapokemon -= 10;


                                    } else if (danoinimigo == 3) {
                                        IO.println("Zubat usou Ataque de Asa");
                                        vidapokemon -= 10;


                                    } else
                                        IO.println("Zubat errou o ataque");
                                } else {
                                    IO.println("Parabens " + nome + "!");
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    level += 1;
                                    IO.println("Nivel: " + level);
                                    ataque += 1;
                                    ataque3 += 1;
                                    ataque2 += 1;
                                    ataque4 += 1;
                                    vidapokemon += 5;
                                }
                            }
                        } while (acao != 2 && vidapokemon > 0 && vidainimigo > 0);
                        IO.println("Voce Correu");
                    } else {
                        IO.println("Você Caminhou Tranquilamente");
                    }


                }
            } while (true);
        } else if (pokemon == 200) {
            int ataque = 10;
            int ataque2 = 15;
            int ataque3 = 10;
            int ataque4 = 12;
            do {
                IO.println("Escolha uma opção:");
                IO.println("\n" + "(1)Caminhar | (2)Ver o Estado do Pokemon");
                IO.println("\n" + "(3)Ir para loja | (4)Ir para o centro Pokemon");
                caminho = sc.nextInt();


                if (caminho == 1) {
                    pokemonselvagem = (int) (Math.random() * 4);


                    if (pokemonselvagem == 1) {
                        IO.println("Um Ratata Selvagem Apareceu");
                        vidainimigo = vidaoriginal + (level * 20);
                        do {
                            IO.println("Ratata/ " + vidainimigo + "HP");
                            IO.println("Squirtle/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Atacar | (2)Correr");
                            acao = sc.nextInt();
                            if (acao == 1) {
                                IO.println("Ratata/ " + vidainimigo + "HP");
                                IO.println("Bulbassauro/ " + vidapokemon + "HP");
                                IO.println("\n" + "(1)Arma de Agua      | (2)Surfar");
                                IO.println("\n" + "(3)Raio de Gelo      | (4)Investida");
                                int acao2 = sc.nextInt();


                                if (acao2 == 1) {
                                    IO.println("Squirtle usou Arma de Agua");
                                    vidainimigo -= ataque;
                                } else if (acao2 == 2) {
                                    IO.println("Squirtle usou Surfar");
                                    vidainimigo -= ataque2;
                                } else if (acao2 == 3) {
                                    IO.println("Squirtle usou Raio de Gelo");
                                    vidainimigo -= ataque3;
                                    int congenlar = (int) (Math.random() * 5);
                                    if (congenlar <= 1) {
                                        danoinimigo -= 1;
                                        IO.println("Ratata Congenlado");
                                    }
                                } else if (acao2 == 4) {
                                    IO.println("Bulbassauro usou investida");
                                    vidainimigo -= ataque4;
                                } else {
                                    IO.println("Voce Mandou o Bulbassauro ficar parado");
                                }


                                if (vidainimigo > 0) {
                                    danoinimigo = (int) (Math.random() * 3);
                                    if (danoinimigo == 1) {
                                        IO.println("Ratata usou investida");
                                        vidapokemon -= 10;
                                    } else if (danoinimigo == 2) {
                                        IO.println("Ratata usou Rugido");
                                        ataque--;
                                        ataque2--;
                                        ataque3--;
                                        ataque4--;
                                    } else if (danoinimigo == 3) {
                                        IO.println("Ratata usou Arranhão");
                                        vidapokemon -= 12;


                                    } else
                                        IO.println("Ratata errou o ataque");
                                } else {
                                    IO.println("Parabens " + nome + "!");
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    level += 1;
                                    IO.println("Nivel: " + level);
                                    ataque += 1;
                                    ataque3 += 1;
                                    ataque2 += 1;
                                    ataque4 += 1;
                                    vidapokemon += 5;
                                }
                            }
                        } while (acao != 2 && vidapokemon > 0 && vidainimigo > 0);
                        IO.println("Voce Correu");


                    } else if (pokemonselvagem == 2) {
                        IO.println("Um Pidgey Selvagem Apareceu");
                        vidainimigo = vidaoriginal + (level * 15);
                        do {
                            IO.println("Pidgey/ " + vidainimigo + "HP");
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Atacar | (2)Correr");
                            acao = sc.nextInt();
                            if (acao == 1) {
                                IO.println("Pidgey/ " + vidainimigo + "HP");
                                IO.println("Bulbassauro/ " + vidapokemon + "HP");
                                IO.println("\n" + "(1)Chicote de Vinha      | (2)Folha Narvalha");
                                IO.println("\n" + "(3)Semente Sangue-Suga   | (4)Investida");
                                int acao2 = sc.nextInt();


                                if (acao2 == 1) {
                                    IO.println("Bulbassauro usou Chicote de Vinha");
                                    vidainimigo -= ataque;
                                } else if (acao2 == 2) {
                                    IO.println("Bulbassauro usou Folha Narvalha");
                                    vidainimigo -= ataque2;
                                } else if (acao2 == 3) {
                                    IO.println("Bulbassauro usou semente Sangue-Suga");
                                    vidainimigo -= ataque3;
                                    vidapokemon += 10;
                                } else if (acao2 == 4) {
                                    IO.println("Bulbassauro usou investida");
                                    vidainimigo -= ataque4;
                                } else {
                                    IO.println("Voce Mandou o Bulbassauro ficar parado");
                                }
                                if (vidainimigo > 0) {
                                    danoinimigo = (int) (Math.random() * 3);
                                    if (danoinimigo == 1) {
                                        IO.println("Pidgey usou Bicada");
                                        vidapokemon -= 10;
                                    } else if (danoinimigo == 2) {
                                        IO.println("Pidgey usou Ataque de Areia");
                                        vidapokemon -= 5;
                                        ataque--;
                                        ataque2--;
                                        ataque3--;
                                        ataque4--;
                                    } else if (danoinimigo == 3) {
                                        IO.println("Pigdey usou Rajada");
                                        vidapokemon -= 15;


                                    } else
                                        IO.println("Pidgey errou o ataque");
                                } else {
                                    IO.println("Parabens " + nome + "!");
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    level += 1;
                                    IO.println("Nivel: " + level);
                                    ataque += 1;
                                    ataque3 += 1;
                                    ataque2 += 1;
                                    ataque4 += 1;
                                    vidapokemon += 5;
                                }
                            }
                        } while (acao != 2 && vidapokemon > 0 && vidainimigo > 0);
                        IO.println("Voce Correu");


                    } else if (pokemonselvagem == 3) {
                        IO.println("Um Caterpie Selvagem Apareceu");
                        vidainimigo = vidaoriginal + (level * 10);
                        do {
                            IO.println("Caterpie/ " + vidainimigo + "HP");
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Atacar | (2)Correr");
                            acao = sc.nextInt();
                            if (acao == 1) {
                                IO.println("Caterpie/ " + vidainimigo + "HP");
                                IO.println("Bulbassauro/ " + vidapokemon + "HP");
                                IO.println("\n" + "(1)Chicote de Vinha      | (2)Folha Narvalha");
                                IO.println("\n" + "(3)Semente Sangue-Suga   | (4)Investida");
                                int acao2 = sc.nextInt();


                                if (acao2 == 1) {
                                    IO.println("Bulbassauro usou Chicote de Vinha");
                                    vidainimigo -= ataque;
                                } else if (acao2 == 2) {
                                    IO.println("Bulbassauro usou Folha Narvalha");
                                    vidainimigo -= ataque2;
                                } else if (acao2 == 3) {
                                    IO.println("Bulbassauro usou semente Sangue-Suga");
                                    vidainimigo -= ataque3;
                                    vidapokemon += 10;
                                } else if (acao2 == 4) {
                                    IO.println("Bulbassauro usou investida");
                                    vidainimigo -= ataque4;
                                } else {
                                    IO.println("Voce Mandou o Bulbassauro ficar parado");
                                }
                                if (vidainimigo > 0) {
                                    danoinimigo = (int) (Math.random() * 3);
                                    if (danoinimigo == 1) {
                                        IO.println("Caterpie usou Ronco");
                                        vidainimigo += 10;
                                    } else if (danoinimigo == 2) {
                                        IO.println("Caterpie usou Estilingue de Teia");
                                        vidapokemon -= 1;
                                        ataque--;
                                        ataque2--;
                                        ataque3--;
                                        ataque4--;
                                    } else if (danoinimigo == 3) {
                                        IO.println("Caterpie usou Mordida de Inseto");
                                        vidapokemon -= 15;


                                    } else
                                        IO.println("Caterpie errou o ataque");
                                } else {
                                    IO.println("Parabens " + nome + "!");
                                    IO.println("Seu Bulbassauro subiu de nivel: ");
                                    level += 1;
                                    IO.println("Nivel: " + level);
                                    ataque += 1;
                                    ataque3 += 1;
                                    ataque2 += 1;
                                    ataque4 += 1;
                                    vidapokemon += 5;
                                }
                            }
                        } while (acao != 2 && vidapokemon > 0 && vidainimigo > 0);
                        IO.println("Voce Correu");


                    } else if (pokemonselvagem == 4) {
                        IO.println("Um Zubat Selvagem Apareceu");
                        vidainimigo = vidaoriginal + (level * 15);
                        do {
                            IO.println("Zubat/ " + vidainimigo + "HP");
                            IO.println("Bulbassauro/ " + vidapokemon + "HP");
                            IO.println("\n" + "(1)Atacar | (2)Correr");
                            acao = sc.nextInt();
                            if (acao == 1) {
                                IO.println("Zubat/ " + vidainimigo + "HP");
                                IO.println("Bulbassauro/ " + vidapokemon + "HP");
                                IO.println("\n" + "(1)Chicote de Vinha      | (2)Folha Narvalha");
                                IO.println("\n" + "(3)Semente Sangue-Suga   | (4)Investida");
                                int acao2 = sc.nextInt();


                                if (acao2 == 1) {
                                    IO.println("Bulbassauro usou Chicote de Vinha");
                                    vidainimigo -= ataque;
                                } else if (acao2 == 2) {
                                    IO.println("Bulbassauro usou Folha Narvalha");
                                    vidainimigo -= ataque2;
                                } else if (acao2 == 3) {
                                    IO.println("Bulbassauro usou semente Sangue-Suga");
                                    vidainimigo -= ataque3;
                                    vidapokemon += 10;
                                } else if (acao2 == 4) {
                                    IO.println("Squirtle usou investida");
                                    vidainimigo -= ataque4;
                                } else {
                                    IO.println("Voce Mandou o Bulbassauro ficar parado");
                                }
                                if (vidainimigo > 0) {
                                    danoinimigo = (int) (Math.random() * 3);
                                    if (danoinimigo == 1) {
                                        IO.println("Zubat usou Absorver");
                                        vidapokemon -= 10;
                                        vidainimigo += 10;
                                    } else if (danoinimigo == 2) {
                                        IO.println("Zubat usou Morder");
                                        vidapokemon -= 10;


                                    } else if (danoinimigo == 3) {
                                        IO.println("Zubat usou Ataque de Asa");
                                        vidapokemon -= 10;


                                    } else
                                        IO.println("Zubat errou o ataque");
                                } else {
                                    IO.println("Parabens " + nome + "!");
                                    IO.println("Seu Squirtle subiu de nivel: ");
                                    level += 1;
                                    IO.println("Nivel: " + level);
                                    ataque += 1;
                                    ataque3 += 1;
                                    ataque2 += 1;
                                    ataque4 += 1;
                                    vidapokemon += 5;
                                }
                            }
                        } while (acao != 2 && vidapokemon > 0 && vidainimigo > 0);
                        IO.println("Voce Correu");
                    } else {
                        IO.println("Você Caminhou Tranquilamente");
                    }
                }
            } while (true);
        } else if (pokemon == 300) {

        }
    }

}