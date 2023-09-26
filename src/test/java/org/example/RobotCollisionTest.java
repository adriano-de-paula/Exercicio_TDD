package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class RobotCollisionTest {
    @Test
    @DisplayName("Test calculate collision Position Forward")
    void testCalculateCollisionPositionForward(){
        RobotCollision robotCollision = new RobotCollision();
        assertThat(robotCollision.calculateCollisionPosition(0, 0, 45, 90,5))
                .isEqualTo("(3,3)");
    }
}