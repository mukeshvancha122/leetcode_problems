public class PalindromString {
    public static void main(String[] args) {
        String data="abcba";
        Boolean decisiBoolean=palindrome(data);
        System.out.println(decisiBoolean);
        
    }
    public static boolean palindrome(String data){
        int left=0;
        int right=data.length()-1;
        while(left<right){
            if(data.charAt(left)!=data.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
