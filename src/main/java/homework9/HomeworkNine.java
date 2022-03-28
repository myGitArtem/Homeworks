package homework9;

public class HomeworkNine {
    public static void main(String[] args) throws InterruptedException {
        char[][] array = new char[10][10];
        printArray(array);
        System.out.println();
        fillArray(array);
        System.out.println();
        printArray(array);
        System.out.println();
        fillMain(array);
        System.out.println();
        printArray(array);
        System.out.println();
        fillMainTwo(array);
        System.out.println();
        printArray(array);
        System.out.println();
        while (true) {
            left(array);
            System.out.println();
            printArray(array);
            System.out.println();
            Thread.sleep(500);
            up(array);
            System.out.println();
            printArray(array);
            System.out.println();
            Thread.sleep(500);
            right(array);
            System.out.println();
            printArray(array);
            System.out.println();
            Thread.sleep(500);
            down(array);
            System.out.println();
            printArray(array);
            System.out.println();
            Thread.sleep(500);
        }
    }

    public static void fillArray(char[][] twoArray) {
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = '.';
            }
        }
    }

    public static void fillMain(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                chars[i][i] = '+';

            }
        }
    }

    public static void fillMainTwo(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i + j == chars.length - 1) {
                    chars[i][j] = '+';
                }
            }
        }
    }

    public static void left(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i > j && i < chars.length - 1 - j) {
                    chars[i][j] = '+';
                }
                if (i > j && i > chars.length - 1 - j) {
                    chars[i][j] = '.';
                }
            }
        }
    }

    public static void up(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i > j && i < chars.length - 1 - j) {
                    chars[i][j] = '.';
                }
                if (i < j && i < chars.length - 1 - j) {
                    chars[i][j] = '+';
                }
            }
        }
    }

    public static void right(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i < j && i < chars.length - 1 - j) {
                    chars[i][j] = '.';
                }
                if (i < j && i > chars.length - 1 - j) {
                    chars[i][j] = '+';
                }
            }
        }
    }

    public static void down(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i < j && i > chars.length - 1 - j) {
                    chars[i][j] = '.';
                }
                if (i > j && i > chars.length - 1 - j) {
                    chars[i][j] = '+';
                }
            }
        }
    }

    public static void all(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i > j && i < chars.length - 1 - j) {
                    chars[i][j] = '+';
                }
                if (i > j && i > chars.length - 1 - j) {
                    chars[i][j] = '.';
                }
                System.out.println();
                if (i > j && i < chars.length - 1 - j) {
                    chars[i][j] = '.';
                }
                if (i < j && i < chars.length - 1 - j) {
                    chars[i][j] = '+';
                }
                System.out.println();
                if (i < j && i < chars.length - 1 - j) {
                    chars[i][j] = '.';
                }
                if (i < j && i > chars.length - 1 - j) {
                    chars[i][j] = '+';
                }
                System.out.println();
                if (i < j && i > chars.length - 1 - j) {
                    chars[i][j] = '.';
                }
                if (i > j && i > chars.length - 1 - j) {
                    chars[i][j] = '+';
                }
            }
        }
    }


    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
