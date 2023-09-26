package org.example;

import java.lang.Math;

public class RobotCollision {
    public static String calculateCollisionPosition(int x1, int y1, int a, int f, int d){
        if (a < -90 || a > 90 || f < 0 || f > 180 || d < 0){
            return "Erro";
        }
        double angleInRadians = getAngleInRadians(a);

        int x = getPositionX(x1, d, angleInRadians);
        int y = getPositionY(y1, d, angleInRadians);

        return "(" + x + "," + y + ")";
    }

    private static int getPositionY(int y1, int d, double angleInRadians) {
        return (int) (y1 + d * Math.sin(angleInRadians));
    }

    private static int getPositionX(int x1, int d, double angleInRadians) {
        return (int) (x1 + d * Math.cos(angleInRadians));
    }

    private static double getAngleInRadians(int a) {
        return Math.toRadians(a);
    }

}
