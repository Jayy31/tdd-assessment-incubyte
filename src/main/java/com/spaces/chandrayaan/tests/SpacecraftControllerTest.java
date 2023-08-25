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
    
    @Test
    void testMoveBackwardNorth() {
        SpacecraftController spacecraft = new SpacecraftController(0, 1, 0, 'N');
        spacecraft.move('b');
        assertEquals(0, spacecraft.getY());
    }

    @Test
    void testMoveBackwardSouth() {
        SpacecraftController spacecraft = new SpacecraftController(0, -1, 0, 'S');
        spacecraft.move('b');
        assertEquals(0, spacecraft.getY());
    }

    @Test
    void testMoveBackwardEast() {
        SpacecraftController spacecraft = new SpacecraftController(1, 0, 0, 'E');
        spacecraft.move('b');
        assertEquals(0, spacecraft.getX());
    }

    @Test
    void testMoveBackwardWest() {
        SpacecraftController spacecraft = new SpacecraftController(-1, 0, 0, 'W');
        spacecraft.move('b');
        assertEquals(0, spacecraft.getX());
    }

    @Test
    void testMoveBackwardUp() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 1, 'U');
        spacecraft.move('b');
        assertEquals(0, spacecraft.getZ());
    }

    @Test
    void testMoveBackwardDown() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, -1, 'D');
        spacecraft.move('b');
        assertEquals(0, spacecraft.getZ());
    }
    
    @Test
    void testTurnLeft() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'N');
        spacecraft.move('l');
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    void testTurnRight() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'N');
        spacecraft.move('r');
        assertEquals('E', spacecraft.getDirection());
    }
    
    @Test
    void testRotateUp() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'N');
        spacecraft.move('u');
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    void testRotateDown() {
        SpacecraftController spacecraft = new SpacecraftController(0, 0, 0, 'N');
        spacecraft.move('d');
        assertEquals('D', spacecraft.getDirection());
    }

}
