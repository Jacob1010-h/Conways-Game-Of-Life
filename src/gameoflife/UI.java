package gameoflife;
import java.io.IOException;
import java.util.Scanner;

/**
 * !UI class
 */
public class UI
{
    int itteration = 0;

    Scanner stopScanner;
    Scanner scanner;
    Scanner startScanner;

    public UI() {
        scanner = new Scanner(System.in);  
        stopScanner = new Scanner(System.in);
        startScanner = new Scanner(System.in);
    }

    public String getXOrO(int whoseMove) {
        if(whoseMove == 1){
            return "X";
        }else{
            return " ";
        }
    }

    public int getNums(int range1, int range2, int number, String errorMessage){
        number = 0;
        while(number <= range1-1 || number >= range2+1){
            if(number < range2+1){
                try {
                    number = scanner.nextInt();
                    if(number<range1){
                        System.out.println(errorMessage);
                        number = 0;
                    }
                } catch (Exception e) {
                    System.out.println(errorMessage);
                    scanner.next();
                }
            }else{
                System.out.println(errorMessage);
                number = 0;
            }
        }
        
        return number;
    }

    public void setItterations(){
        itteration = 0;
        System.out.println("How many itterations? 5-95");
        itteration = getNums(5, 95, itteration, "Invalid Input\nHow many itterations? 5-95");
    }

    public int getItterations(){
        return itteration;
    }

    public boolean isLegalMove(State state, int row, int col) {
        return 2 <= row && row <= state.getBoardSize() &&
        2 <= col && col <= state.getBoardSize() &&
        state.getBoardCell(row-1, col-1) == Constants.BLANK;
    }

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

    public void makeBoard(State state){        
        int size = 0;
        System.out.println("Set the size of the simulation by inputting a number between 10-20");
        size = getNums(10, 20, size, "Invalid Input\nSet the size of the simulation by inputting a number between 10-20");
    
        if(size < 21){
            state.setBoardSize(size);
            state.setNewBoardSize();
            state.setDivideString();
            state.setNumHorizontalString();
        }
    }

    public void copyBoardToReplace(State state){
        state.setReplaceBoardSize(state.getBoardSize());
        for(int row = 0; row < state.getBoardSize(); row++){
            for(int col = 0; col < state.getBoardSize(); col++){
                if(state.getBoardCell(row, col) == Constants.PLAYER){
                    state.setReplaceBoardCell(row, col, Constants.PLAYER);
                }
            }
        }
    }

    public void copyReplaceToBoard(State state){
        for(int row = 0; row < state.getBoardSize()-3; row++){
            for(int col = 0; col < state.getBoardSize()-3; col++){
                if(state.getReplaceBoardCell(row,col) == Constants.PLAYER){
                    state.setBoardCell(row, col, Constants.PLAYER);
                }
            }
        }
    }

    public void exceedBoardLimit(State state){
        copyBoardToReplace(state);
        state.setBoardSize(state.getBoardSize()+3);
        state.setDivideString();
        state.setNumHorizontalString();
        state.setNewBoardSize();
        copyReplaceToBoard(state);
    }

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

    public void copyNewBoard(State state){
        for(int row = 0; row < state.getBoardSize(); row++){
            for(int col = 0; col < state.getBoardSize(); col++){
                if(state.getNewBoardCell(row,col) == Constants.PLAYER){
                    state.setBoardCell(row, col, Constants.PLAYER);
                }
            }
        }
    }

    public int getMoveRow(int whoseMove, State state) {
        int row = 1;

        if(row < state.getBoardSize()){
        
            System.out.printf(Constants.GET_ROW_MOVE, getXOrO(whoseMove));
            
        }

        row = getNums(2, state.getBoardSize()-1, row, Constants.INVALID_ROW_OR_COLUMN + "\n\n" + Constants.GET_ROW_MOVE_NO_PLAYER);
        
        return row;
    } 

    public int getMoveCol(int whoseMove, State state) {
        int col = 1;
        
        if(col < state.getBoardSize()){
        
            System.out.printf(Constants.GET_COL_MOVE, getXOrO(whoseMove));
            
        }
        col = getNums(2, state.getBoardSize()-1, col, Constants.INVALID_ROW_OR_COLUMN + "\n\n" + Constants.GET_COL_MOVE_NO_PLAYER);
       
        return col;
    }

    public boolean checkEdges(State state){
        for(int col = 0; col<state.getBoardSize(); col++){
            if(state.getBoardCell(state.getBoardSize()-2, col) == Constants.PLAYER) return true;
        }
        for(int row = 0; row<state.getBoardSize(); row++){
            if(state.getBoardCell(row, state.getBoardSize()-2) == Constants.PLAYER) return true;
        }

        return false;
    }
    
    public boolean startNewGame() {
        System.out.println(Constants.START_NEW_GAME);
        String yesOrNo = scanner.next();
        return yesOrNo.equals("Y") || yesOrNo.equals ("y");
    }

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

    public boolean playedOrNo(){

        String played = "";
        while(played.equals("")){
            System.out.println(Constants.PLAYED_OR_NO);
            played = startScanner.next();
            if(played.equals("y") || played.equals("Y")){
                return true;
            }else if(played.equals("n") || played.equals("N")){
                return false;
            }else{
                System.out.println("Invalid input");
                played = "";
                //! ERROR: preset doesnt equal y or n
            }
        }
        return false;
    }

    public void notPlayed(){
        try {
            Thread.sleep(2000);
            clearScreen();
            System.out.print(Constants.WELCOME_EXPLANATION_1);
            Thread.sleep(4000);
            System.out.println(Constants.WELCOME_EXPLANATION_2);
            Thread.sleep(2000);
            System.out.println(Constants.WELCOME_EXPLANATION_3);
            Thread.sleep(6000);
            System.out.println(Constants.WELCOME_EXPLANATION_4);
            Thread.sleep(6000);
            System.out.println(Constants.WELCOME_EXPLANATION_5);
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        clearScreen();
        try {
            System.out.println(Constants.WELCOME_RULES_1);
            Thread.sleep(1500);
            System.out.print(Constants.WELCOME_RULES_POP);
            Thread.sleep(3000);
            System.out.println(Constants.WELCOME_RULES_POP_1);
            Thread.sleep(5000);
            System.out.println(Constants.WELCOME_RULES_POP_2);
            Thread.sleep(5000);
            System.out.println(Constants.WELCOME_RULES_POP_3);
            Thread.sleep(5000);
            System.out.print(Constants.WELCOME_RULES_NONPOP);
            Thread.sleep(3000);
            System.out.println(Constants.WELCOME_RULES_NONPOP_1);
            Thread.sleep(6000);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    public void welcomePlayer(State state){
        System.out.println(Constants.WELCOME_TITLE);
        if(playedOrNo() == false){
            notPlayed();
        }
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
