package com.spaces.chandrayaan;

public class SpacecraftController {
	
    private int x;
    private int y;
    private int z;
    private char direction;

    public SpacecraftController(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	public char getDirection() {
		return direction;
	}


	public void setDirection(char direction) {
		this.direction = direction;
	}
	
    private void moveForward() {
        if (direction == 'N') y++;
        else if (direction == 'S') y--;
        else if (direction == 'E') x++;
        else if (direction == 'W') x--;
        else if (direction == 'U') z++;
        else if (direction == 'D') z--;
    }
    
    private void moveBackward() {
        if (direction == 'N') y--;
        else if (direction == 'S') y++;
        else if (direction == 'E') x--;
        else if (direction == 'W') x++;
        else if (direction == 'U') z--;
        else if (direction == 'D') z++;
    }

	public static void main(String[] args) {
        int startX = 0, startY = 0, startZ = 0;
        char startDirection = 'N';
        char[] commands = {'f', 'r', 'u', 'b', 'l'};

        SpacecraftController spacecraft = new SpacecraftController(startX, startY, startZ, startDirection);
        
    }

	}
	


