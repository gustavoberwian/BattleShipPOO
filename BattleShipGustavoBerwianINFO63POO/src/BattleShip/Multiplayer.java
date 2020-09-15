package BattleShip;

import java.util.Scanner;

/**
 * Classe Multiplayer
 *
 * Classe onde está contido métodos para o funcionamento do modo multiplayer do jogo
 * @author Gustavo Berwian
 * @since 13/09/2020
 */
public class Multiplayer extends Game{
    Scanner in = new Scanner(System.in);

    /**
     * Método criado para obter o nome dos jogadores
     * @since 13/09/2020
     */
    public void readNames(){
        //Retorna nome jogador 1
        System.out.println("Digite seu nome jogador 1: ");
        String player1 = in.nextLine();
        this.setPlayer1(player1);

        //Retorna nome jogador 2
        System.out.println("Digite seu nome jogador 2: ");
        String player2 = in.nextLine();
        this.setPlayer2(player2);
    }

    /**
     * Método criado para definir as posições do barcos no campo de batalha do jogador 1
     * @since 13/09/2020
     */
    public void battlePlayer1(){
        //FOR para definir posição do navio
        for (int i=0; i<4; i++){
            System.out.println(this.getPlayer1()+", defina a posição do seu "+ (i+1) +"º Submarino (1 espaço): ");
            this.getBattleField1();
            System.out.println("Linha: ");
            int pos = in.nextInt();

            //Verificando posição
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }

            System.out.println("Coluna: ");
            int pos2 = in.nextInt();

            //Verificando posição
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna campo com navio posicionado
            this.setBattleField1("X", pos, pos2, 0);
        }
        for (int i=0; i<3; i++){
            //FOR para definir posição do navio
            System.out.println(this.getPlayer1()+", defina a posição do seu "+ (i+1) +"º Cruzador (2 espaço): ");
            this.getBattleField1();
            System.out.println("Linha: ");
            int pos = in.nextInt();

            //Verificando posição
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }

            System.out.println("Coluna: ");
            int pos2 = in.nextInt();

            //Verificando posição
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna campo com navio posicionado
            this.setBattleField1("X", pos, pos2, 1);
        }
        for (int i=0; i<2; i++){
            //FOR para definir posição do navio
            System.out.println(this.getPlayer1()+", defina a posição do seu "+ (i+1) +"º Destroyer (3 espaço): ");
            this.getBattleField1();
            System.out.println("Linha: ");
            int pos = in.nextInt();

            //Verificando posição
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }

            System.out.println("Coluna: ");
            int pos2 = in.nextInt();

            //Verificando posição
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna campo com navio posicionado
            this.setBattleField1("X", pos, pos2, 2);
        }
        for (int i=0; i<1; i++){
            //FOR para definir posição do navio
            System.out.println(this.getPlayer1()+", defina a posição do seu Porta-Aviões (4 espaços): ");
            this.getBattleField1();
            System.out.println("Linha: ");
            int pos = in.nextInt();

            //Verificando posição
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }

            System.out.println("Coluna: ");
            int pos2 = in.nextInt();

            //Verificando posição
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna campo com navio posicionado
            this.setBattleField1("X", pos, pos2, 3);
        }
        //Retorna campo com todos os navios posicionados
        this.getBattleField1();
        System.out.println("É importante se lembrar destas posições. Se for preciso, anote");
    }

    /**
     * Método criado para definir as posições dos barcos no campo de batalha do jogador 2
     * @since 13/09/2020
     */
    public void battlePlayer2(){
        for (int i=0; i<4; i++){
            //FOR para definir posição do navio
            System.out.println(this.getPlayer2()+", defina a posição do seu "+ (i+1) +"º Submarino (1 espaço): ");
            this.getBattleField2();
            System.out.println("Linha: ");
            int pos = in.nextInt();

            //Verificando posição
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }

            System.out.println("Coluna: ");
            int pos2 = in.nextInt();

            //Verificando posição
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna campo com navio posicionado
            this.setBattleField2("X", pos, pos2, 0);
        }
        for (int i=0; i<3; i++){
            //FOR para definir posição do navio
            System.out.println(this.getPlayer2()+", defina a posição do seu "+ (i+1) +"º Cruzador (2 espaço): ");
            this.getBattleField2();
            System.out.println("Linha: ");
            int pos = in.nextInt();

            //Verificando posição
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }

            System.out.println("Coluna: ");
            int pos2 = in.nextInt();

            //Verificando posição
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna campo com navio posicionado
            this.setBattleField2("X", pos, pos2, 1);
        }
        for (int i=0; i<2; i++){
            //FOR para definir posição do navio
            System.out.println(this.getPlayer2()+", defina a posição do seu "+ (i+1) +"º Destroyer (3 espaço): ");
            this.getBattleField2();
            System.out.println("Linha: ");
            int pos = in.nextInt();

            //Verificando posição
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }

            System.out.println("Coluna: ");
            int pos2 = in.nextInt();

            //Verificando posição
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna campo com navio posicionado
            this.setBattleField2("X", pos, pos2, 2);
        }
        for (int i=0; i<1; i++){
            //FOR para definir posição do navio
            System.out.println(this.getPlayer2()+", defina a posição do seu Porta-Aviões (4 espaços): ");
            this.getBattleField2();
            System.out.println("Linha: ");
            int pos = in.nextInt();

            //Verificando posição
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }

            System.out.println("Coluna: ");
            int pos2 = in.nextInt();

            //Verificando posição
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna campo com navio posicionado
            this.setBattleField2("X", pos, pos2, 3);
        }
        //Retorna campo com todos os navios posicionados
        this.getBattleField2();
        System.out.println("É importante se lembrar destas posições. Se for preciso, anote");
    }

    /**
     * Método onde ocorrem os ataques
     * @since 14/09/2020
     */
    public void battle(){
        //Criação variáveis
        int pos = 0;
        int pos2 = 0;
        boolean a;

        //loop enquanto a = false
        do {
            System.out.println(this.getPlayer1()+" faça seu ataque");
            this.getAttackField2();
            System.out.println("Linha: ");
            pos = in.nextInt();

            //Verificando ccoordenadas de ataque
            while (pos>10 || pos<1){
                System.out.println("Posição inválida. Digite outra");
                pos = in.nextInt();
            }
            System.out.println("Coluna: ");
            pos2 = in.nextInt();

            //Verificando ccoordenadas de ataque
            while (pos2>10 || pos2<1){
                System.out.println("Posição inválida. Digite outra");
                pos2 = in.nextInt();
            }
            //Retorna ataque do jogador 1
            a = this.setAttackField1(pos, pos2);
            if (!a){
                System.out.println(this.getPlayer2()+" faça seu ataque");
                this.getAttackField1();
                System.out.println("Linha: ");
                pos = in.nextInt();

                //Verificando ccoordenadas de ataque
                while (pos>10 || pos<1){
                    System.out.println("Posição inválida. Digite outra");
                    pos = in.nextInt();
                }
                System.out.println("Coluna: ");
                pos2 = in.nextInt();

                //Verificando ccoordenadas de ataque
                while (pos2>10 || pos2<1){
                    System.out.println("Posição inválida. Digite outra");
                    pos2 = in.nextInt();
                }
                //Retorna ataque do jogador 2
                a = this.setAttackField2(pos, pos2);
            }
        }while (!a);
    }
}
