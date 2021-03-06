import com.sudoku.SudokuBoard;
import com.utils.readers.SudokuReader;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class represent the unit tests for the Sudoku Reader class
 *
 * @author Jose Cabrera
 */
public class SudokuReaderTest {

    @Test
    public void getSudokuFromTxtFile() {
        int grid[][] = {{4, 0, 0, 0, 0, 0, 8, 0, 5},
                {0, 3, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 7, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 6, 0},
                {0, 0, 0, 0, 8, 0, 4, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 6, 0, 3, 0, 7, 0},
                {5, 0, 0, 2, 0, 0, 0, 0, 0},
                {1, 0, 4, 0, 0, 0, 0, 0, 0}};
        SudokuReader readerTxt = new SudokuReader("./test.txt");
        SudokuBoard sudokuBoard = new SudokuBoard(grid);
        Assert.assertEquals("The SudokuBoard is the same", sudokuBoard.toString(),
                readerTxt.getSudokuBoard().toString());
    }

    @Test
    public void getSudokuFromCsvFile() {
        int grid[][] = {{0, 0, 3, 0, 2, 0, 6, 0, 0},
                {9, 0, 0, 3, 0, 5, 0, 0, 1},
                {0, 0, 1, 8, 0, 6, 4, 0, 0},
                {0, 0, 8, 1, 0, 2, 9, 0, 0},
                {7, 0, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 6, 7, 0, 8, 2, 0, 0},
                {0, 0, 2, 6, 0, 9, 5, 0, 0},
                {8, 0, 0, 2, 0, 3, 0, 0, 9},
                {0, 0, 5, 0, 1, 0, 3, 0, 0}};
        SudokuReader readerTxt = new SudokuReader("./test.csv");
        SudokuBoard sudokuBoard = new SudokuBoard(grid);
        Assert.assertEquals("The SudokuBoard is the same", sudokuBoard.toString(),
                readerTxt.getSudokuBoard().toString());
    }

    @Test
    public void getSudokuFromString() {
        int grid[][] = {{0, 0, 3, 0, 2, 0, 6, 0, 0},
                {9, 0, 0, 3, 0, 5, 0, 0, 1},
                {0, 0, 1, 8, 0, 6, 4, 0, 0},
                {0, 0, 8, 1, 0, 2, 9, 0, 0},
                {7, 0, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 6, 7, 0, 8, 2, 0, 0},
                {0, 0, 2, 6, 0, 9, 5, 0, 0},
                {8, 0, 0, 2, 0, 3, 0, 0, 9},
                {0, 0, 5, 0, 1, 0, 3, 0, 0}};
        String boardString = "003020600900305001001806400008102900700000008006708200002609500800203009005010300";
        SudokuReader reader = new SudokuReader();
        SudokuBoard sudokuBoard = new SudokuBoard(grid);
        Assert.assertEquals("The SudokuBoard is the same", sudokuBoard.toString(),
                reader.getSudokuBoardFromString(boardString).toString());
    }
}