import java.util.ArrayList;

public class Playfield {
    private final int HEIGHT = 10;
    private final int WIDTH = 10;
    public Cell[][] cells = new Cell[HEIGHT][WIDTH];
    public ArrayList<Block> blocks = new ArrayList<>();
    public Block activeBlock;
    public Playfield() {
        for (int y = 0; y < cells.length; y++) {
            for (int x = 0; x < cells[y].length; x++) {
                Cell cell = new Cell(y, x);
                cells[y][x] = cell;
            }
        }
    }
}
