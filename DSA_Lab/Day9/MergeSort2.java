public class MergeSort2 {
    static void mergesort(int arr[], int low, int high){
        if(low<high){
        int mid = low+(high-low)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
}


    static void merge(int arr[], int low, int mid, int high){

        int n1 = mid-low+1;
        int n2 = high-mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++)
        L[i] = arr[low+i];

        for(int j=0;j<n2;j++)
        R[j] = arr[mid+1+j];

        int i=0,j=0;
        int k=low;

        while(i<n1 && j<n2){
                if(L[i]<=R[j]){
                    arr[k] = L[i];
                    i++; 
                }
                else{
                    arr[k] = R[j];
                    j++;
                }
                k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;

        }
    }

    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[] = {15,47,89,12,65,89,22,59,98};
        int n = arr.length;

        display(arr);
        mergesort(arr,0,n-1);
        System.out.println();
        display(arr);
    }
    
}
