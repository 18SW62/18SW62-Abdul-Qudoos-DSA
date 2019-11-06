 class Task6
{
    public static void main(String[] args) 
    {
        int x;
        int[][] A = {{2,3,4},{1,22,5},{20,4,5}};// 2d Array
        for(int i=0; i<A.length; i++) //
        {
        for(int j=0; j<A[i].length; j++)
        {
        for(int k=0; k<A.length; k++)
        {
        for(int l=0; l<A[k].length; l++)
        {
        if(A[k][l]>A[i][j])
        {
        x = A[i][j];
        A[i][j] = A[k][l];
        A[k][l] = x;
        }
        }
        }
        }
        }
        for(int i=0; i<A.length; i++)
        {
        for(int j=0; j<A[i].length; j++)
        {
        System.out.println("A["+i+"]"+"["+j+"] ="+A[i][j]); //printing array
        }
        }    
    }
}