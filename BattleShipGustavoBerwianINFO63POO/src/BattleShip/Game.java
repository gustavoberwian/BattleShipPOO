package BattleShip;

import java.util.Scanner;

/**
 * Classe Game
 *
 * Classe onde está contido valores e métodos para o funcionamento do jogo
 * @author Gustavo Berwian
 * @since 13/09/2020
 */
public class Game {

    Scanner in = new Scanner(System.in);
    private static String player1;
    private static String player2;

    private static final String[][] battleField1 = {
            {"  ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
            {"01", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"02", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"03", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"04", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"05", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"06", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"07", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"08", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"09", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"10", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
    };

    private static final String[][] battleField2 = {
            {"  ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
            {"01", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"02", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"03", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"04", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"05", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"06", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"07", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"08", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"09", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"10", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
    };

    private static final String[][] attackField1 = {
            {"  ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
            {"01", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"02", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"03", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"04", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"05", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"06", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"07", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"08", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"09", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"10", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
    };

    private static final String[][] attackField2 = {
            {"  ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
            {"01", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"02", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"03", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"04", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"05", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"06", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"07", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"08", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"09", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"10", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
    };

    private static final String[][] toClean = {
            {"  ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
            {"01", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"02", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"03", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"04", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"05", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"06", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"07", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"08", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"09", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"10", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
    };

    /**
     * Método para retorno do nome do jogador 1
     * @return player1
     * @since 08/09/2020
     */
    public String getPlayer1(){ return player1; }

    /**
     * Método utilizado para alterar os valores de forma segura
     * @param player1 String
     * @since 08/09/2020
     */
    public void setPlayer1(String player1){ Game.player1 = player1; }

    /**
     * Método para retorno do nome do jogador 2
     * @return player2
     * @since 08/09/2020
     */
    public String getPlayer2(){ return player2; }

    /**
     * Método utilizado para alterar os valores de forma segura
     * @param player2 String
     * @since 08/09/2020
     */
    public void setPlayer2(String player2){ Game.player2 = player2; }

    /**
     * Método que mostra o campo de batalha do jogador 1 na tela
     * @since 08/09/2020
     */
    public void getBattleField1() {
        //Um for para obter o campo de batalha
        for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                System.out.print(battleField1[l][c]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Método criado para posicionar navios
     * @param battleField1 String
     * @param a int
     * @param b int
     * @param t int
     * @since 08/09/2020
     */
    public void setBattleField1(String battleField1, int a, int b, int t){
        //Verificando valor de t com if
        if (t == 0){
            //Verificação de disponibilidade de coordenadas escolhidas
            while (Game.battleField1[a][b].equals("X")){
                System.out.println("Posição já ocupada. Escolha outra");
                System.out.println("Linha: ");
                a = in.nextInt();
                //Verificação de disponibilidade de coordenada escolhida
                while (a>10 || a<1){
                    System.out.println("Posição inválida. Digite outra");
                    a = in.nextInt();
                }
                System.out.println("Coluna: ");
                b = in.nextInt();
                //Verificação de disponibilidade de coordenada escolhida
                while (b>10 || b<1){
                    System.out.println("Posição inválida. Digite outra");
                    b = in.nextInt();
                }
            }
            //Retorna campo de batalha com o navio já inserido nas posições [a][b]
            Game.battleField1[a][b] = battleField1;
        }
        if (t == 1){
            int h;
            //Definindo valor de h, do qual será a escolha do jogador sobre a posição do seu barco
            do {
                System.out.println("Escolha a posição do navio:\n1- Horizontal\n2- Vertical");
                h = in.nextInt();
            } while (h != 1 && h != 2);
            //Verificando valor de h com if
            if (h == 1) {
                //Verificação de disponibilidade da coordenada escolhida
                while (b+1>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (a>10||a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (b>10||b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificação de disponibilidade das coordenadas escolhidas
                while (Game.battleField1[a][b].equals("X") || Game.battleField1[a][b + 1].equals("X")){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField1[a][b] = battleField1;
                Game.battleField1[a][b+1] = battleField1;
            }
            else {
                //Verificação de disponibilidade da coordenada escolhida
                while (a+1 > 10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificação de disponibilidade das coordenadas escolhidas
                while (Game.battleField1[a][b].equals("X") || Game.battleField1[a + 1][b].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (a>10||a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (b>10||b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField1[a][b] = battleField1;
                Game.battleField1[a+1][b] = battleField1;
            }
        }
        if (t == 2) {
            int h;
            //Definindo valor de h, do qual será a escolha do jogador sobre a posição do seu barco
            do {
                System.out.println("Escolha a posição do navio:\n1- Horizontal\n2- Vertical");
                h = in.nextInt();
            } while (h != 1 && h != 2);

            if (h == 1) {
                //Verificação de disponibilidade das coordenadas escolhidas
                while (b+1>10 || b+2>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    //Verificação de disponibilidade da coordenada escolhida
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField1[a][b].equals("X") || Game.battleField1[a][b + 1].equals("X") || Game.battleField1[a][b + 2].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField1[a][b] = battleField1;
                Game.battleField1[a][b+1] = battleField1;
                Game.battleField1[a][b+2] = battleField1;
            }
            else {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (a+1>10 || a+2>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10||a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10||b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField1[a][b].equals("X") || Game.battleField1[a + 1][b].equals("X") || Game.battleField1[a + 2][b].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10||a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10||b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField1[a][b] = battleField1;
                Game.battleField1[a+1][b] = battleField1;
                Game.battleField1[a+2][b] = battleField1;
            }
        }
        if (t == 3) {
            int h;
            //Definindo valor de h, do qual será a escolha do jogador sobre a posição do seu barco
            do {
                System.out.println("Escolha a posição do navio:\n1- Horizontal\n2- Vertical");
                h = in.nextInt();
            } while (h != 1 && h != 2);

            if (h == 1) {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (b+1>10 || b+2>10 || b+3>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField1[a][b].equals("X") || Game.battleField1[a][b + 1].equals("X") || Game.battleField1[a][b + 2].equals("X") || Game.battleField1[a][b + 3].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField1[a][b] = battleField1;
                Game.battleField1[a][b+1] = battleField1;
                Game.battleField1[a][b+2] = battleField1;
                Game.battleField1[a][b+3] = battleField1;
            }
            else {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (a+1>10 || a+2>10 || a+3>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField1[a][b].equals("X") || Game.battleField1[a + 1][b].equals("X") || Game.battleField1[a + 2][b].equals("X") || Game.battleField1[a + 3][b].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10||a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10||b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField1[a][b] = battleField1;
                Game.battleField1[a+1][b] = battleField1;
                Game.battleField1[a+2][b] = battleField1;
                Game.battleField1[a+3][b] = battleField1;
            }
        }
    }

    /**
     * Método utilizado para mostrar o campo de batalha do jogador 2 na tela
     * @since 09/09/2020
     */
    public void getBattleField2() {
        //For utilizado para obter o campo de batalha do jogador 2
        for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                System.out.print(battleField2[l][c]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Método criado para posicionar navios
     * @param battleField2 String
     * @param a int
     * @param b int
     * @param t int
     * @since 09/09/2020
     */
    public void setBattleField2(String battleField2, int a, int b, int t) {
        if (t == 0) {
            //Verificações de disponibilidade das coordenadas escolhidas
            while (Game.battleField2[a][b].equals("X")){
                System.out.println("Posição já ocupada. Digite outra:");
                System.out.println("Linha:");
                a = in.nextInt();
                while (a>10||a<1) {
                    System.out.println("Posição inválida. Digite outra:");
                    a = in.nextInt();
                }
                System.out.println("Coluna:");
                b = in.nextInt();
                while (b>10||b<1) {
                    System.out.println("Posição inválida. Digite outra:");
                    b = in.nextInt();
                }
            }
            //Retorna campo de batalha com o navio já inserido nas posições [a][b]
            Game.battleField2[a][b] = battleField2;
        }
        if (t == 1) {
            int h;
            //Definindo valor de h, do qual será a escolha do jogador sobre a posição do seu barco
            do {
                System.out.println("Escolha a posição do navio:\n1- Horizontal\n2- Vertical");
                h = in.nextInt();
            } while (h != 1 && h != 2);

            if (h == 1) {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (b+1>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField2[a][b].equals("X") || Game.battleField2[a][b + 1].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField2[a][b] = battleField2;
                Game.battleField2[a][b+1] = battleField2;
            }
            else {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (a+1>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField2[a][b].equals("X") || Game.battleField2[a + 1][b].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField2[a][b] = battleField2;
                Game.battleField2[a+1][b] = battleField2;
            }
        }
        if (t == 2) {
            int h;
            //Definindo valor de h, do qual será a escolha do jogador sobre a posição do seu barco
            do {
                System.out.println("Escolha a posição do navio:\n1- Horizontal\n2- Vertical");
                h = in.nextInt();
            } while (h != 1 && h != 2);

            if (h == 1) {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (b+1>10 || b+2>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10||a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10||b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField2[a][b].equals("X") || Game.battleField2[a][b + 1].equals("X") || Game.battleField2[a][b + 2].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField2[a][b] = battleField2;
                Game.battleField2[a][b+1] = battleField2;
                Game.battleField2[a][b+2] = battleField2;
            }
            else {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (a+1>10 || a+2>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField2[a][b].equals("X") || Game.battleField2[a + 1][b].equals("X") || Game.battleField2[a + 2][b].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField2[a][b] = battleField2;
                Game.battleField2[a+1][b] = battleField2;
                Game.battleField2[a+2][b] = battleField2;
            }
        }
        if (t == 3) {
            int h;
            //Definindo valor de h, do qual será a escolha do jogador sobre a posição do seu barco
            do {
                System.out.println("Escolha a posição do navio:\n1- Horizontal\n2- Vertical");
                h = in.nextInt();
            } while (h != 1 && h != 2);

            if (h == 1) {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (b+1>10 || b+2>10 || b+3>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField2[a][b].equals("X") || Game.battleField2[a][b + 1].equals("X") || Game.battleField2[a][b + 2].equals("X") || Game.battleField2[a][b + 3].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField2[a][b] = battleField2;
                Game.battleField2[a][b+1] = battleField2;
                Game.battleField2[a][b+2] = battleField2;
                Game.battleField2[a][b+3] = battleField2;
            }
            else {
                //Verificações de disponibilidade das coordenadas escolhidas
                while (a+1>10 || a+2>10 || a+3>10){
                    System.out.println("Posição inválida. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Verificações de disponibilidade das coordenadas escolhidas
                while (Game.battleField2[a][b].equals("X") || Game.battleField2[a + 1][b].equals("X") || Game.battleField2[a + 2][b].equals("X") || Game.battleField2[a + 3][b].equals("X")){
                    System.out.println("Posição já ocupada. Digite outra:");
                    System.out.println("Linha:");
                    a = in.nextInt();
                    while (a>10 || a<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        a = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    b = in.nextInt();
                    while (b>10 || b<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        b = in.nextInt();
                    }
                }
                //Retorna campo de batalha com o navio já inserido nas posições [a][b]
                Game.battleField2[a][b] = battleField2;
                Game.battleField2[a+1][b] = battleField2;
                Game.battleField2[a+2][b] = battleField2;
                Game.battleField2[a+3][b] = battleField2;
            }
        }
    }

    /**
     * Método criado para mostrar o campo de ataque
     * @since 10/09/2020
     */
    public void getAttackField1() {
        //For utilizado para obter o campo de ataque do jogador 1
        for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                System.out.print(attackField1[l][c]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Método criado para o jogador 1 fazer seu ataque
     * @param a int
     * @param b int
     * @return false
     */
    public boolean setAttackField1(int a, int b) {

        //Verificando coordenadas de ataque com  IF
        if (battleField2[a][b].equals("X") && attackField2[a][b].equals("~")) {

            //Atribuindo "X" a attackField2 se houver "~"
            attackField2[a][b] = "X";
            //Atribuindo "O" a battleFIeld2 se houver "X"
            battleField2[a][b] = "O";
            //Criando e inicializando contador
            int cont = 0;

            //FOR para contar a quantidade de barcos atingidos
            for (int l = 0; l < 11; l++) {
                for (int c = 0; c < 11; c++) {
                    if (battleField2[l][c].equals("X")) {
                        cont++;
                    }
                }
            }
            //Se o contador for 0 o jogador 1 vence
            if (cont == 0) {
                System.out.println(this.getPlayer1()+" venceu!");
                return true;
            }
            //Enquanto o contador não for 0 o jogo continua
            System.out.println("Bom tiro! Faltam "+cont+" tiros como este para a vitória! Você tem mais uma jogada:");
            this.getAttackField2();
            System.out.println("Linha:");
            int pos = in.nextInt();
            //Verificando disponibilidade da posição escolhida
            while (pos>10 || pos<1) {
                System.out.println("Posição inválida. Digite outra:");
                pos = in.nextInt();
            }
            System.out.println("Coluna:");
            int pos2 = in.nextInt();
            //Verificando disponibilidade da posição escolhida
            while (pos2>10 || pos2<1) {
                System.out.println("Posição inválida. Digite outra:");
                pos2 = in.nextInt();
            }
            //Verificando posições selecionadas
            if (battleField2[pos][pos2].equals("X") && attackField2[pos][pos2].equals("~")) {
                //Atribuindo "X" a attackField2 se houver "~"
                attackField2[pos][pos2] = "X";
                //Atribuindo "O" a battleFIeld2 se houver "X"
                battleField2[pos][pos2] = "O";
                //Criando e inicializando contador
                cont = 0;

                //FOR para contar a quantidade de barcos atingidos
                for (int l = 0; l < 11; l++) {
                    for (int c = 0; c < 11; c++) {
                        if (battleField2[l][c].equals("X")) {
                            cont++;
                        }
                    }
                }
                //Se contador for 0 o jogador 1 vence
                if (cont == 0) {
                    System.out.println(this.getPlayer1()+" venceu!");
                    return true;
                }
                //Enquanto o contador não for 0 o jogo continua
                System.out.println("Bom tiro! Faltam "+cont+" tiros como este para a vitória! Você tem mais uma jogada:");
                this.getAttackField1();
            }
            //Verificando posição selecionada
            else if(attackField2[pos][pos2].equals("X") || attackField2[pos][pos2].equals("O")){
                do {
                    System.out.println("Posição já jogada. Digite outra:");
                    System.out.println("Linha:");
                    pos = in.nextInt();
                    //Verificando posição selecionada
                    while (pos>10 || pos<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        pos = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    pos2 = in.nextInt();
                    //Verificando posição selecionada
                    while (pos2>10 || pos2<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        pos2 = in.nextInt();
                    }
                } while (!attackField2[pos][pos2].equals("~"));

                //Verificando posições selecionadas
                if (battleField2[pos][pos2].equals("X") && attackField2[pos][pos2].equals("~")) {
                    //Atribuindo "X" a attackField2 se houver "~"
                    attackField2[pos][pos2] = "X";
                    //Atribuindo "O" a battleFIeld2 se houver "X"
                    battleField2[pos][pos2] = "O";
                    //Criando e inicializando contador
                    cont = 0;

                    //FOR para contar a quantidade de barcos atingidos
                    for (int l = 0; l < 11; l++) {
                        for (int c = 0; c < 11; c++) {
                            if (battleField2[l][c].equals("X")) {
                                cont++;
                            }
                        }
                    }

                    //Se contador for 0 o jogador 1 vence
                    if (cont == 0) {
                        System.out.println(this.getPlayer1()+" venceu!");
                        return true;
                    }
                    //Enquanto o contador não for 0 o jogo continua
                    System.out.println("Bom tiro! Faltam "+cont+" tiros como este para a vitória! Você tem mais uma jogada:");
                    //retorna o campo atualizado
                    this.getAttackField1();
                }
                else if (battleField2[pos][pos2].equals("~")) {
                    //Se a posição escolhida for "~" o tiro foi na água
                    System.out.println("Tiro na água!");
                    attackField2[pos][pos2] = "O";
                    //retorna o campo atualizado
                    this.getAttackField1();
                }
            }
            else if (battleField2[pos][pos2].equals("~")) {
                //Se a posição escolhida for "~" o tiro foi na água
                System.out.println("Tiro na água!");
                attackField2[pos][pos2] = "O";
                //retorna o campo atualizado
                this.getAttackField1();
            }
        }
        else if(!attackField2[a][b].equals("~")){
            System.out.println("Posição já jogada. Digite outra:");
            System.out.println("Linha:");
            int pos = in.nextInt();
            //Verifica posições escolhidas
            while (pos>10 || pos<1) {
                System.out.println("Posição inválida. Digite outra:");
                pos = in.nextInt();
            }
            System.out.println("Coluna:");
            int pos2 = in.nextInt();
            //Verifica posições escolhidas
            while (pos2>10 || pos2<1) {
                System.out.println("Posição inválida. Digite outra:");
                pos2 = in.nextInt();
            }
            //retorna o campo atualizado
            this.setAttackField2(pos, pos2);
        }
        else if (battleField2[a][b].equals("~")) {
            //Se a posição escolhida for "~" o tiro foi na água
            System.out.println("Tiro na água!");
            attackField2[a][b] = "O";
            //retorna o campo atualizado
            this.getAttackField1();
        }
        return false;
    }

    /**
     * Método criado para mostrar o campo de ataque
     * @since 10/09/2020
     */
    public void getAttackField2() {
        //FOR para obter o campo de ataque do jogador 2
        for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                System.out.print(attackField2[l][c]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Método criado para o jogador 2 fazer seu ataque
     * @param a int
     * @param b int
     * @return false
     */
    public boolean setAttackField2(int a, int b) {
        //Verificando posições selecionadas
        if (battleField1[a][b].equals("X") && attackField1[a][b].equals("~")) {
            //Atribuindo "X" a attackField2 se houver "~"
            attackField1[a][b] = "X";
            //Atribuindo "O" a battleFIeld2 se houver "X"
            battleField1[a][b] = "O";
            //Criando e inicializando contador
            int cont = 0;

            //FOR para contar os barcos atingidos
            for (int l = 0; l < 11; l++) {
                for (int c = 0; c < 11; c++) {
                    if (battleField1[l][c].equals("X")) {
                        cont++;
                    }
                }
            }

            //Se contator for 0 o jogador 2 vence
            if (cont == 0) {
                System.out.println(this.getPlayer2()+" venceu!");
                return true;
            }
            //Enquanto contador não for 0 o jogo continua
            System.out.println("Bom tiro! Faltam "+cont+" tiros como este para a vitória! Você tem mais uma jogada:");
            //retorna o campo atualizado
            this.getAttackField1();
            System.out.println("Linha:");
            int pos = in.nextInt();
            //Verificando posições selecionadas
            while (pos>10 || pos<1) {
                System.out.println("Posição inválida. Digite outra:");
                pos = in.nextInt();
            }
            System.out.println("Coluna:");
            int pos2 = in.nextInt();
            //Verificando posições selecionadas
            while (pos2>10 || pos2<1) {
                System.out.println("Posição inválida. Digite outra:");
                pos2 = in.nextInt();
            }
            //Verificando posições selecionadas
            if (battleField1[pos][pos2].equals("X") && attackField1[pos][pos2].equals("~")) {
                //Atribuindo "X" a attackField2 se houver "~"
                attackField1[pos][pos2] = "X";
                //Atribuindo "O" a battleFIeld2 se houver "X"
                battleField1[pos][pos2] = "O";
                //Criando e inicializando contador
                cont = 0;

                //FOR para contar os barcos atingidos
                for (int l = 0; l < 11; l++) {
                    for (int c = 0; c < 11; c++) {
                        if (battleField1[l][c].equals("X")) {
                            cont++;
                        }
                    }
                }

                //Se contator for 0 o jogador 2 vence
                if (cont == 0) {
                    System.out.println(this.getPlayer2()+" venceu!");
                    return true;
                }
                //Enquanto contador não for 0 o jogo continua
                System.out.println("Bom tiro! Faltam "+cont+" tiros como este para a vitória! Você tem mais uma jogada:");
                //retorna o campo atualizado
                this.getAttackField1();
            }
            //Verificando posições selecionadas
            else if(attackField1[pos][pos2].equals("X") || attackField1[pos][pos2].equals("O")){
                do {
                    System.out.println("Posição já jogada. Digite outra:");
                    System.out.println("Linha:");
                    pos = in.nextInt();
                    //Verificando posições selecionadas
                    while (pos>10 || pos<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        pos = in.nextInt();
                    }
                    System.out.println("Coluna:");
                    pos2 = in.nextInt();
                    //Verificando posições selecionadas
                    while (pos2>10 || pos2<1) {
                        System.out.println("Posição inválida. Digite outra:");
                        pos2 = in.nextInt();
                    }
                } while (!attackField1[pos][pos2].equals("~"));

                //Verificando posições selecionadas
                if (battleField1[pos][pos2].equals("X") && attackField1[pos][pos2].equals("~")) {
                    //Atribuindo "X" a attackField2 se houver "~"
                    attackField1[pos][pos2] = "X";
                    //Atribuindo "O" a battleFIeld2 se houver "X"
                    battleField1[pos][pos2] = "O";
                    //Criando e inicializando contador
                    cont = 0;

                    //FOR para contar os barcos atingidos
                    for (int l = 0; l < 11; l++) {
                        for (int c = 0; c < 11; c++) {
                            if (battleField1[l][c].equals("X")) {
                                cont++;
                            }
                        }
                    }
                    //Se contator for 0 o jogador 2 vence
                    if (cont == 0) {
                        System.out.println(this.getPlayer2()+" venceu!");
                        return true;
                    }
                    //Enquanto contador não for 0 o jogo continua
                    System.out.println("Bom tiro! Faltam "+cont+" tiros como este para a vitória! Você tem mais uma jogada:");
                    //retorna o campo atualizado
                    this.getAttackField1();
                }
                else if (battleField1[pos][pos2].equals("~")) {
                    //Se a posição escolhida for "~" o tiro foi na água
                    System.out.println("Tiro na água!");
                    attackField1[pos][pos2] = "O";
                    //retorna o campo atualizado
                    this.getAttackField1();
                }
            }
            else if (battleField1[pos][pos2].equals("~")) {
                //Se a posição escolhida for "~" o tiro foi na água
                System.out.println("Tiro na água!");
                attackField1[pos][pos2] = "O";
                //retorna o campo atualizado
                this.getAttackField1();
            }
        }
        else if(!attackField1[a][b].equals("~")){
            System.out.println("Posição já jogada. Digite outra:");
            System.out.println("Linha:");
            int pos = in.nextInt();
            //Verificando posições selecionadas
            while (pos>10 || pos<1) {
                System.out.println("Posição inválida. Digite outra:");
                pos = in.nextInt();
            }
            System.out.println("Coluna:");
            int pos2 = in.nextInt();
            //Verificando posições selecionadas
            while (pos2>10 || pos2<1) {
                System.out.println("Posição inválida. Digite outra:");
                pos2 = in.nextInt();
            }
            //retorna o campo atualizado
            this.setAttackField2(pos, pos2);
        }
        else if (battleField1[a][b].equals("~")) {
            //Se a posição escolhida for "~" o tiro foi na água
            System.out.println("Tiro na água!");
            attackField1[a][b] = "O";
            //retorna o campo atualizado
            this.getAttackField1();
        }
        return false;
    }

    /**
     * Método criado para limpar os campos de batalha
     * @since 10/09/2020
     */
    public void attackClean(){
        //FOR para obter e limpar todos os campos
        for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                battleField1[l][c] = toClean[l][c];
                battleField2[l][c] = toClean[l][c];
                attackField1[l][c] = toClean[l][c];
                attackField2[l][c] = toClean[l][c];
            }
        }
    }
}