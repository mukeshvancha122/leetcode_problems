public class MinAndMax {

    public static void main(String[] args) {
        
        int[] arr={1,2,4,6,3};
        int min=arr[0];
        int max=arr[0];
        if(arr==null||arr.length==0){
            System.out.println("Array is empty");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Min :"+min+"Max :"+max);

    }
    
}
