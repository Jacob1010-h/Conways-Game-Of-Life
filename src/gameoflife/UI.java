package gameoflife;
import java.io.IOException;
import java.util.Scanner;

/**
 * !UI class
 */
public class UI
{
    Scanner stopScanner;
    Scanner scanner;
    Scanner startScanner;

    public UI() {
        scanner = new Scanner(System.in);  
        stopScanner = new Scanner(System.in);
        startScanner = new Scanner(System.in);
    }

    // Utility methods
    //* Returns a string of what goes in the board
    public String getXOrO(int whoseMove) {
        if(whoseMove == 1){
            return "X";
        }else{
            return " ";
        }
    }

    //! Checks for a leagal move
    public boolean isLegalMove(State state, int row, int col) {
        return 2 <= row && row <= state.getBoardSize() &&
        2 <= col && col <= state.getBoardSize() &&
        state.getBoardCell(row-1, col-1) == Constants.BLANK;
    }

    //* Asks if the user is finished
    public boolean getFinished(int whoseMove){
        String finished = "";
        while(finished.equals("")){
            System.out.println(Constants.CHECK_STOP_STR);
            finished = stopScanner.next();
            if(finished.equals("y") || finished.equals("Y")){
                return true;
            }else if(finished.equals("n") || finished.equals("N")){
                return false;
            }else{
                System.out.println("Invalid input");
                finished = "";
                //! ERROR finished doesnt equal y or n
            }
        }
        return false;
    }

    //! Make Board
    public void makeBoard(State state){        
        int size = 9;
        System.out.println("Set the size of the simulation by inputting a number between 10-20");
        while(size <= 9 || size >= 21){
            if(size < 21){
                try{
                    size = startScanner.nextInt(); 
                    state.setBoardSize(size);
                    state.setNewBoardSize();
                    state.setDivideString();
                    state.setBoardSring();
                    state.setBoardSring10();
                    state.setNumHorizontalString();
                } catch (Exception e) {
                    System.out.println("Invalid Input");
                    startScanner.next();
                }
            }else{
                System.out.println("Invalid input");
                size = 0;
            }
        }
    }

    //* Asks the user if they want a preset board
    public boolean presetStart(){
        String preset = "";
        while(preset.equals("")){
            System.out.println(Constants.PRESET_START);
            preset = startScanner.next();
            if(preset.equals("y") || preset.equals("Y")){
                return true;
            }else if(preset.equals("n") || preset.equals("N")){
                return false;
            }else{
                System.out.println("Invalid input");
                preset = "";
                //! ERROR: preset doesnt equal y or n
            }
        }
        return false;
    }

    //*New Board Functions
    public void createNewBoard(State state){
        for(int row = 0; row < state.getBoardSize(); row++){
            for(int col = 0; col< state.getBoardSize(); col++){
                if(state.getBoardCell(row,col) == Constants.PLAYER){
                    state.setNewBoardCell(row, col, Constants.PLAYER);
                }
            }
        }
    }

    public void clearNewBoard(State state){
        for(int row = 0; row < state.getBoardSize(); row++){
            for(int col =0; col < state.getBoardSize(); col++){
                state.setNewBoardCell(row, col, Constants.BLANK);
            }
        }
    }

    //* Copy new board to board
    public void copyNewBoard(State state){
        for(int row = 0; row < state.getBoardSize(); row++){
            for(int col = 0; col < state.getBoardSize(); col++){
                if(state.getNewBoardCell(row,col) == Constants.PLAYER){
                    state.setBoardCell(row, col, Constants.PLAYER);
                }
            }
        }
    }

    //*Get the row
    public int getMoveRow(int whoseMove, State state) {
        int row = 1;
        //* Loops code
        //!Checks if value is too high or low
        while (row <= 1 || row >= state.getBoardSize()) {
            if(row < state.getBoardSize()){
                try {
                    System.out.printf(Constants.GET_ROW_MOVE, getXOrO(whoseMove));
                    row = scanner.nextInt();
                    if(row == 1){
                        printInvalidRowOrColumn();
                        System.out.println();
                        row = 1;
                    }
                } catch (Exception e) {
                    //! ERROR: If the value isnt an int
                    System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                    scanner.next();
                }
            }else{
                printInvalidRowOrColumn();
                System.out.println();
                row = 1;
            }
        }
        return row;
    } 

    public int getMoveCol(int whoseMove, State state) {
        int col = 1;
        //* Loops code
        //!Checks if value is too high or low
        while (col <= 1 || col >= state.getBoardSize()) {
            //! If value is <11
            if (col < state.getBoardSize()){
                try {
                    System.out.printf(Constants.GET_COL_MOVE, getXOrO(whoseMove));
                    col = scanner.nextInt();
                    if(col == 1){
                        printInvalidRowOrColumn();
                        System.out.println();
                        col = 1;
                    }
                } catch (Exception e) {
                    System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                    scanner.next();
                }
            }else{
                //! ERROR: If the value isnt an int
                printInvalidRowOrColumn();
                System.out.println();
                col = 1;
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

    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {}
    }
    
    public void clearBoard(State state){
        for(int row = 0; row < state.getBoardSize(); row++){
            for(int col =0; col < state.getBoardSize(); col++){
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
