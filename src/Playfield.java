public class Playfield {
    public String[][] createPlayfield() {
        String[][] cells = new String[20][10];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = "-";
            }
        }
        return cells;
    }
}
