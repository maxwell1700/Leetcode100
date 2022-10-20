package valid_parenthesis;

import java.util.Stack;

public class main {

    public static void main(String[] args) {

        System.out.println(validParenthesis("{[]}"));
    }

    static Boolean validParenthesis(String str){

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '{'){
               stack.push('}');

           }else if(c == '['){

               stack.push(']');

           } else if(c == '('){

            stack.push(')');

        }else if(stack.isEmpty()|| stack.pop()!= c){
               return false;
           }




        }
        return stack.isEmpty();
    }
}
