package gameoflife;

public class PrintBoard {
    UI ui = new UI();

    //*New Board
    public void printNewBoard(State state) {
        System.out.println(state.getNumHorizontalString());
        if(state.getBoardSize() == 10){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }
        
        if(state.getBoardSize() == 11){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 12){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 13){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)),
                    ui.getXOrO(state.getNewBoardCell(row, 12)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 14){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)),
                    ui.getXOrO(state.getNewBoardCell(row, 12)),
                    ui.getXOrO(state.getNewBoardCell(row, 13)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 15){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)),
                    ui.getXOrO(state.getNewBoardCell(row, 12)),
                    ui.getXOrO(state.getNewBoardCell(row, 13)),
                    ui.getXOrO(state.getNewBoardCell(row, 14)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 16){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)),
                    ui.getXOrO(state.getNewBoardCell(row, 12)),
                    ui.getXOrO(state.getNewBoardCell(row, 13)),
                    ui.getXOrO(state.getNewBoardCell(row, 14)),
                    ui.getXOrO(state.getNewBoardCell(row, 15)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 17){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)),
                    ui.getXOrO(state.getNewBoardCell(row, 12)),
                    ui.getXOrO(state.getNewBoardCell(row, 13)),
                    ui.getXOrO(state.getNewBoardCell(row, 14)),
                    ui.getXOrO(state.getNewBoardCell(row, 15)),
                    ui.getXOrO(state.getNewBoardCell(row, 16)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 18){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)),
                    ui.getXOrO(state.getNewBoardCell(row, 12)),
                    ui.getXOrO(state.getNewBoardCell(row, 13)),
                    ui.getXOrO(state.getNewBoardCell(row, 14)),
                    ui.getXOrO(state.getNewBoardCell(row, 15)),
                    ui.getXOrO(state.getNewBoardCell(row, 16)),
                    ui.getXOrO(state.getNewBoardCell(row, 17)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 19){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)),
                    ui.getXOrO(state.getNewBoardCell(row, 12)),
                    ui.getXOrO(state.getNewBoardCell(row, 13)),
                    ui.getXOrO(state.getNewBoardCell(row, 14)),
                    ui.getXOrO(state.getNewBoardCell(row, 15)),
                    ui.getXOrO(state.getNewBoardCell(row, 16)),
                    ui.getXOrO(state.getNewBoardCell(row, 17)),
                    ui.getXOrO(state.getNewBoardCell(row, 18)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 20){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getNewBoardCell(row, 0)), 
                    ui.getXOrO(state.getNewBoardCell(row, 1)), 
                    ui.getXOrO(state.getNewBoardCell(row, 2)),
                    ui.getXOrO(state.getNewBoardCell(row, 3)),
                    ui.getXOrO(state.getNewBoardCell(row, 4)),
                    ui.getXOrO(state.getNewBoardCell(row, 5)),
                    ui.getXOrO(state.getNewBoardCell(row, 6)),
                    ui.getXOrO(state.getNewBoardCell(row, 7)),
                    ui.getXOrO(state.getNewBoardCell(row, 8)),
                    ui.getXOrO(state.getNewBoardCell(row, 9)),
                    ui.getXOrO(state.getNewBoardCell(row, 10)),
                    ui.getXOrO(state.getNewBoardCell(row, 11)),
                    ui.getXOrO(state.getNewBoardCell(row, 12)),
                    ui.getXOrO(state.getNewBoardCell(row, 13)),
                    ui.getXOrO(state.getNewBoardCell(row, 14)),
                    ui.getXOrO(state.getNewBoardCell(row, 15)),
                    ui.getXOrO(state.getNewBoardCell(row, 16)),
                    ui.getXOrO(state.getNewBoardCell(row, 17)),
                    ui.getXOrO(state.getNewBoardCell(row, 18)),
                    ui.getXOrO(state.getNewBoardCell(row, 19)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }
    }

    //* Board
    public void printBoard(State state) {
        System.out.println(state.getNumHorizontalString());
        if(state.getBoardSize() == 10){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }
        
        if(state.getBoardSize() == 11){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 12){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 13){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)),
                    ui.getXOrO(state.getBoardCell(row, 12)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 14){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)),
                    ui.getXOrO(state.getBoardCell(row, 12)),
                    ui.getXOrO(state.getBoardCell(row, 13)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 15){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)),
                    ui.getXOrO(state.getBoardCell(row, 12)),
                    ui.getXOrO(state.getBoardCell(row, 13)),
                    ui.getXOrO(state.getBoardCell(row, 14)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 16){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)),
                    ui.getXOrO(state.getBoardCell(row, 12)),
                    ui.getXOrO(state.getBoardCell(row, 13)),
                    ui.getXOrO(state.getBoardCell(row, 14)),
                    ui.getXOrO(state.getBoardCell(row, 15)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 17){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)),
                    ui.getXOrO(state.getBoardCell(row, 12)),
                    ui.getXOrO(state.getBoardCell(row, 13)),
                    ui.getXOrO(state.getBoardCell(row, 14)),
                    ui.getXOrO(state.getBoardCell(row, 15)),
                    ui.getXOrO(state.getBoardCell(row, 16)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 18){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)),
                    ui.getXOrO(state.getBoardCell(row, 12)),
                    ui.getXOrO(state.getBoardCell(row, 13)),
                    ui.getXOrO(state.getBoardCell(row, 14)),
                    ui.getXOrO(state.getBoardCell(row, 15)),
                    ui.getXOrO(state.getBoardCell(row, 16)),
                    ui.getXOrO(state.getBoardCell(row, 17)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 19){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)),
                    ui.getXOrO(state.getBoardCell(row, 12)),
                    ui.getXOrO(state.getBoardCell(row, 13)),
                    ui.getXOrO(state.getBoardCell(row, 14)),
                    ui.getXOrO(state.getBoardCell(row, 15)),
                    ui.getXOrO(state.getBoardCell(row, 16)),
                    ui.getXOrO(state.getBoardCell(row, 17)),
                    ui.getXOrO(state.getBoardCell(row, 18)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }

        if(state.getBoardSize() == 20){
            for (int row = 0; row < state.getBoardSize(); row++) {
                System.out.print(row + 1);
                System.out.printf(state.getBoardString(), ui.getXOrO(state.getBoardCell(row, 0)), 
                    ui.getXOrO(state.getBoardCell(row, 1)), 
                    ui.getXOrO(state.getBoardCell(row, 2)),
                    ui.getXOrO(state.getBoardCell(row, 3)),
                    ui.getXOrO(state.getBoardCell(row, 4)),
                    ui.getXOrO(state.getBoardCell(row, 5)),
                    ui.getXOrO(state.getBoardCell(row, 6)),
                    ui.getXOrO(state.getBoardCell(row, 7)),
                    ui.getXOrO(state.getBoardCell(row, 8)),
                    ui.getXOrO(state.getBoardCell(row, 9)),
                    ui.getXOrO(state.getBoardCell(row, 10)),
                    ui.getXOrO(state.getBoardCell(row, 11)),
                    ui.getXOrO(state.getBoardCell(row, 12)),
                    ui.getXOrO(state.getBoardCell(row, 13)),
                    ui.getXOrO(state.getBoardCell(row, 14)),
                    ui.getXOrO(state.getBoardCell(row, 15)),
                    ui.getXOrO(state.getBoardCell(row, 16)),
                    ui.getXOrO(state.getBoardCell(row, 17)),
                    ui.getXOrO(state.getBoardCell(row, 18)),
                    ui.getXOrO(state.getBoardCell(row, 19)));
                System.out.println();
                System.out.println(state.getDevideString());
            }
        }
    }
}
