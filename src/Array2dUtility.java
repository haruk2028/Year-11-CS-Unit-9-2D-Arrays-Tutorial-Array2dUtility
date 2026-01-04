public class Array2dUtility {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static int sum(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }

    public static double average(int[][] arr) {
        int total = sum(arr);
        int numberOfElements = arr.length * arr[0].length;
        return Math.round((double) total / numberOfElements * 100.0) / 100.0;
    }

    public static int minimum(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static int maximum(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int evenCountStandard(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int evenCountEnhanced(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            for (int num : row) {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean allPositive(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] rowSums(int[][] arr) {
        int[] rowSums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            rowSums[i] = sum;
        }
        return rowSums;
    }

    public static int[] colSums(int[][] arr) {
        int[] colSums = new int[arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            colSums[i] = sum;
        }
        return colSums;
    }
}
