package valid_parenthesis;

import java.util.Stack;

public class main {

    public static void main(String[] args) {

        System.out.println(validParenthesis("{[]}"));
    }

    static Boolean validParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
           char parenthesis =  str.charAt(i);

           if(parenthesis == '{'){
               stack.push('}');

           }else if(parenthesis == '['){

               stack.push(']');

           } else if(parenthesis == '('){

            stack.push(')');

        }else if(stack.isEmpty()|| stack.pop()!= parenthesis){
               return false;
           }




        }
        return stack.isEmpty();
    }
}
