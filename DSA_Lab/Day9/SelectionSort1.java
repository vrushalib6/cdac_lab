public class SelectionSort1 {

    static void selectionsort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
           int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] =temp;
            
        }
    }

    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={11,54,89,6,36,98,47,99,56};
        int n= arr.length;
        display(arr);
        selectionsort(arr);
        System.out.println();
        display(arr);
    }
    
}
