package com.codewars.kata;

class BoggleWordChecker {

    private final char[][] board;
    private final String word;
    private final int[][] dir = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{-1,-1},{1,-1}};
    private final int m;
    private final int n;

    BoggleWordChecker(final char[][] board, final String word) {
        this.board = board;
        this.word = word;
        m = board.length;
        n = m == 0 ? 0 : board[0].length;
    }

    public boolean check() {
        for (int x = 0; x < m; ++x)
            for (int y = 0; y < n; ++y)
                if (dfs(0, x, y))
                    return true;
        return false;
    }

    private boolean dfs(int idx, int x, int y) {
        if (idx == word.length()) {
            return true;
        }
        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] == '*') {
            return false;
        }
        if (board[x][y] == word.charAt(idx)) {
            board[x][y] = '*';
            for (int i = 0; i < dir.length; ++i) {
                if (dfs(idx+1, x+dir[i][0], y+dir[i][1])) {
                    board[x][y] = word.charAt(idx);
                    return true;
                }
            }
            board[x][y] = word.charAt(idx);
        }
        return false;
    }

}
