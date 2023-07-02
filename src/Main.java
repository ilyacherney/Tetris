import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Block block = new Block();
        while (true) {
            Printer.print(block);
            Thread.sleep(1000);
            block.moveDown();
        }
    }
}
