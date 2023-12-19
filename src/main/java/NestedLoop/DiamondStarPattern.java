package NestedLoop;

public class DiamondStarPattern {
    public static void main(String[] args) {
        int row=5;
        for(int x=0;x<row;x++)
        {
            for(int y=0;y<row-x;y++)
            {
                System.out.print(" ");
            }
            for(int y=0;y<=x;y++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=0;x<row-1;x++)
        {
            for(int y=0;y<=x;y++)
            {
                System.out.print(" ");
            }
            for(int y=0;y<row-x-1;y++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
