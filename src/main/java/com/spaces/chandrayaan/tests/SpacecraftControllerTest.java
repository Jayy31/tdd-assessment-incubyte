package com.spaces.chandrayaan.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.spaces.chandrayaan.SpacecraftController;

public class SpacecraftControllerTest {
    @Test
    void testInitialPositionAndDirection() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'N');
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals('N', spacecraft.getDirection());
    }
}
