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
    
    @Test
    void testMoveForwardNorth() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'N');
        spacecraft.move('f');
        assertEquals(1, spacecraft.getY());
    }

    @Test
    void testMoveForwardSouth() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'S');
        spacecraft.move('f');
        assertEquals(-1, spacecraft.getY());
    }

    @Test
    void testMoveForwardEast() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'E');
        spacecraft.move('f');
        assertEquals(1, spacecraft.getX());
    }

    @Test
    void testMoveForwardWest() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'W');
        spacecraft.move('f');
        assertEquals(-1, spacecraft.getX());
    }

    @Test
    void testMoveForwardUp() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'U');
        spacecraft.move('f');
        assertEquals(1, spacecraft.getZ());
    }

    @Test
    void testMoveForwardDown() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'D');
        spacecraft.move('f');
        assertEquals(-1, spacecraft.getZ());
    }

}
