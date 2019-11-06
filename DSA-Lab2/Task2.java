class Task2
{
    public static void main(String[] args) 
    {
        int[] a1 ={2,3,4,23,11,22}; //here we are inititalizing an array;
        int[] a2 ={2,3,4,23,11,22}; 
        int count=0;
        if(a1.length==a2.length) //here we check the condition whether the length of both arrays is equals or not
        {
            for(int i=0; i<a1.length; i++) // loop for traversing the elements of first array
            {
                if(a1[i]==a2[i]) //here we are checking the whether the arrays are equal or not
                {
                    count++; //it will increase the value of count when both condition will become true
                }// end of if condition
            }// end of for loop
            if(count==a1.length) 
            {
                System.out.println("Arrays are equal");
            }// end of if condition
            else
            {
                System.out.println("Arrays are not equal");
            }//else
        }
        else{ // if length of both arrays are not same 
            System.out.println("Arrays are not equal"); 
        }
    }
}