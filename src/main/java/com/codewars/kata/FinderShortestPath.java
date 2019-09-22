package com.codewars.kata;

class FinderShortestPath {

    private final static int INF = Integer.MAX_VALUE;

    public static int pathFinder(String rawPayload) {
        int[][] maze = initMaze(rawPayload);
        goTo(maze, 0, 0, 0);
        return (maze[maze.length - 1][maze.length - 1] == INF) ? -1 : maze[maze.length - 1][maze.length - 1];
    }

    private static void goTo(int[][] maze, int i, int j, int step){
        if(i==-1 || i==maze.length || j==-1 || j==maze.length || maze[i][j] <= step)
            return;
        maze[i][j] = step;
        goTo(maze, i+1, j, step+1);
        goTo(maze, i-1, j, step+1);
        goTo(maze, i, j-1, step+1);
        goTo(maze, i, j+1, step+1);
    }

    private static int[][] initMaze(String rawPayload){
        int[][] maze;
        String[] lines = rawPayload.split("\n");
        maze = new int[lines.length][lines.length];
        for(int i=0; i<lines.length; i++)
            for(int j=0; j<lines.length; j++)
                maze[i][j] = (lines[i].charAt(j)=='W')?-1:INF;
        return maze;
    }
}
