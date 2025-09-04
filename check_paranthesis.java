// java code to check paranthesis using stack.
import java.util.*;
class ValidExpression{
    public void doCheck(){
        String s = "[{()}]";
        int flag = 0;
        Stack st = new Stack();
        for(int i=0 ;i<s.length() ;i++){
            char ch = s.charAt(i);
            if(ch=='[' || ch =='{' || ch=='('){
                st.push(ch);
            } else  {
                char top = (char)st.peek();
                if(ch == ')'){
                    if(top != '('){
                        flag = 1;
                        break;
                    }
                }
                if(ch == '}'){
                    if(top != '{'){
                        flag = 1;
                        break;
                    }
                }
                if(ch == ']'){
                    if(top != '['){
                        flag = 1;
                        break;
                    }
                }
                st.pop();
            }
            
        } //end of loop
        if(flag == 0 && st.isEmpty()){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	ValidExpression p = new ValidExpression();
	p.doCheck();   
	}
}
