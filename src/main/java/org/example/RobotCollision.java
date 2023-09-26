package org.example;

import java.lang.Math;

public class RobotCollision {
    public static String calculateCollisionPosition(int x1, int y1, int a, int f, int d){
        if (a < -90 || a > 90 || f < 0 || f > 180 || d < 0){
            return "Erro";
        }

        double angleInRadians = Math.toRadians(a);

        int x = (int) (x1 + d * Math.cos(angleInRadians));
        int y = (int) (y1 + d * Math.sin(angleInRadians));

        return "(" + x + "," + y + ")";
    }
}
