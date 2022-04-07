package ticTacToe;

import java.util.Arrays;

public class TicTacToe {

    private String[][] ticTacToe;
    private String turn;

    public TicTacToe() {
        this.ticTacToe = new String[][] { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
        this.turn = "X";
    }

    public String status(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return "";
        }

        return this.ticTacToe[x][y];
    }

    public void place(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return;
        }

        if (!this.ticTacToe[x][y].equals(" ")) {
            return;
        }

        if (ended()) {
            return;
        }

        this.ticTacToe[x][y] = this.turn;

        if (this.turn.equals("X")) {
            this.turn = "O";
        } else {
            this.turn = "X";
        }

    }

    public boolean ended() {
        int[][] sameSymbols = {
                { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 },
                { 0, 4, 8 },
                { 6, 4, 2 },
                { 0, 3, 6 },
                { 1, 4, 7 },
                { 2, 5, 8 }
        };

        for (int i = 0; i < sameSymbols.length; i++) {
            if (arrayHasSameSymbolsInPlaces(sameSymbols[i])) {
                return true;
            }
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (status(x, y).trim().isEmpty()) {
                    return false;
                }
            }
        }

        return true;
    }

    public String turn() {
        return this.turn;
    }

    private boolean arrayHasSameSymbolsInPlaces(int[] array) {
        String[] values = { valueInArray(array[0]), valueInArray(array[1]), valueInArray(array[2]) };
        Arrays.sort(values);
        return values[0].equals(values[1]) && values[1].equals(values[2]) && !values[0].trim().isEmpty();
    }

    private String valueInArray(int place) {
        int x = place % 3;
        int y = place / 3;
        return this.ticTacToe[x][y];
    }

}
