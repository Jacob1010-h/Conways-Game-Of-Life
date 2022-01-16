package gameoflife;

public class PrintBoard {
    UI ui = new UI();
    //? Is there an easier way to do this?
    //*New Board
    public void printNewBoard(State state) {
        System.out.println(state.getNumHorizontalString());
        for(int row = 0; row < state.getBoardSize(); row++){
            if(row>=9){
                System.out.print(row + 1 + "|");                
            }else{
                System.out.print(row + 1 + " |");
                
            }
            for(int col = 0; col<state.getBoardSize(); col++){
                if(col >= 9){
                    System.out.printf(Constants.BOARD_STRING10, ui.getXOrO(state.getNewBoardCell(row, col)));
                }else{
                    System.out.printf(Constants.BOARD_STRING, ui.getXOrO(state.getNewBoardCell(row, col)));
                }
                
            }
            System.out.println();
            System.out.println(state.getDevideString());
        }
    }
    public void printBoard(State state){
        System.out.println(state.getNumHorizontalString());
        for(int row = 0; row < state.getBoardSize(); row++){
            if(row>=9){
                System.out.print(row + 1 + "|");                
            }else{
                System.out.print(row + 1 + " |");
                
            }
            for(int col = 0; col<state.getBoardSize(); col++){
                if(col >= 9){
                    System.out.printf(Constants.BOARD_STRING10, ui.getXOrO(state.getBoardCell(row, col)));
                }else{
                    System.out.printf(Constants.BOARD_STRING, ui.getXOrO(state.getBoardCell(row, col)));
                }
                
            }
            System.out.println();
            System.out.println(state.getDevideString());
        }
    }
}
