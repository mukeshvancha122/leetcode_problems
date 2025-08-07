package searching;

public class Binary {
    public static void main(String[] args) {
        
        int[] arr={2, 3, 4, 6, 8};
        int searchKey=1;
        int left=0;
        int n=arr.length;
        int right=n;
        while(left<right){
            int mid=(left+right)/n;
            if(arr[mid]<searchKey){
            right=mid-1;
            }
            if(arr[mid]>searchKey){
            left=mid+1;
            }
            if(arr[mid]==searchKey){
            System.out.println("Element found at:" +mid);
            break;
            }
        
        }
            System.out.println("Not found");
    }
}
