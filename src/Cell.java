public class Cell {
    private int x;
    private int y;
    private Block block;
    private String sybmol = "-";
    public Cell(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return  x;
    }

    public int getY() {
        return x;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        if (block == null) {
            return sybmol;
        } else {
            return block.toString();
        }
    }
}
