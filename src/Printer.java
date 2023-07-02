import java.awt.*;
import java.awt.event.InputEvent;

public class Printer {
    public static void print(Block block) throws AWTException {
        String[][] playField = new Playfield().createPlayfield();
        for (int y = 0; y < playField.length; y++) {
            for (int x = 0; x < playField[y].length; x++) {
                if (block.getX() == x && block.getY() == y) {
                    playField[y][x] = "x";
                }
                System.out.printf(playField[y][x]);
            }
            System.out.println();
        }
        Cleaner.clean();
    }
}
