package SDE.Day22;

// https://leetcode.com/problems/flood-fill
// Flood Fill Algorithm (LeetCode)

public class Problem6 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        helper(image, newColor, sr, sc, image[sr][sc]);
        return image;
    }
    public void helper(int[][] image, int newColor, int i, int j, int color){
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != color) return;
        image[i][j] = newColor;
        helper(image, newColor, i+1, j, color);
        helper(image, newColor, i-1, j, color);
        helper(image, newColor, i, j+1, color);
        helper(image, newColor, i, j-1, color);
    }
}
