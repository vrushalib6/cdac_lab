/*
Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}
x = 110;
Output : 6
Element x is present at index 6

*/ 

public class LinearSearchArray {
    
    public static void main(String args[]){
        int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int x = 110;
        int n = arr.length;

        int j=0;
        while(j<n){
            if(arr[j]==x)
                System.out.println("Element x is present at index "+j);
            j=j+1;
            }
    }
}
