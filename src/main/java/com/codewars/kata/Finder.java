package com.codewars.kata;

class Finder {

    static boolean pathFinder(String maze) {
        Node[][] nodes = generateMaze(maze);
        boolean result = isExitFound(nodes, 0, 0);
        return result;
    }

    private static boolean isExitFound(Node[][] maze, int x, int y) {
        int mazeSize = maze.length;
        Node currentStep = maze[x][y];
        if (x == mazeSize - 1 && y == mazeSize - 1) return true;
        if (currentStep.wall || currentStep.visited) return false;
        currentStep.visited = true;
        if (x != 0 && isExitFound(maze, x - 1, y)) {
            currentStep.correctPath = true;
            return true;
        }
        if (x != (mazeSize - 1) && isExitFound(maze, x + 1, y)) {
            currentStep.correctPath = true;
            return true;
        }
        if (y != 0 && isExitFound(maze, x, y - 1)) {
            currentStep.correctPath = true;
            return true;
        }
        if (y != (mazeSize - 1) && isExitFound(maze, x, y + 1)) {
            currentStep.correctPath = true;
            return true;
        }
        return false;
    }


    static Node [][] generateMaze(String rawPayload) {
        String[] columns = rawPayload.split("\n");
        Node result [][] = new Node[columns.length][columns.length];
        for (int y = 0; y < columns.length; y++) {
            String[] rows = columns[y].split("");
            for (int x = 0; x < rows.length; x++) {
                result[y][x] = new Node(rows[x].equalsIgnoreCase("w"));
            }
        }
        return result;
    }

    static class Node {

        Node(boolean wall) {
            this.wall = wall;
        }

        boolean wall;
        boolean visited = false;
        boolean correctPath = false;
    }



}
