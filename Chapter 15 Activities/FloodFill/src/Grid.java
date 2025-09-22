import java.util.Stack;

public class Grid {
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Pair> stack = new Stack<>();

    /**
     * Flood fill, starting with the given row and column.
     */
    public void floodfill(int row, int column) {

        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                pixels[i][j] = 0;
        stack.push(new Pair(row, column));
        int counter = 1;

        while (!stack.isEmpty()) {
            Pair current = stack.pop();
            int r = current.getRow();
            int c = current.getCol();

            if (r < 0 || r >= SIZE || c < 0 || c >= SIZE) {
                continue;
            }

            if (pixels[r][c] != 0) {
                continue;
            }

            pixels[r][c] = counter++;
            stack.push(new Pair(r - 1, c));
            stack.push(new Pair(r + 1, c));
            stack.push(new Pair(r, c - 1));
            stack.push(new Pair(r, c + 1));
        }
    }

    public class Pair {
        private int row;
        private int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
    }

    @Override
    public String toString() {
        String r = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
