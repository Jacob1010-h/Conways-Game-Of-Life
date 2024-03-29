package gameoflife;

public class EventLoop {
    
    //* Instance variables for the UI and State classes
    State state = new State();
    UI ui = new UI();
    Life life = new Life();
    PrintBoard print = new PrintBoard();
    Preset preset = new Preset();
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
                ui.clearScreen();
                ui.welcomePlayer(state);
                ui.makeBoard(state);
                ui.setItterations();
                if(ui.presetStart() == true){
                    state.setGameState(Constants.PRESET_BLOCKS);
                }else{
                    state.setGameState(Constants.GET_PLAYER_MOVE);
                } 
            }else if (gameState == Constants.PRESET_BLOCKS){
                preset.glider(state);
                state.setGameState(Constants.RUN);
                print.printBoard(state);
            }else if (gameState == Constants.GET_PLAYER_MOVE) {
                print.printBoard(state);
                row = ui.getMoveRow(state.getWhoseMove(), state);
                col = ui.getMoveCol(state.getWhoseMove(), state);
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
                ui.clearScreen();
                state.setGameState(Constants.CHECK_STOP);
            }else if (gameState == Constants.CHECK_STOP){
                print.printBoard(state);
                if(ui.getFinished(state.getWhoseMove()) == true){
                    state.setGameState(Constants.RUN);
                }else{
                    state.setGameState(Constants.GET_PLAYER_MOVE);
                    ui.clearScreen();
                }
            }else if(gameState == Constants.RUN){
                ui.createNewBoard(state);
                for(int i = 0; i<ui.getItterations(); i++){
                    if(ui.checkEdges(state) == true){
                        ui.exceedBoardLimit(state);
                    }
                    ui.clearScreen();
                    life.giveLife(state);
                    print.printNewBoard(state);
                    ui.clearBoard(state);
                    ui.copyNewBoard(state);
                    System.out.println("Iteration " + (i+1));
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                state.setGameState(Constants.GAME_OVER);
                
            }else if (gameState == Constants.GAME_OVER) {
                if (ui.startNewGame()) {
                    state.setGameState(Constants.STANDBY);
                    ui.clearBoard(state);
                    ui.clearNewBoard(state);
                } else {
                    state.setGameState(Constants.QUIT_PROGRAM);
                    
                }
            }
        }
    }
}