public class InsertionSort {

    static void insertionSort(int arr[]){
         int n=  arr.length;
         for(int i=0;i<n;i++)
		{
			int key = arr[i];//3
			int j=i-1;//
			
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
			
		}

    }
    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void main(String args[]){
        int arr[] = {20,55,16,72,84,34,92};
       
            display(arr);
        insertionSort(arr);
        System.out.println("After sorting");
        display(arr);
    }
}
