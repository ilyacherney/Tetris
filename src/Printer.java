public class Printer {
    public static void print(Playfield playfield) {
//        Playfield playfield = new Playfield();
        for (int y = 0; y < playfield.cells.length; y++) {
            for (int x = 0; x < playfield.cells[y].length; x++) {
                if (playfield.activeBlock.getX() == x && playfield.activeBlock.getY() == y) {
                    playfield.cells[y][x].setBlock(playfield.activeBlock);
                }
                    System.out.printf(playfield.cells[y][x].toString());
            }
            System.out.println();
        }
    }
}
