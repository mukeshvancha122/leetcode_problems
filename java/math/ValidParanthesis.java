import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        boolean matched=false;
        String data="{[]}";
        for(char c: data.toCharArray()){
            if(c=='('|| c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')'|| c=='}' || c==']'){
                if(stack.isEmpty()){
                    matched=false;
                }
                char top=stack.pop();
                if((c==')' && top!='(')|| (c=='}' && top!='{')|| (c==']' && top!='[')){
                    matched=false;
                }
            }
        }
        boolean isStackEmpty=stack.isEmpty();
        System.out.println(isStackEmpty);
    }
}
