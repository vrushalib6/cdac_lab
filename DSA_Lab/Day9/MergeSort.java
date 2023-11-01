public class MergeSort {

    static void mergesort(int arr[], int b, int l){

        if(b<l){
            int mid = b+(l-b)/2;
            mergesort(arr,b,mid);
            mergesort(arr,mid+1,l);
            merge(arr,b,mid,l);
        }
    }

       static void merge(int arr[], int b, int mid, int l){

        int n1 = mid-b+1;
        int n2 = l-mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++)
        L[i]=arr[b+i];

        for(int j=0;j<n2;j++)
        R[j]=arr[mid+1+j];

        int i=0,j=0;
        int k=b;

        while(i<n1 && j<n2){
                    if(L[i]<=R[j])
                    {
                        arr[k]=L[i];
                        i++;
                    }
                    else{
                        arr[k]=R[j];
                        j++;
                    }
                    k++;

        }

        while(i<n1){				//to add remaining nodes
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
    

    public static void main(String args[]){

        int arr[] = { 20,55, 45,65,27,83,57,15,48,44};
        int n= arr.length;
        System.out.println("Before sorting");
        display(arr);
        mergesort(arr,0,n-1);
        System.out.println("After sorting");
        display(arr);
    }
    
}
