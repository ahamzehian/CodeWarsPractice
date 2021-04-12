package com.amirportfolio;

import java.util.Arrays;

public class Main {

    private static final int[][] inputArray = {{1,2,3},{4,5,6},{7,8,9}};

    public static void main(String[] args) {

        System.out.println(inputArray.length);
        if (inputArray[0].length!=0) {
            System.out.println(Arrays.toString(finalResult()));
        } else {
            System.out.println(Arrays.toString(new int[0][0]));
        }


    }

    public static int[] directionLimits() {

        int limit = inputArray[0].length + inputArray.length - 1;
        int[] result = new int[limit];
        result[0] = inputArray[0].length-1;
        int attempt = 1;
        int direction = 1;
        int jLimit = inputArray[0].length - 1;
        int iLimit = inputArray.length - 1;

        for (int i = 1; i < limit; i++) {
            if (i % 2 == 0) {
                result[i] = iLimit*direction;
                iLimit--;
                attempt++;
                if (attempt % 2 == 0) {
                    if (direction == -1) {
                        direction = 1;
                    } else {
                        direction = -1;
                    }
                }
            } else {
                result[i] = jLimit*direction;
                jLimit--;
                attempt++;
                if (attempt % 2 == 0) {
                    if (direction == -1) {
                        direction = 1;
                    } else {
                        direction = -1;
                    }
                }
            }
        }

        return result;

    }

    public static int[] finalResult() {
        int[] guide = directionLimits();
        int[] result = new int[inputArray[0].length*inputArray.length];

        int direction;
        int moveCount = inputArray[0].length + inputArray.length - 1;
        int iStart = 0;
        int jStart = 0;
        int step = 1;

        int index = 0;

        for (int i = 0; i < moveCount; i++) {
            int limit = guide[i];
            if (i % 2 == 0) {
                if (limit > 0) {
                    direction = 1;
                } else {
                    direction = -1;
                }
                while (limit != 0) {
                    System.out.println(inputArray[iStart][jStart]);
                    result[index] = inputArray[iStart][jStart];
                    index++;
                    limit -= direction;
                    jStart += step*direction;
                }
            }
            if (i % 2 != 0) {
                if (limit > 0) {
                    direction = 1;
                } else {
                    direction = -1;
                }
                while (limit != 0) {
                    System.out.println(inputArray[iStart][jStart]);
                    result[index] = inputArray[iStart][jStart];
                    index++;
                    limit -= direction;
                    iStart += step*direction;
                }
            }
        }
        System.out.println(inputArray[iStart][jStart]);
        result[index] = inputArray[iStart][jStart];

        return result;
    }

}
