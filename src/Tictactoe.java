import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterX = 0;
        int counterO = 0;
        int counterUnderscore = 0;

        String str = scanner.next();
        System.out.println("---------");
        System.out.println("| " + str.charAt(0) + " " + str.charAt(1) + " " + str.charAt(2) + " |");
        System.out.println("| " + str.charAt(3) + " " + str.charAt(4) + " " + str.charAt(5) + " |");
        System.out.println("| " + str.charAt(6) + " " + str.charAt(7) + " " + str.charAt(8) + " |");
        System.out.println("---------");

        char[][] matrix = new char[3][3];
        int charAdder = 0;
        for (int l = 0; l < matrix.length; l++) {
            for (int m = 0; m < matrix[l].length; m++) {
                matrix[l][m] = str.charAt(charAdder);
                charAdder++;
            }
        }
        String userInput = scanner.next();
        String userInput1 = scanner.next();
        boolean key = true;
        boolean cheker = true;

        while (cheker) {
            if ((userInput.matches("\\d+")) || userInput1.matches("\\d+")) {
                cheker = false;
            } else {
                try {
                    Integer.parseInt(userInput);
                    Integer.parseInt(userInput1);

                } catch (NumberFormatException e) {
                    System.out.println("You should enter numbers!");
                    userInput = scanner.next();
                    userInput1 = scanner.next();
                }
            }
        }

        while (key) {
            for (int q = 0; q < matrix.length; q++) {
                for (int w = 0; w < matrix[q].length; w++) {
                    if (q == Integer.parseInt(userInput) - 1 && w == Integer.parseInt(userInput1) - 1) {

                        if (matrix[q][w] == 'X' || matrix[q][w] == 'O') {
                            System.out.println("This cell is occupied! Choose another one!");
                            userInput = scanner.next();
                            userInput1 = scanner.next();

                        } else if (matrix[q][w] != 'X' && matrix[q][w] != 'O') {
                            matrix[q][w] = 'X';
                            key = false;
                        }

                    } else if (Integer.parseInt(userInput) - 1 >= 3 || Integer.parseInt(userInput1) - 1 >= 3) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        userInput = scanner.next();
                        userInput1 = scanner.next();
                    }
                }
            }
        }


            System.out.println("---------");
            System.out.println("| " + matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2] + " |");
            System.out.println("| " + matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2] + " |");
            System.out.println("| " + matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2] + " |");
            System.out.println("---------");






        /*int X = 0;
        int O = 0;
        int underscore = 0;
        for(int i = 0; i < 9; i++) {
            boolean innerBool = true;
            while (innerBool) {
                if (str.charAt(i) == 'X') {
                    ++X;
                    innerBool = false;
                } else if (str.charAt(i) == 'O') {
                    ++O;
                    innerBool = false;

                } else if (str.charAt(i) == '_') {
                    ++underscore;
                    innerBool = false;
                }
            }
        }

            if (str.charAt(0) == 'X' && str.charAt(1) == 'X' && str.charAt(2) == 'X')
                counterX++;
            if (str.charAt(3) == 'X' && str.charAt(4) == 'X' && str.charAt(5) == 'X')
                counterX++;
            if (str.charAt(6) == 'X' && str.charAt(7) == 'X' && str.charAt(8) == 'X')
                counterX++;
            if (str.charAt(0) == 'X' && str.charAt(3) == 'X' && str.charAt(6) == 'X')
                counterX++;
            if (str.charAt(1) == 'X' && str.charAt(4) == 'X' && str.charAt(7) == 'X')
                counterX++;
            if (str.charAt(2) == 'X' && str.charAt(5) == 'X' && str.charAt(8) == 'X')
                counterX++;
            if (str.charAt(0) == 'X' && str.charAt(4) == 'X' && str.charAt(8) == 'X')
                counterX++;
            if (str.charAt(2) == 'X' && str.charAt(4) == 'X' && str.charAt(6) == 'X')
                counterX++;

            if (str.charAt(0) == 'O' && str.charAt(1) == 'O' && str.charAt(2) == 'O')
                counterO++;
            if (str.charAt(3) == 'O' && str.charAt(4) == 'O' && str.charAt(5) == 'O')
                counterO++;
            if (str.charAt(6) == 'O' && str.charAt(7) == 'O' && str.charAt(8) == 'O')
                counterO++;
            if (str.charAt(0) == 'O' && str.charAt(3) == 'O' && str.charAt(6) == 'O')
                counterO++;
            if (str.charAt(1) == 'O' && str.charAt(4) == 'O' && str.charAt(7) == 'O')
                counterO++;
            if (str.charAt(2) == 'O' && str.charAt(5) == 'O' && str.charAt(8) == 'O')
                counterO++;
            if (str.charAt(0) == 'O' && str.charAt(4) == 'O' && str.charAt(8) == 'O')
                counterO++;
            if (str.charAt(2) == 'O' && str.charAt(4) == 'O' && str.charAt(6) == 'O')
                counterO++;

            if (str.charAt(0) == '_' && str.charAt(1) == '_' && str.charAt(2) == '_')
                counterUnderscore++;
            if (str.charAt(3) == '_' && str.charAt(4) == '_' && str.charAt(5) == '_')
                counterUnderscore++;
            if (str.charAt(6) == '_' && str.charAt(7) == '_' && str.charAt(8) == '_')
                counterUnderscore++;
            if (str.charAt(0) == '_' && str.charAt(3) == '_' && str.charAt(6) == '_')
                counterUnderscore++;
            if (str.charAt(1) == '_' && str.charAt(4) == '_' && str.charAt(7) == '_')
                counterUnderscore++;
            if (str.charAt(2) == '_' && str.charAt(5) == '_' && str.charAt(8) == '_')
                counterUnderscore++;
            if (str.charAt(0) == '_' && str.charAt(4) == '_' && str.charAt(8) == '_')
                counterUnderscore++;
            if (str.charAt(2) == '_' && str.charAt(4) == '_' && str.charAt(6) == '_')
                counterUnderscore++;

            boolean answer = true;
            while(answer) {
                if ((counterX >= 1 && counterO >= 1) || (X - O > 1) || (O - X > 1)) {
                    System.out.println("Impossible");
                    answer = false;

                } else if ((counterO == 0 && counterX == 0) && underscore == 0) {
                    System.out.println("Draw");
                    answer = false;

                } else if (counterX == 1 && counterO == 0) {
                    System.out.println("X wins");
                    answer = false;

                } else if (counterO == 1 && counterX == 0) {
                    System.out.println("O wins");
                    answer = false;

                } else if ((counterO == 0 && counterX == 0) && underscore >= 1) {
                    System.out.println("Game not finished");
                    answer = false;

                }
            }*/
    }
}