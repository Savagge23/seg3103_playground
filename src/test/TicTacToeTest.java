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

    @Test
    void playMove_tc02(){
        TicTacToe newGame = new TicTacToe();
        newGame.playX(2,1);
        assertEquals("X", newGame.getCell(2,1));
    }

    @Test
    void playMove_tc03(){
        TicTacToe newGame = new TicTacToe();
        newGame.playO(2,1);
        assertEquals("O", newGame.getCell(2,1));
    }

    @Test
    void tableisFull_tc04(){
        TicTacToe newGame = new TicTacToe();
        assertFalse(newGame.tableisFull());

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                newGame.playX(1,j);
                }
            }
        assertTrue(newGame.tableisFull());
    }

}





