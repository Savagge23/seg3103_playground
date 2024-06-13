package main;

public class TicTacToe {
    private static String table[][];

    public TicTacToe() {
        table = new String[3][3];
        loadTable();
    }

    private void loadTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = " ";
            }
        }
    }

    public static String getCell(int i, int j) {
        return table[i][j];
    }

    public void playX(int i, int j) {
        if(isGameWon() == true){
            throw new IllegalArgumentException("Game has already been Won");
        }
        if(table[i][j] != " "){
            throw new IllegalArgumentException("Spot already has been marked");
        }
        table[i][j] = "X";
    }

    public void playO(int i, int j) {
        if(table[i][j] != " "){
            throw new IllegalArgumentException("Spot already has been marked");
        }
        table[i][j] = "O";
    }

    public static boolean tableisFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isGameWon() {
        for (int i = 0; i < 3; i++) {
            if (((table[i][0] == ("X") && table[i][1] == ("X") && table[i][2] == ("X")) ||
                    (table[i][0] == ("O") && table[i][1] == ("O") && table[i][2] == ("O"))) ||
                    ((table[0][i] == ("O") && table[1][i] == ("O") && table[2][i] == ("O")) ||
                            (table[0][i] == ("X") && table[1][i] == ("X") && table[2][i] == ("X"))))
                return true;
            }
        if((table[0][0] == "X" && table[1][1] == "X" && table[2][2] == "X") ||
                (table[0][0] == "O" && table[1][1] == "O" && table[2][2] == "O") ||
                (table[0][2] == "X" && table[1][1] == "X" && table[2][0] == "X") ||
                (table[0][2] == "O" && table[1][1] == "O" && table[2][0] == "O")){
            return true;
        }

            return false;
        }




    }


