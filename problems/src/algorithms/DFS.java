package algorithms;

import java.util.Arrays;

public  class DFS {
    
    private int a[] = new int[10];
    
    private int book[] = new int[10];
    
    private int n = 3;
    
   
    
    public void dfs(int step)
    {
        int i=0;
        if(step == n+1)
        {
            System.out.println(Arrays.toString(a));
            return;
        }
        
        for( i=1;i<=n;i++)
        {
            if(book[i]==0)
            {
                a[step] = i;
                book[i] = 1;
                
                dfs(step+1);
                book[i] = 0;
            }
        }
        
    }
    
    public static void main(String []args)
    {
        DFS d = new DFS();
        d.dfs(1);
    }

}
