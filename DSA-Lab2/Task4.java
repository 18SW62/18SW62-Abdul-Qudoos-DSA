class Task4{
	static int sum=0;
 public static float Arrayaverage(int arr[]){
 	for(int i=0;i<arr.length;i++){
 		sum+=arr[i];
 	}
 	return sum/arr.length;
 }
 public static void main(String args[]){
 	int arr[]={1,2,3,4,5,6,7};
 	System.out.println(Arrayaverage(arr));
 }
}