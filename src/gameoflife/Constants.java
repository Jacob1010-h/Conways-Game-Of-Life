package gameoflife;

/**
 * Tic-Tac-Toe game constants
 */

public class Constants
{
    // Valid board size
    public static int BOARD_SIZE = 10; //? This is still setting the board size

    // Valid board values
    public static final int PLAYER = 1;     // Indicates an "O"
    public static final int BLANK = 0; // Indicates a blank square

    // Game states
    public static final int STANDBY = 0;
    public static final int WELCOME = 1;
    public static final int GET_PLAYER_MOVE = 2;
    public static final int CHECK_STOP = 3;
    public static final int PRESET_BLOCKS = 4;
    public static final int MAKE_MOVE = 5;
    public static final int RUN = 6;
    public static final int GAME_OVER = 10;
    public static final int QUIT_PROGRAM = 11;
    
    // Strings
    public static String NUMBER_HORIZONTAL = "--|-1-|-2-|-3-|-4-|-5-|-6-|-7-|-8-|-9-|-10-|";
    public static String DIVIDER_STRING = "--|---|---|---|---|---|---|---|---|---|----|";
    public static String BOARD_STRING = " | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s  |";
    public static final String WELCOME_TITLE = "Welcome to The Game of Life!";
    public static final String TITLE = "Thanks for playing the Game Of Life!";
    public static final String INVALID_ROW_OR_COLUMN = "Your row and column must be 1, 2, or 3";
    public static final String GET_ROW_MOVE = "Player %s: Enter the row for your next block";
    public static final String GET_COL_MOVE = "Player %s: Enter the column for your next block";
    public static final String INVALID_MOVE_ERROR = "Row %d column %d is not a valid position. Please try again";
    public static final String PRESET_START= "Do you want a preset board? y/n";
    public static final String CHECK_STOP_STR = "Do you want to run the program? y/n";
    public static final String PRINT_MOVE = "Player %s block to %d %d";    
    public static final String START_NEW_GAME = "Start a new simulation (Y or N)? -->";
}