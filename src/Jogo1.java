import java.util.Scanner;

public class Jogo1 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu Nickname: ");
        String nome = sc.nextLine();

        IO.println("Bem-Vindo "+nome+" ao Centro Pokemon");
        IO.println("Escolha um Pokemon");
        IO.println("\n"+"(1)Bulbassauro"+"\n"+"(2)Squirtle"+"\n"+"(3)Charmander");
        int escolha = sc.nextByte();

        }
    }

