public class BinarySearch1 {
    static int binarysearch(int arr[],int x, int low, int high){
        if(high>=low){
            int mid = low+(high-low)/2;
            if(arr[mid]==x)
            return mid;
            if(arr[mid]>x)
               return  binarysearch(arr, x, low, mid-1);
                
            
            return binarysearch(arr, x, mid+1, high);    
          
    }
          return -1;
        
}

static void display(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        int arr[]={14,54,87,88,94,97,105,112,230};
        int x = 88;
        int n = arr.length;
        int found =binarysearch(arr,x,0,n-1);
        if(found==-1){
            System.out.println("NOt found");
        }
        else{
            System.out.println("Element found");
        }
    }
    
}
