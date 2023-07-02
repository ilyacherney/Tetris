public class Block {
    private int x = 5;
    private int y = 0;

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
        y++;
    }
}
