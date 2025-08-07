package searching;

public class Linear {
    public static void main(String[] args) {
        
        int[] arr={4,2,6,8,3};
        int searchKey=1;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchKey){
                found=true;
                break;
            }else{
                found=false;
            }
        }
        System.out.println(found? "found":"not found");
    }
    
}
