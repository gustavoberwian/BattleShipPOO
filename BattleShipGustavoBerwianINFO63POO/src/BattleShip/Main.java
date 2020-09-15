package BattleShip;

import java.util.Scanner;

/**
 * Classe Main
 *
 * Classe utilizada para rodar o código do jogo
 * @author Gustavo Berwian
 * @since 14/09/2020
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Inicializando a classe Multiplayer
        Multiplayer jogar = new Multiplayer();

        //Obtendo escolha do jogador
        System.out.println("Bem vindo a batalha naval!\nPressione '1' para jogar ou '2' para sair");
        int op = in.nextInt();

        //Verificando escolha com if
        if (op == 1){
            //Chamando o método readNames para obter os nomes
            jogar.readNames();
            System.out.println("Bem vindos "+jogar.getPlayer1()+" e "+jogar.getPlayer2()+". Boa sorte e bom jogo!");

            //Chamando método battlePlayer1 para definir posições dos barcos do Jogador 1
            jogar.battlePlayer1();
            //Chamando método battlePlayer1 para definir posições dos barcos do Jogador 2
            jogar.battlePlayer2();
            //Chamando método battle para iniciar os ataques
            jogar.battle();

            //Chamando método attackClean para limpar tabuleiro
            jogar.attackClean();
        }
        else if (op == 2){
            //Se op for 2 o jogo encerra com o System.exit(0)
            System.out.println("Saindo...");
            System.exit(0);
        }
        else {
            //Else para caso de escolha inválida, jogo encerra
            System.out.println("Número inválido, fechando programa...");
        }
    }
}