package MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xHouseHigh = Double.parseDouble(scanner.nextLine());
        double yHouseLength = Double.parseDouble(scanner.nextLine());
        double hRoofHigh = Double.parseDouble(scanner.nextLine());

        double houseFrontWall = xHouseHigh * xHouseHigh;
        double houseBackWall = xHouseHigh * xHouseHigh;
        double houseFrontDoor = 1.2 * 2;
        double houseFrontWallTotal = houseFrontWall - houseFrontDoor;
        double houseFrontAndBackWallsTotal = houseBackWall + houseFrontWallTotal;

        double houseSideWall = xHouseHigh * yHouseLength;
        double windowsSize = 1.5 * 1.5;
        double houseSideWallsTotal = (2 * houseSideWall) - (2 * windowsSize);

        double allWallsTotalSize = houseFrontAndBackWallsTotal + houseSideWallsTotal;
        double totalPaintNeededWalls = (double) allWallsTotalSize / 3.4;

        //ROOF
        double roofRectangleSide = xHouseHigh * yHouseLength;
        double roofRectangleSidesTotal = 2 * roofRectangleSide;

        double roofTriangleSide = (double) xHouseHigh * hRoofHigh / 2;
        double roofTriangleSideTotal = 2 * roofTriangleSide;

        double allRoofSize = roofRectangleSidesTotal + roofTriangleSideTotal;
        double totalPaintNeededRoof = (double) allRoofSize / 4.3;
        System.out.printf("%.2f%n", totalPaintNeededWalls);
        System.out.printf("%.2f%n", totalPaintNeededRoof);

    }
}
