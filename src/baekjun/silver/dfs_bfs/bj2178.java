package baekjun.silver.dfs_bfs;

import java.io.*;

public class bj2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] a = bufferedReader.readLine().split(" ");

        int row = Integer.parseInt(a[0]);
        int col = Integer.parseInt(a[1]);

        int[][] map = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] line = bufferedReader.readLine().split("");
            for (int j = 0; j < col; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

    }
}