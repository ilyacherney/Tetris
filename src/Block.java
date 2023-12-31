public class Block {
    private int x = 2 ;
    private int y = 0;
    private String sybmol = "x";
    public boolean isActive = true;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveDown() {
        if (isActive && y < 9) {
            y++;
        } else
            isActive = false;
    }

    @Override
    public String toString() {
        return sybmol;
    }
}
