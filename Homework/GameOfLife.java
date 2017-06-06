/**
 * This is the starting point for the Game of Life programming assignment for
 * CSC 142. The initial part of the assignment centers on calculating the next
 * generation, following the standard "rules" for the game as described by
 * Conway.
 */
public class GameOfLife {

	// declaration for the game of life board
	private int[][] board;
	private int[][] curGen;
	private int[][] nextGen;
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
	 * This constructor will instantiate the board. Initially all the cells will
	 * be dead. The working size of the board is 19x19, a nod to the Go board
	 * that Conway used when he was designing the Game of Life.
	 */
	public GameOfLife() {
		// the board is "too big" since the row and
		// column values start at 1.
		board = new int[BOARD_SIZE + 2][BOARD_SIZE + 2];
	}

	/**
	 * Sets the value in one cell of the board to ALIVE
	 * 
	 * @param row
	 *            The row of the cell to set
	 * @param col
	 *            The column of the cell to set
	 */
	public void setAlive(int row, int col) {
		// your code appears here
		board[row][col] = ALIVE;
	}

	/**
	 * Sets the value in one cell of the board to DEAD.
	 * 
	 * @param row
	 *            The row of the cell to set
	 * @param col
	 *            The column of the cell to set
	 */
	public void setDead(int row, int col) {
		// your code appears here
		board[row][col] = DEAD;
	}

	/**
	 * This method retrieves the value of one cell in the board.
	 * 
	 * @param row
	 *            The row of the cell to get
	 * @param col
	 *            The column of the cell to get
	 * @return The value of the indicated cell
	 */
	public int getState(int row, int col) {
		// your code appears here
		return board[row][col];
	}

	/**
	 * This method will initialize the internal representation of the game of
	 * life board (that is, the field <b>theBoard</b>, hereafter,
	 * "current board") to the state shown in the notes: <blockquote>
	 * 
	 * <pre>
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
	 * </pre>
	 * 
	 * </blockquote> Notice that the upper-left corner is row 1, column 1, not
	 * (0, 0).
	 */
	public void initializeBoard() {
		// exit if an extremely small board
		if (BOARD_SIZE < 4)
			return;
		// two alive cells, they will die
		setAlive(3, 4);
		setAlive(4, 4);
		// exit if a very small board
		if (BOARD_SIZE < 9)
			return;
		// a beehive
		setAlive(8, 7);
		setAlive(8, 8);
		setAlive(9, 6);
		setAlive(9, 9);
		setAlive(10, 7);
		setAlive(10, 8);
		// exit if a small board
		if (BOARD_SIZE < 14)
			return;
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
		for (int row = 0; row < board[0].length; row++) {
			for (int col = 0; col < board.length; col++) {
				setDead(row, col);
			}
		}
	}

	/**
	 * This method will print out the current board.
	 */
	public void printBoard() {
		System.out.println(toString());
	}

	/**
	 * overrides toString method to return a string representation of the board
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int row = 0; row < board[0].length; row++) {
			for (int col = 0; col < board.length; col++) {
				if (board[row][col] == ALIVE) {
					sb.append("O ");
				} else {
					sb.append(". ");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * This method updates the current board for the next generation.
	 * <p>
	 * Note: Do <b>not</b> instantiate an array within this method.
	 */
	public void nextGeneration() {
		nextGen = board;
		for(int row = 1; row < BOARD_SIZE; row++ ){
			for(int col = 1; col < BOARD_SIZE; col++ ){
				nextGen[row][col] = checkNeighbors(row, col);
			}
		}
		board = nextGen;
	}
	
	/**
	 * This method checks neighbors of a cell to determine whether that cell should live of die, returns int.
	 * @param row -- the row index currently being examined 
	 * @param col -- the column index currently being examined
	 * @return int -- 1 or 0 depending on rules of game and whether neighbors are live/dead
	 */
	private int checkNeighbors(int row, int col){
		int aliveCount = 0;
		curGen = board;
		int alive = curGen[row][col];

		// for calculating the 8 cell neighbors
		for(int r = -1; r <= 1; r++){
			int curRow = row + r;
			curRow = (curRow < 0)? BOARD_SIZE - 1: curRow;
			curRow = (curRow >= BOARD_SIZE)? 0 : curRow;
			for(int c = -1; c <= 1; c++){
				int curCol = col + c;
				curCol = (curCol < 0)? BOARD_SIZE - 1: curCol;
				curCol = (curCol >= BOARD_SIZE)? 0 : curCol;
				if(board[curRow][curCol] == ALIVE){
					aliveCount++;
				}
			}
		}

		// removed for cell we are calculating
		if(alive == ALIVE){
			aliveCount--;
		}
	
		// game rules
		// if it has 2 or more neighbors and is alive, it stays alive
		if(aliveCount == 2 && alive == ALIVE){
			return 1;
		// if it has 3 or more neighbors and its dead, it gets born
		} else if(aliveCount == 3){
			return 1;
		// everything else stays dead and/or dies
		} else {
			return 0;
		}
	}
	
	/**
	 * The application method, instantiates a GameOfLife object and then calls
	 * the above methods.
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
		for (int i = 0; i < 2; i++) {
			// calculate the next generation
			gol.nextGeneration();
			// print a header
			System.out.println("\nGeneration " + (i + 1) + ":");
			// print the board
			gol.printBoard();
		}
	}
}