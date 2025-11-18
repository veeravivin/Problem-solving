class Solution {
    public int orangesRotting(int[][] grid) {
        int freshcount=0;
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1)
                {
                    freshcount++;
                }
            }
        }
        if(freshcount==0) return 0;
        int count=0;
        int days=0;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        while(!q.isEmpty())
        {
           for(int i=0;i<q.size();i++)
           {
              int[] p=q.poll();
              for(int j=0;j<4;j++)
              {
                  int x=p[0]+dx[j];
                  int y=p[1]+dy[j];
                  if(x<0||y<0||x>=m||y>=n||grid[x][y]!=1)
                  {
                    continue;
                  }
                  grid[x][y]=2;
                  q.offer(new int[]{x,y});
                  count++;
              }
           }
           if(!q.isEmpty())
           {
              days++;
           }
           
        }
return count==freshcount?days:-1;
}
}