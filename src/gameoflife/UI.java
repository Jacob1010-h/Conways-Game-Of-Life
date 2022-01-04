package gameoflife;
import java.util.Scanner;

/**
 * UI class
 */
public class UI
{
    Scanner stopScanner;
    Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);  
        stopScanner = new Scanner(System.in);
    }

    // Utility methods
    public String getXOrO(int whoseMove) {
        if(whoseMove == 1){
            return "?";
        }else{
            return " ";
        }
    }

    public boolean isLegalMove(State state, int row, int col) {
        return 1 <= row && row <= Constants.BOARD_SIZE &&
        1 <= col && col <= Constants.BOARD_SIZE &&
        state.getBoardCell(row-1, col-1) == Constants.BLANK;
    }

    public boolean getFinished(int whoseMove){
        String finished = "";
        System.out.println(Constants.CHECK_STOP_STR);
        finished = stopScanner.next();
        if(finished.equals("y") || finished.equals("Y")){
            return true;
        }
        return false;
    }

    //New Board Functions
    public void createNewBoard(State state){
        for(int row = 0; row < Constants.BOARD_SIZE; row++){
            for(int col = 0; col< Constants.BOARD_SIZE; col++){
                if(state.getBoardCell(row,col) == Constants.PLAYER){
                    state.setNewBoardCell(row, col, Constants.PLAYER);
                }
            }
        }
    }

    public void clearNewBoard(State state){
        for(int row = 0; row < Constants.BOARD_SIZE; row++){
            for(int col =0; col < Constants.BOARD_SIZE; col++){
                state.setNewBoardCell(row, col, Constants.BLANK);
            }
        }
    }

    public void printNewBoard(State state) {
        System.out.println(Constants.DIVIDER_STRING);
        for (int row = 0; row < Constants.BOARD_SIZE; row++) {
            System.out.printf(Constants.BOARD_STRING, getXOrO(state.getNewBoardCell(row, 0)), 
                getXOrO(state.getNewBoardCell(row, 1)), 
                getXOrO(state.getNewBoardCell(row, 2)),
                getXOrO(state.getNewBoardCell(row, 3)),
                getXOrO(state.getNewBoardCell(row, 4)),
                getXOrO(state.getNewBoardCell(row, 5)),
                getXOrO(state.getNewBoardCell(row, 6)),
                getXOrO(state.getNewBoardCell(row, 7)),
                getXOrO(state.getNewBoardCell(row, 8)),
                getXOrO(state.getNewBoardCell(row, 9)));
            System.out.println();
            System.out.println(Constants.DIVIDER_STRING);
        }
    }

    //Copy New Board
    public void copyNewBoard(State state){
        for(int row = 0; row < Constants.BOARD_SIZE; row++){
            for(int col = 0; col < Constants.BOARD_SIZE; col++){
                if(state.getNewBoardCell(row,col) == Constants.PLAYER){
                    state.setBoardCell(row, col, Constants.PLAYER);
                }
            }
        }
    }

    //Life functions
    public void giveLife(State state){
        for(int row = 1; row < Constants.BOARD_SIZE-1; row++){
            for(int col = 1; col< Constants.BOARD_SIZE-1; col++){
                //if(state.getBoardCell(row, col) == Constants.PLAYER){
                if(checkCellLife(row, col, state) == false){
                    state.setNewBoardCell(row, col, Constants.BLANK);
                }else if(checkCellLife(row, col, state) == true){
                    state.setNewBoardCell(row, col, Constants.PLAYER);
                }
                if(checkCellLifeDeath(row, col, state) == false){
                    if(state.getBoardCell(row, col) == Constants.PLAYER){
                        
                    }else{
                        state.setNewBoardCell(row, col, Constants.BLANK);
                    }
                }else{
                    state.setNewBoardCell(row, col, Constants.PLAYER);
                }
                //}
            }
        }
    }
    
    public boolean checkCellLife(int row, int col, State state){
        int life = 0;
        if(state.getBoardCell(row, col) == Constants.PLAYER){
            //Bottom Right
            if(state.getBoardCell(row+1,col+1) == Constants.PLAYER){
                life++;
            }
            //Bottom
            if(state.getBoardCell(row+1,col) == Constants.PLAYER){
                life++;
            }
            //Bottom Left
            if(state.getBoardCell(row+1, col-1) == Constants.PLAYER){
                life++;
            }
            //Left Mid
            if(state.getBoardCell(row, col-1) == Constants.PLAYER){
                life++;
            }
            //Top Left
            if(state.getBoardCell(row-1, col-1) == Constants.PLAYER){
                life++;
            }
            //Top
            if(state.getBoardCell(row-1, col) == Constants.PLAYER){
                life++;
            }
            //Top Right
            if(state.getBoardCell(row-1, col+1) == Constants.PLAYER){
                life++;
            }
            //Right
            if(state.getBoardCell(row, col+1) == Constants.PLAYER){
                life++;
            }
            
            //Life Returns
            if(life == 2 || life == 3)return true;
        }
        return false;
    }

    public boolean checkCellLifeDeath(int row, int col, State state){
        int life = 0;
        if(state.getBoardCell(row, col) == Constants.BLANK){
            //Bottom Right
            if(state.getBoardCell(row+1,col+1) == Constants.PLAYER){
                life++;
            }
            //Bottom
            if(state.getBoardCell(row+1,col) == Constants.PLAYER){
                life++;
            }
            //Bottom Left
            if(state.getBoardCell(row+1, col-1) == Constants.PLAYER){
                life++;
            }
            //Left Mid
            if(state.getBoardCell(row, col-1) == Constants.PLAYER){
                life++;
            }
            //Top Left
            if(state.getBoardCell(row-1, col-1) == Constants.PLAYER){
                life++;
            }
            //Top
            if(state.getBoardCell(row-1, col) == Constants.PLAYER){
                life++;
            }
            //Top Right
            if(state.getBoardCell(row-1, col+1) == Constants.PLAYER){
                life++;
            }
            //Right
            if(state.getBoardCell(row, col+1) == Constants.PLAYER){
                life++;
            }
            
            //Life Returns
            if(life == 3)return true;
        }
        return false;
    }


    //MISC
    public int getMoveRow(int whoseMove) {
        int row = 0;
        while (row <= 0 || row >= 11) {
            if(row < 11){
                try {
                    System.out.printf(Constants.GET_ROW_MOVE, getXOrO(whoseMove));
                    row = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                    scanner.next();
                }
            }else{
                printInvalidRowOrColumn();
                System.out.println();
                row = 0;
            }
        }
        return row;
    } 

    public int getMoveCol(int whoseMove) {
        int col = 0;
        while (col <= 0 || col >= 11) {
            if (col < 11){
                try {
                    System.out.printf(Constants.GET_COL_MOVE, getXOrO(whoseMove));
                    col = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                    scanner.next();
                }
            }else{
                printInvalidRowOrColumn();
                System.out.println();
                col = 0;
            }
        }
        return col;
    }

    public boolean startNewGame() {
        System.out.println(Constants.START_NEW_GAME);
        String yesOrNo = scanner.next();
        return yesOrNo.equals("Y") || yesOrNo.equals ("y");
    }

    // Printing text methods
    public void printWelcome() {
        System.out.println(Constants.TITLE);
    }

    public void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public void printBoard(State state) {
        System.out.println(Constants.DIVIDER_STRING);
        for (int row = 0; row < Constants.BOARD_SIZE; row++) {
            System.out.printf(Constants.BOARD_STRING, getXOrO(state.getBoardCell(row, 0)), 
                getXOrO(state.getBoardCell(row, 1)), 
                getXOrO(state.getBoardCell(row, 2)),
                getXOrO(state.getBoardCell(row, 3)),
                getXOrO(state.getBoardCell(row, 4)),
                getXOrO(state.getBoardCell(row, 5)),
                getXOrO(state.getBoardCell(row, 6)),
                getXOrO(state.getBoardCell(row, 7)),
                getXOrO(state.getBoardCell(row, 8)),
                getXOrO(state.getBoardCell(row, 9)));
            System.out.println();
            System.out.println(Constants.DIVIDER_STRING);
        }
    }

    public void clearBoard(State state){
        for(int row = 0; row < Constants.BOARD_SIZE; row++){
            for(int col =0; col < Constants.BOARD_SIZE; col++){
                state.setBoardCell(row, col, Constants.BLANK);
            }
        }
    }

    public void printInvalidRowOrColumn() {
        System.out.printf(Constants.INVALID_ROW_OR_COLUMN);
        System.out.println();
    }

    public void printInvalidMove(int row, int col) {
        System.out.printf(Constants.INVALID_MOVE_ERROR, row, col);
        System.out.println();
    }

    public void welcomePlayer(State state){
        System.out.println(Constants.WELCOME_TITLE);
        state.setGameState(Constants.GET_PLAYER_MOVE);
    }

    public void printMove(State state, int row, int col) {
        System.out.printf(
            Constants.PRINT_MOVE, 
            getXOrO(state.getWhoseMove()), 
            row, 
            col
        );
        System.out.println();
    } 
}