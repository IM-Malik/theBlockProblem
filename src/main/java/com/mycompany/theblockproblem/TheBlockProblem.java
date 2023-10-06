package com.mycompany.theblockproblem;
import java.util.Scanner;

public class TheBlockProblem {

    public static void main(String[] args) {
        System.out.print("Enter the number of Bricks: ");
        Scanner input = new Scanner(System.in);
        int numOfBricks = input.nextInt();
        System.out.println(bricksToUnload(numOfBricks));
    }
    
    public static int bricksToUnload(int numOfBricks) {
        if (numOfBricks == 1) {
            return 1;
        } else if (numOfBricks < 4) {
            return (numOfBricks - 1) + bricksToUnload(numOfBricks - 1);
        } else {
            return bricksToUnload(numOfBricks - 1) + bricksToUnload(numOfBricks - 2) + bricksToUnload(numOfBricks - 3);
        }
    }
}
