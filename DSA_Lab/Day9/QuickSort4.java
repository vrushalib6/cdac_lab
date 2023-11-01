public class QuickSort4 {

    static void quicksort(int arr[], int low, int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr, pivot+1,high);

        }
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return(i+1);
    }

    static void swap(int arr[], int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[] = { 44,69,78,15,26,89,34,64,87,99,110};
        int n = arr.length;
        display(arr);
        quicksort(arr,0,n-1);
        System.out.println();
        display(arr);

    }
    
}
