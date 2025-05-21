package at.htl.points;

import java.util.Arrays;

public class Point2dTest {
    public static void main(String[] args) {
        Point2d playerOne = new Point2d(1,1);
        Point2d playerToo = new Point2d(1,1);
        double distanceBetween =playerOne.distance(playerToo);
        System.out.println(distanceBetween);

        double distanceBetweenToo = Point2d.distance(playerOne,playerToo);
        System.out.println(distanceBetweenToo);
        double getDistanctoCenter = playerOne.getDistanceToCenter();
        System.out.println(getDistanctoCenter);
        boolean positionCheck = playerOne.samePosition(playerToo);
        System.out.println(positionCheck);


        Point2d []arr = new Point2d[3];
        arr[0] = new Point2d(3,3);
        arr[1] = new Point2d(2,2);
        arr[2]= new Point2d(1,1);
        arr[0].translate(4,4);

        System.out.println(Arrays.toString(arr));

        Point2d [] arrSort = Point2d.sortedByX(arr);
        System.out.println(Arrays.toString(arrSort));
    }

}
