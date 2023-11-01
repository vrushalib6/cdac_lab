public class BubbleSort {
    
    static void bubbleSort(int arr[]){
        int length = arr.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubbleSort(arr);
        System.out.println("After sorting");
        display(arr);
    }
}
