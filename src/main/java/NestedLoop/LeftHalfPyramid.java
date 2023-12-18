package NestedLoop;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        for (int i=0; i<4;i++) {
//            for (int j = 0; j <=5-1; j--) {
//
//            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}