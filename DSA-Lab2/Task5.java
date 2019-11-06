import java.util.ArrayList; //import the package of ArrayList;
class Task5
{
    public static int secondLargest(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        int m = a[0]; //it will store element present at index 0
        for(int i=0; i<a.length; i++)
        { 
            if(a[i]>m)
            {
                m = a[i];
                list.add(i);
            }
        }
        return (list.get(list.size()-2)); //it will return index
    }
    public static void main(String[] args) {
        int[] array = {1,21,33,44,55,66};// declaration & initialization of array a of type int 
        System.out.println("Index of second largest element in the array: "+secondLargest(array)); // it will print index of second largest value present in array a  
    }
}