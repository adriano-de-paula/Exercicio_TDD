package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class RobotCollisionTest {
    private  RobotCollision robotCollision;

    @BeforeEach
    void setUp(){
       robotCollision = new RobotCollision();
    }

    @Test
    @DisplayName("Test calculate collision Position Forward")
    void testCalculateCollisionPositionForward(){
        assertThat(robotCollision.calculateCollisionPosition(0, 0, 45, 90,5))
                .isEqualTo("(3,3)");
    }

    @Test
    @DisplayName("Test calculate collision Position Right")
    void testCalculateCollisionPositionRight(){
        assertThat(robotCollision.calculateCollisionPosition(0, 0, 90, 90,5))
                .isEqualTo("(0,5)");
    }

    @Test
    @DisplayName("Test calculate collision Position Left")
    void testCalculateCollisionPositionLeft(){
        assertThat(robotCollision.calculateCollisionPosition(0, 0, -90, 90,5))
                .isEqualTo("(0,-5)");
    }

    @Test
    @DisplayName("Test invalid angle")
    void testInvalidAngle(){
        assertThat(robotCollision.calculateCollisionPosition(0, 0, 200, 90,5))
                .isEqualTo("Erro");
    }

    @Test
    @DisplayName("Test invalid beam")
    void testInvalidBeam(){
        assertThat(robotCollision.calculateCollisionPosition(0, 0, 45, 185,5))
                .isEqualTo("Erro");
    }

    @Test
    @DisplayName("Test negative distance")
    void testNegativeDistance(){
        assertThat(robotCollision.calculateCollisionPosition(0, 0, 45, 90,-5))
                .isEqualTo("Erro");
    }
}