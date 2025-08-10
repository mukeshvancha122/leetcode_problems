package strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        int[] arr={1,1,1,1,2,2,2,2,3,3,3};
        int i=0;
        for(int j=1;i<arr.length-1;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
    
}
