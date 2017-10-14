import java.awt.*;
import java.util.*;
import java.util.Arrays

public class CartesianBoard {
    int rows;
    int coloums;
    ArrayList<String[]> Board = new ArrayList<String[]>();
    ArrayList<CartesianCoordinate> Points = new ArrayList<CartesianCoordinate>();

    CartesianBoard() {
        this.rows = 0;
        this.coloums = 0;
    }

    CartesianBoard(int rows, int coloums) {
        this.rows = rows;
        this.coloums = coloums;

        for (int i = 0; i < this.rows; i ++) {
            for (int j = 0; j < this.coloums; j ++) {
                this.Board.add("|" + i + "," + j + "|");
            }
        }
    }

    void addCoordinate(CartesianCoordinate P) {
        Points.add(P);
    }

    void drawBoard() {
        for (String[] rows: this.Board) {
            for (String coloum : rows) {

            }
        }
    }


}
