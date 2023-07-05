import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Block block = new Block();
        while (true) {
            Playfield playfield = new Playfield();
            playfield.activeBlock = block;
            Printer.print(playfield);
            Cleaner.clean();
            Thread.sleep(1000);
            playfield.activeBlock.moveDown();
        }
    }
}
