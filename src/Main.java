import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Playfield playfield = new Playfield();
//        Block block = new Block();
        ArrayList<Block> pfBlocks = new ArrayList<>();
        pfBlocks.add(new Block());

        while (true) {

            for (Block pfBlock : pfBlocks) {
                int pfBlockX = pfBlock.getX();
                int pfBlockY = pfBlock.getY();
                playfield.blocks[pfBlockY][pfBlockX] = pfBlock;
                pfBlock.moveDown();
                playfield.blocks[pfBlockY][pfBlockX] = null;
            }

            Printer.print(playfield);
            Cleaner.clean();
            Thread.sleep(1000);
//            playfield.activeBlock.moveDown();
        }
    }
}
