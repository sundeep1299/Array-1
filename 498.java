class Solution {
    public int[] findDiagonalOrder(int[][] mat) 
    {
        if(mat==null || mat.length==0) return new int[]{};
        
        int m= mat.length;
        int n= mat[0].length;
        int[] res= new int[m*n];
        int r=0;
        int c=0;
        int index=0;
        int dir=1;
        
        while(index<m*n)
        {
            res[index]=mat[r][c];
            index++;
            if(dir==1)
            {
                if(c==n-1)
                {
                    dir=-1;
                    r++;
                }
                else if(r==0)
                {
                    dir=-1;
                    c++;
                }
            }else{
                r--;
                c++;
            }
        }
    }
}