package gameoflife;

public class Life {

    public void giveLife(State state){
        //* Loops Code until board is scanned
        for(int row = 1; row < state.getBoardSize()-1; row++){
            for(int col = 1; col< state.getBoardSize()-1; col++){
                //! Check living cells & set values
                //* Sets value to new board
                if(checkCellLife(row, col, state) == false){
                    state.setNewBoardCell(row, col, Constants.BLANK);
                }else if(checkCellLife(row, col, state) == true){
                    state.setNewBoardCell(row, col, Constants.PLAYER);
                }
                //!Check dead cells & set values
                //* Sets value to new board
                if(checkCellLifeDeath(row, col, state) == false){
                    if(state.getBoardCell(row, col) == Constants.PLAYER){
                        
                    }else{
                        state.setNewBoardCell(row, col, Constants.BLANK);
                    }
                }else{
                    state.setNewBoardCell(row, col, Constants.PLAYER);
                }
            }
        }
    }
    
    //! Check if the living inputted cell returns life
    public boolean checkCellLife(int row, int col, State state){
        int life = 0;
        if(state.getBoardCell(row, col) == Constants.PLAYER){
            //Bottom Right
            if(state.getBoardCell(row+1,col+1) == Constants.PLAYER){
                life++;
            }
            //Bottom
            if(state.getBoardCell(row+1,col) == Constants.PLAYER){
                life++;
            }
            //Bottom Left
            if(state.getBoardCell(row+1, col-1) == Constants.PLAYER){
                life++;
            }
            //Left Mid
            if(state.getBoardCell(row, col-1) == Constants.PLAYER){
                life++;
            }
            //Top Left
            if(state.getBoardCell(row-1, col-1) == Constants.PLAYER){
                life++;
            }
            //Top
            if(state.getBoardCell(row-1, col) == Constants.PLAYER){
                life++;
            }
            //Top Right
            if(state.getBoardCell(row-1, col+1) == Constants.PLAYER){
                life++;
            }
            //Right
            if(state.getBoardCell(row, col+1) == Constants.PLAYER){
                life++;
            }
            
            //Life Returns
            if(life == 2 || life == 3)return true;
        }
        return false;
    }

    //! Check if the dead inputted cell returns life
    public boolean checkCellLifeDeath(int row, int col, State state){
        int life = 0;
        if(state.getBoardCell(row, col) == Constants.BLANK){
            //*Bottom Right
            if(state.getBoardCell(row+1,col+1) == Constants.PLAYER){
                life++;
            }
            //*Bottom
            if(state.getBoardCell(row+1,col) == Constants.PLAYER){
                life++;
            }
            //*Bottom Left
            if(state.getBoardCell(row+1, col-1) == Constants.PLAYER){
                life++;
            }
            //*Left Mid
            if(state.getBoardCell(row, col-1) == Constants.PLAYER){
                life++;
            }
            //*Top Left
            if(state.getBoardCell(row-1, col-1) == Constants.PLAYER){
                life++;
            }
            //*Top
            if(state.getBoardCell(row-1, col) == Constants.PLAYER){
                life++;
            }
            //*Top Right
            if(state.getBoardCell(row-1, col+1) == Constants.PLAYER){
                life++;
            }
            //*Right
            if(state.getBoardCell(row, col+1) == Constants.PLAYER){
                life++;
            }
            
            //*Life Returns
            if(life == 3)return true;
        }
        return false;
    }

}
