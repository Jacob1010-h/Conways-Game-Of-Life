package gameoflife;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.PLAYER;
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    private int[][] Newboard = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

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
    

}