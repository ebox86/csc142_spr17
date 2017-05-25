/**
 * This is the starting point for the Game of Life
 * programming assignment for CSC 142. The initial
 * part of the assignment centers on calculating the
 * next generation, following the standard "rules"
 * for the game as described by Conway.
 */
public class GameOfLife {
    
    // declaration for the game of life board
    private int[][] board;
    
    /**
     * The value indicating a dead cell
     */
    public static final int DEAD = 0;
    /**
     * The value indicating a live cell
     */
    public static final int ALIVE = 1;
    /**
     * The size of the board, one side
     */
    public static final int BOARD_SIZE = 19;
    
    /**
     * This constructor will instantiate the board.
     * Initially all the cells will be dead. The 
     * working size of the board is 19x19, a nod to 
     * the Go board that Conway used when he was 
     * designing the Game of Life.
     */
    public GameOfLife() {
        // the board is "too big" since the row and
        // column values start at 1.
        board = new int[BOARD_SIZE+2][BOARD_SIZE+2];
    }
    
    /**
     * Sets the value in one cell of the board to ALIVE
     * @param row The row of the cell to set
     * @param col The column of the cell to set
     */
    public void setAlive(int row, int col) {
        // your code appears here
        board[row][col] = ALIVE;
    }
    
    /**
     * Sets the value in one cell of the board to DEAD.
     * @param row The row of the cell to set
     * @param col The column of the cell to set
     */
    public void setDead(int row, int col) {
        // your code appears here
        board[row][col] = DEAD;
    }
    
    /**
     * This method retrieves the value of one cell in the board.
     * @param row The row of the cell to get
     * @param col The column of the cell to get
     * @return The value of the indicated cell
     */
    public int getState(int row, int col) {
        // your code appears here
        return board[row][col];
    }
    
    /**
     * This method will initialize the internal 
     * representation of the game of life board 
     * (that is, the field <b>theBoard</b>, 
     * hereafter, "current board") to the state 
     * shown in the notes:
     * <blockquote><pre>
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . O . . . . . . . . O O . . . . .
     *      . . . O . . . . . . . . O O . . . . .
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . . . . O O . . . . . . . . . . .
     *      . . . . . O . . O . . . . . . . . . .
     *      . . . . . . O O . . . . . . . . . . .
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . . . . . . . . . . O O O . . . .
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . . . O . . . . . . . . . . . . .
     *      . . . O . O . . . . . . . . . . . . .
     *      . . . . O O . . . . . . . . . . . . .
     *      . . . . . . . . . . . . . . . . . . .
     *      . . . . . . . . . . . . . . . . . . .
     * </pre></blockquote>
     * Notice that the upper-left corner is row 1,
     * column 1, not (0, 0).
     */
    public void initializeBoard() {
        // exit if an extremely small board
        if(BOARD_SIZE < 4) return;
        // two alive cells, they will die
        setAlive(3, 4);
        setAlive(4, 4);
        // exit if a very small board
        if(BOARD_SIZE < 9) return;
        // a beehive
        setAlive(8, 7);
        setAlive(8, 8);
        setAlive(9, 6);
        setAlive(9, 9);
        setAlive(10, 7);
        setAlive(10, 8);
        // exit if a small board
        if(BOARD_SIZE < 14) return;
        // a block
        setAlive(3, 13);
        setAlive(3, 14);
        setAlive(4, 13);
        setAlive(4, 14);
        // a blinker
        setAlive(13, 13);
        setAlive(13, 14);
        setAlive(13, 15);
        // a glider
        setAlive(15, 6);
        setAlive(16, 4);
        setAlive(16, 6);
        setAlive(17, 5);
        setAlive(17, 6);
    }
    
    /**
     * Clear all the cells, set them to DEAD.
     */
    public void clear() {
        // your code appears here
    }
    
    /**
     * This method will print out the current board.
     */
    public void printBoard() {
        System.out.println(toString());
    }
    
    /**
     * This method updates the current board for the
     * next generation. 
     * <p>Note: Do <b>not</b> instantiate an array 
     * within this method.
     */
    public void nextGeneration() {
        // your code appears here
    }
    
    /**
     * The application method, instantiates a
     * GameOfLife object and then calls the above
     * methods.
     */
    public static void main(String[] args) {
        // create an instance of GameOfLife
        GameOfLife gol = new GameOfLife();
        // initialize the board
        gol.initializeBoard();
        // print a header
        System.out.println("Initial state, Generation 0:");
        // print the board
        gol.printBoard();
        for(int i = 0; i < 2; i ++) {
            // calculate the next generation
            gol.nextGeneration();
            // print a header
            System.out.println("\nGeneration " + (i + 1) + ":");
            // print the board
            gol.printBoard();
        }
    }
}