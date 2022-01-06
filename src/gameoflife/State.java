package gameoflife;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.PLAYER;
    private int[][] board = new int[getBoardSize()][getBoardSize()];
    private int[][] Newboard = new int[getBoardSize()][getBoardSize()];

    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

    public int getWhoseMove() {
        return whoseMove;
    }

    public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }

    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }

    public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
    }

    public int getNewBoardCell(int row, int col) {
        return this.Newboard[row][col];
    }

    public void setNewBoardCell(int row, int col, int value) {
        this.Newboard[row][col] = value;
    }

    public void setBoardSize(int size){
        Constants.BOARD_SIZE = size;
    }

    public int getBoardSize(){
        return Constants.BOARD_SIZE;
    }
    
    public void setNumHorizontalString(){
        Constants.NUMBER_HORIZONTAL = "-|";
        for(int i = 0; i<getBoardSize(); i++){
            Constants.NUMBER_HORIZONTAL = Constants.NUMBER_HORIZONTAL.concat("-" + Integer.toString(i+1) + "-|");
        }
    }

    public String getNumHorizontalString(){
        return Constants.NUMBER_HORIZONTAL;
    }

    public void setDivideString(){
        Constants.DIVIDER_STRING = "-|";
        for(int i = 0; i<getBoardSize(); i++){
            if(i >= getBoardSize()-1){
                Constants.DIVIDER_STRING = Constants.DIVIDER_STRING.concat("----|");
            }else{
                Constants.DIVIDER_STRING = Constants.DIVIDER_STRING.concat("---|");
            }
        }
    }

    public String getDevideString(){
        return Constants.DIVIDER_STRING;
    }

    //* Presetted board
    public void presetBoard(){
        setBoardCell(5-1, 5-1, Constants.PLAYER);
        setBoardCell(6-1, 6-1, Constants.PLAYER);
        setBoardCell(7-1, 6-1, Constants.PLAYER);
        setBoardCell(7-1, 5-1, Constants.PLAYER);
        setBoardCell(7-1, 4-1, Constants.PLAYER);
    }

}