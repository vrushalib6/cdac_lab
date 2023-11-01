public class Bubblesort1 {

    static void bubblesort(int arr[]){
        int n  =arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
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


    public static void main(String[] args) {
        int arr[] = {11,55,69,47,89,66,84,21,15,99};
        int n= arr.length;
        display(arr);
        bubblesort(arr);
        System.out.println();
        display(arr);

    }
    
}
