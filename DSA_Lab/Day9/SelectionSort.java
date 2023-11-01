public class SelectionSort {
    static int min;
    static void selectionSort(int arr[]){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp  = arr[min];
            arr[min] = arr[i];
            arr[i ] = temp;
        }


    }
    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {20,55,16,72,84,34,92};
        int n=  arr.length;
        display(arr);
        selectionSort(arr);
        System.out.println("After sorting");
        display(arr);
    }
}
