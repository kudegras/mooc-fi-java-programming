
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm
        // here
        int x = size / 2;
        int y = 0;

        int number = 1;
        int numbers = size * size;

        while (number <= numbers) {
            square.placeValue(x, y, number);

            // is the position to the top right free
            // get the position
            int candidateY = y - 1;
            int candidateX = x + 1;

            if (candidateY < 0) {
                candidateY += size;
            }

            if (candidateX >= size) {
                candidateX %= size;
            }

            // if the position is free, we'll place the number there
            if (square.readValue(candidateX, candidateY) == 0) {
                x = candidateX;
                y = candidateY;
            } else {
                // the position is not free, so we move "down"
                y++;
                if (y >= size) {
                    y = 0;
                }
            }

            number++;

        }

        return square;
    }

}