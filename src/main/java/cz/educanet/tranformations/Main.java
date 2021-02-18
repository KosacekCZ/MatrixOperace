package cz.educanet.tranformations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("times")) {
            matrix.times(matrix);
            for (int i = 0; i < matrix.getColumns() + matrix.getRows(); i++) {
                System.out.println(matrix.);
            }
        }
    }
}
