class Task7
{
    public static int removeDuplicate(int[] a) //method for returning the length of an array
    {
        int q=0;
        for(int i=0; i<a.length-1; i++)
        {
            if(a[i]!=a[i+1])
            {
                a[q++] = a[i]; //comparing two elements whether they are not same then the element will be stored
            }
        }
        a[q++] = a[a.length-1]; //storing last element
        for(int i=0; i<q; i++)
        {
            System.out.println(a[i]);
        }/
        return q; //returning new length
    } 
    public static void main(String[] args) {
        int[] a = {20,20,20,30,40,50,50};
        System.out.println("New length of Array = "+removeDuplicate(a)); //it will print new length after removing duplicates.
    }
}
