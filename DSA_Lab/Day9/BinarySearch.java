class BinarySearch{

     static int search(int arr[],int x,int b,int l){
        
        if(l>=b){
            int mid = b+(l-b)/2;
            if(arr[mid]==x)
            return mid;
            
            if(arr[mid]>x)
                return search(arr,x,b,mid-1);
              
            return search(arr,x,mid+1,l);
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = { 22,36,45,55,62,71,88,97};
        int x = 68;
       int n = arr.length;

       int result = search(arr,x,0,n-1);
       if(result==-1)
        System.out.println("Not Found");
        else
         System.out.println("Found");

    }
}