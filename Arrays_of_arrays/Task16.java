package by.epam_tc.step1.t2.type2;

//создание магических квадратов
//

import java.util.Scanner;

public class Task16 {
    public static boolean isFourDiag(int i, int j) {
        while (i >= 4 || j >= 4) {
            if (i >= 4) {
                i -= 4;
            }
            if (j >= 4) {
                j -= 4;
            }
        }
        return (i == j || 3 - i == j);
    }

    public static boolean isDiag(int[][] matrix) {
        int n;
        n = matrix.length;
        int magicConst;
        magicConst = n * (n * n + 1) / 2;
        int sumD1 = 0;
        int sumD2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumD1 += matrix[i][j];
                }
                if ((n - i - 1) == j) {
                    sumD2 += matrix[i][j];
                }
            }
        }
        return (sumD1 == magicConst && sumD2 == magicConst);
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

    static void swapCols(int[][] matrix, int col1, int col2) {
        int n;
        n = matrix.length;
        int[] tempArr = new int[n];
        for(int i = 0; i < n; i++){
            tempArr[i] = matrix[col1][i];
        }
        for (int i = 0; i < n; i++) {
            matrix[col1][i] = matrix[col2][i];
            matrix[col2][i] = tempArr[i];
        }
    }

    static void swapRows(int[][] matrix, int row1, int row2) {
        int n;
        n = matrix.length;
        int[] tempArr = new int[n];
        for (int i = 0; i < n; i++) {
            tempArr[i] = matrix[i][row1];
        }
        for (int i = 0; i < n; i++) {
            matrix[i][row1] = matrix[i][row2];
            matrix[i][row2] = tempArr[i];
        }
    }

    public static void makeDiagonal(int[][] matrix, int avg) {
        int n;
        n = matrix.length;
        int centralColumnCurrentPos = 0;
        int centralRowCurrentPos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == avg) {
                    centralColumnCurrentPos = i;
                    centralRowCurrentPos = j;
                }

            }
        }
        if (centralColumnCurrentPos != n / 2) {
            swapCols(matrix, n / 2, centralColumnCurrentPos);
        }
        if (centralRowCurrentPos != n / 2) {
            swapRows(matrix, n / 2, centralRowCurrentPos);
        }

        int firstColPosition = 0;//
        int secondColPosition = 0;

        while (!isDiag(matrix) || secondColPosition < n) {
            if (firstColPosition < n && firstColPosition != n / 2 && secondColPosition != n / 2) {
                if (firstColPosition != secondColPosition) {
                    swapCols(matrix, firstColPosition, secondColPosition);


                    if (!isDiag(matrix)) {
                        swapCols(matrix, firstColPosition, secondColPosition);
                    }
                }
            }

            if (firstColPosition < n) {
                firstColPosition++;
            } else {
                secondColPosition++;
                firstColPosition = secondColPosition;
            }
        }
        firstColPosition = 0;
        secondColPosition = 0;
        while (!isDiag(matrix) || secondColPosition < n) {
            if (firstColPosition < n && secondColPosition < n && firstColPosition != n / 2 && secondColPosition != n / 2) {
                if (firstColPosition != secondColPosition) {
                    swapRows(matrix, firstColPosition, secondColPosition);

                    if (!isDiag(matrix)) {
                        swapRows(matrix, firstColPosition, secondColPosition);
                    }
                }
            }

            if (firstColPosition < n) {
                firstColPosition++;
            } else {
                secondColPosition++;
                firstColPosition = secondColPosition;
            }
        }

    }

    public static void makeOddSquare(int[][] matrix) {
        int n;
        n = matrix.length;
        int magicConst;
        magicConst = n * (n * n + 1) / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 1 + ((i + j - 1 + (n - 1) / 2) % n) * n + ((i + 2 * j + 2) % n);
            }
        }
        int center;
        center = matrix[n / 2][n / 2];
        int avg;
        avg = magicConst / n;
        if (center != avg) {
            makeDiagonal(matrix, avg);
        }
    }

    public static int enterFromConsole(String message)
    {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print(message + ">>");
        int aInt;
        while (!in.hasNextInt()) {
            in.next();
            System.out.print(message + ">>");
        }
        aInt = in.nextInt();
        return aInt;
    }

    public static void main(String[] args) {

        int n;
        n = enterFromConsole("Введите ранг квадратной матрицы");
        int[][] matrix = new int[n][n];
        if (n % 4 == 0) {


            int number = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++, number++) {
                    if (i != j && n - i - 1 != j) {
                        if (!isFourDiag(i, j)) {
                            matrix[i][j] = number;
                        }
                    }

                }
            }
            number--;//или number=n*n;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++, number--) {
                    if (i == j || n - i - 1 == j || isFourDiag(i, j)) {

                        matrix[i][j] = number;

                    }

                }

            }

        } else if (n % 2 == 0) {


            int m = n / 2;
            int[][] quarterMatrix = new int[m][m];
            makeOddSquare(quarterMatrix);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i < m && j < m) {
                        matrix[i][j] = quarterMatrix[i][j];
                    } else if (i >= m && j >= m) {
                        matrix[i][j] = quarterMatrix[i - m][j - m] + m * m;
                    } else if (i >= m && j < m) {
                        matrix[i][j] = quarterMatrix[i - m][j] + 3 * m * m;
                    } else {
                        matrix[i][j] = quarterMatrix[i][j - m] + 2 * m * m;
                    }
                }
            }
            if (n > 6) {
                int howManyRows = (n - 6) / 2;
                int pos = -(howManyRows / 2);

                while (howManyRows > 0) {
                    for (int i = 0; i < m; i++) {
                        int tmp = matrix[i][m + pos];
                        matrix[i][m + pos] = matrix[i + m][m + pos];
                        matrix[i + m][m + pos] = tmp;
                    }
                    howManyRows--;
                    pos++;

                }
            }
            int howManyElements = m;
            int elem1Coll = 0;
            int elem1Row = 0;
            int elem2Col = m;
            int elem2Row = 0;

            while (howManyElements > 0) {
                int tmp = matrix[elem1Coll][elem1Row];
                matrix[elem1Coll][elem1Row] = matrix[elem2Col][elem2Row];
                matrix[elem2Col][elem2Row] = tmp;
                if (elem1Coll == 0) {
                    elem1Coll++;
                    elem1Row++;
                } else if (elem1Coll == m - 2) {
                    elem1Coll++;
                    elem1Row--;
                } else {
                    elem1Coll++;
                }
                elem2Col = m + elem1Coll;
                elem2Row = elem1Row;
                howManyElements--;
            }
        } else {
            makeOddSquare(matrix);
        }
        System.out.println("Полученный магический квадрат ранга " + n);
        showMatrix(matrix);
    }
}
