package main;

public class TicTacToe {
    private static String table[][];

    public TicTacToe(){
        table = new String[3][3];
        loadTable();
    }

    private void loadTable(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                table[i][j] = " ";
            }
        }
    }

    public static String getCell(int i, int j){
        return table[i][j];
    }

    public void playX(int i, int j){
        table[i][j] = "X";
    }
}
