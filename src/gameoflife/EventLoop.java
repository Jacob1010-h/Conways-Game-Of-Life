package gameoflife;

public class EventLoop {

    // Instance variables for the UI and State classes
    State state = new State();
    UI ui = new UI();
    int row, col;
    boolean finished = false;

    public static void main(String args[]){
        EventLoop eventLoop = new EventLoop();
        eventLoop.run();
    }

    public void run() {
        while (state.getGameState() != Constants.QUIT_PROGRAM) {
            int gameState = state.getGameState();
            if (gameState == Constants.STANDBY) {
                state.setGameState(Constants.WELCOME);

            }else if (gameState == Constants.WELCOME){
                ui.welcomePlayer(state);
                state.setGameState(Constants.GET_PLAYER_MOVE);

            }else if (gameState == Constants.GET_PLAYER_MOVE) {
                ui.printBoard(state);
                row = ui.getMoveRow(state.getWhoseMove());
                col = ui.getMoveCol(state.getWhoseMove());
                if (ui.isLegalMove(state, row, col)) {
                    state.setGameState(Constants.MAKE_MOVE);
                }else{
                    if(state.getBoardCell(row, col) != 0){
                        ui.printInvalidMove(row, col);
                        System.out.println();
                    }else{
                        ui.printInvalidRowOrColumn();
                    }
                }

            }else if (gameState == Constants.MAKE_MOVE) {
                ui.printMove(state, row, col);
                state.setBoardCell(row-1, col-1, state.getWhoseMove());
                state.setGameState(Constants.CHECK_STOP);
            }else if (gameState == Constants.CHECK_STOP){
                ui.printBoard(state);
                if(ui.getFinished(state.getWhoseMove()) == true){
                    state.setGameState(Constants.RUN);
                }else{
                    state.setGameState(Constants.GET_PLAYER_MOVE);
                }
            }else if(gameState == Constants.RUN){
                
            }else if (gameState == Constants.GAME_OVER) {
                if (ui.startNewGame()) {
                    state.setGameState(Constants.STANDBY);
                    for(int row = 0; row < Constants.BOARD_SIZE; row++){
                        for(int col =0; col < Constants.BOARD_SIZE; col++){
                            state.setBoardCell(row, col, Constants.BLANK);
                        }
                    }
                } else {
                    state.setGameState(Constants.QUIT_PROGRAM);
                }
            }
        }
    }
}