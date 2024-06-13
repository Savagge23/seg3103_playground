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
                newGame.playX(i,j);
                }
            }
        assertTrue(newGame.tableisFull());
    }

    @Test
    void gameWon_tc05(){
        TicTacToe newGame = new TicTacToe();
        assertFalse(newGame.isGameWon());
        newGame.playX(0,1);
        newGame.playX(1,1);
        newGame.playX(2,1);

        assertTrue(newGame.isGameWon());
    }

    @Test
    void playMove_invalid_TC06(){
        TicTacToe newGame = new TicTacToe();
        newGame.playO(2,1);
        assertThrows(
                IllegalArgumentException.class,
                () -> newGame.playX(2,1)
    );
    }

    @Test
    void playMove_invalid_TC07(){
        TicTacToe newGame = new TicTacToe();
        newGame.playO(0,1);
        newGame.playX(1,1);
        newGame.playO(0,2);
        newGame.playX(2,1);
        newGame.playO(0,3);
        assertThrows(
                IllegalArgumentException.class,
                () -> newGame.playX(3,1)
    );
    }



}





