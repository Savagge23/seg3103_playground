package test;


import static org.junit.jupiter.api.Assertions.*;
import main.TicTacToe;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    @Test
    void newGame_tc01(){
        TicTacToe newGame = new TicTacToe();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                assertEquals(" ", TicTacToe.getCell(i,j));
            }
        }
    }


}
