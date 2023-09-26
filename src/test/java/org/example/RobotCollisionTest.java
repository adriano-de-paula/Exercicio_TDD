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
}