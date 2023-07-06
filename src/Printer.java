public class Printer {
    public static void print(Playfield playfield) {
//        Playfield playfield = new Playfield();
        for (int y = 0; y < playfield.blocks.length; y++) {
            for (int x = 0; x < playfield.blocks[y].length; x++) {
//                if (playfield.activeBlock.getX() == x && playfield.activeBlock.getY() == y) {
//                    playfield.blocks[y][x].setBlock(playfield.activeBlock);
//                }
                if (playfield.blocks[y][x] == null) {
                    System.out.printf("-");
                } else {
                    System.out.printf(playfield.blocks[y][x].toString());
                }
            }
            System.out.println();
        }
    }
}
