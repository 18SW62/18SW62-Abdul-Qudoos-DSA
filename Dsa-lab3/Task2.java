class LinearSearch{
    public static int linearSearch(String []array,String target){
        int i;   //Decalration
        for(i=0;i<array.length;i++){
            if(array[i]==target){
                return i;     //returns the index of value            
            }
        }
        return -i;   //if value not found , then it will return -i;
    }
    public static int linearSearch1(char []array,char target){
        int i;   //Decalration
        for(i=0;i<array.length;i++){
            if(array[i]==target){
                return i;     //returns the index of value            
            }
        }
        return -i;   //if value not found , then it will return -i;
    }
}

class Main{
    public static void main(String[]args){
        String []arr={"Qudoos","Shoukat","Ambedgar","Jabbar","Ali Raza"};  //Initializes the String array
        char []c = {'q','u','d','o','o','s'};    //Initializes the Character Array

        String key1="Ambedgar";
        char key2='u';         

        int search=LinearSearch.linearSearch(arr, key1);   //storing the index of String in index1
        int search1=LinearSearch.linearSearch1(c, key2);     //storing the index of Character in index2

        if(search>=0){
            System.out.println("Name Found, index is "+search);  //printing the index of String
        }
        else{
            System.out.println("Name not found");
        }

        if(search1>=0){
            System.out.println("Character Found, index is "+search1);  //printing the index of Character
        }
        else{
            System.out.println("Character not found");
        }

    } 
}
