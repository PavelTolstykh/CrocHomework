public class ChessPosition {
    private int x;
    private int y;

    public ChessPosition(int x, int y) throws IllegalPositionException {
        if (x >=0 && x < 8 && y < 8 && y >= 0) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalPositionException();
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws IllegalPositionException {
        if (x < 8 && x >= 0) {
            this.x = x;
        } else {
            throw new IllegalPositionException();
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws IllegalPositionException {
        if (x < 8 && y >= 0) {
            this.y = y;
        } else {
            throw new IllegalPositionException();
        }
    }

    @Override
    public String toString() {
        return Utils.number2string(this.x) + (y + 1);
    }

    public boolean checkMoveKnight(ChessPosition next) {
        return (this.x == next.getX() - 1 && this.y == next.getY() + 2) ||
                (this.x == next.getX() + 1 && this.y == next.getY() + 2) ||
                (this.x == next.getX() - 2 && this.y == next.getY() - 1) ||
                (this.x == next.getX() - 2 && this.y == next.getY() + 1) ||
                (this.x == next.getX() + 2 && this.y == next.getY() - 1) ||
                (this.x == next.getX() + 2 && this.y == next.getY() + 1) ||
                (this.x == next.getX() - 1 && this.y == next.getY() - 2) ||
                (this.x == next.getX() + 1 && this.y == next.getY() - 2);
    }
}
