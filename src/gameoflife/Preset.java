package gameoflife;

public class Preset {
    public void glider(State state){
        state.setBoardCell(5-1, 5-1, Constants.PLAYER);
        state.setBoardCell(6-1, 6-1, Constants.PLAYER);
        state.setBoardCell(7-1, 6-1, Constants.PLAYER);
        state.setBoardCell(7-1, 5-1, Constants.PLAYER);
        state.setBoardCell(7-1, 4-1, Constants.PLAYER);
    }
}
