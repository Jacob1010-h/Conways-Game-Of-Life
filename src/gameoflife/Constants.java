package gameoflife;

/**
 * Tic-Tac-Toe game constants
 */

public class Constants
{
    // Valid board size
    public static int BOARD_SIZE = 10; //? Is there a way to make a infinite board?

    // Valid board values
    public static final int PLAYER = 1;     // Indicates a box
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
    public static final String BOARD_STRING = " %s |";
    public static final String BOARD_STRING10 = " %s  |";

    public static final String PLAYED_OR_NO = "Have you played before?";
    public static final String WELCOME_EXPLANATION_1 = "The Game of Life is not your typical computer game. ";
    public static final String WELCOME_EXPLANATION_2 = "It is cellular automaton.\n";
    public static final String WELCOME_EXPLANATION_3 = "This game became widely known when it was mentioned in an article published by Scientific American in 1970.\n";
    public static final String WELCOME_EXPLANATION_4 = "It consists of a grid of cells which, based on a few mathematical rules, can live, die or multiply.\n";
    public static final String WELCOME_EXPLANATION_5 = "Depending on the initial conditions, the cells form various patterns throughout the course of the game.\n";

    public static final String WELCOME_RULES_1 = "Rules:\n";
    public static final String WELCOME_RULES_POP = "For a space that is populated:\n";
    public static final String WELCOME_RULES_POP_1 = "Each cell with one or no neighbors dies, as if by solitude.\n";
    public static final String WELCOME_RULES_POP_2 = "Each cell with four or more neighbors dies, as if by overpopulation.\n";
    public static final String WELCOME_RULES_POP_3 = "Each cell with two or three neighbors survives.\n";
    public static final String WELCOME_RULES_NONPOP = "For a space that is empty or unpopulated:\n";
    public static final String WELCOME_RULES_NONPOP_1 = "Each cell with three neighbors becomes populated.\n";
    

    public static final String WELCOME_TITLE = "Welcome to The Game of Life!";
    public static final String TITLE = "Thanks for playing the Game Of Life!";
    public static final String INVALID_ROW_OR_COLUMN = "Your row and column must be a number one layer inside of the board size";
    public static final String GET_ROW_MOVE = "Player %s: Enter the row for your next block";
    public static final String GET_COL_MOVE = "Player %s: Enter the column for your next block";
    public static final String INVALID_MOVE_ERROR = "Row %d column %d is not a valid position. Please try again";
    public static final String PRESET_START= "Do you want a preset board? y/n";
    public static final String CHECK_STOP_STR = "Do you want to run the program? y/n";
    public static final String PRINT_MOVE = "Player %s block to %d %d";    
    public static final String START_NEW_GAME = "Start a new simulation (Y or N)? -->";
}