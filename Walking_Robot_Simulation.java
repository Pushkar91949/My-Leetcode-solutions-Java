class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0, d = 0;
        int[][] direct = {{0,1},{1,0},{0,-1},{-1,0}};
        int ans = 0;
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle: obstacles){
            obstacleSet.add(obstacle[0]+","+obstacle[1]);
        }
        for (int c : commands){
            if (c == -1){
                d =(d + 1) % 4;
            } else if (c == -2){
                d = (d + 3) % 4;
            } else {
                int dx = direct[d][0];
                int dy = direct[d][1];
                for (int i = 0; i < c; i++){
                    int nextX = x+dx;
                    int nextY = y+dy;
                    if (obstacleSet.contains(nextX + "," + nextY)){
                        break;
                    }
                    x = nextX;
                    y = nextY;
                }
            }
            ans = Math.max(ans, x * x + y * y);
        }
        return ans;
    }
}
