import java.util.*;

public class CalculateInfix{
    /**
     * Evaluate a Expression using infix notation
     * 
     * -(4+(2+3))
     * -9
     */
    float infix(String expression){
        Stack<Character> expStack=new Stack<Character>();
        OwnStack numStack=new OwnStack();
        for (int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if (ch==')'){
                float value1=numStack.pop();
                float value2=numStack.pop();
                char ops=expStack.pop();
                float res=0;
                if (ops=='+') {
                    res=value2+value1;
                }
                if (ops=='-'){
                     res=value2-value1;
                }
                if  (ops=='/'){
                     res=value2/value1;
                }
                if (ops=='*'){
                     res=value1*value2;
                }
            numStack.push(res);
            }
            else if((ch>='0') & (ch <='9')){
                numStack.push(Character.getNumericValue(ch));
                
            }
            else if (ch=='+' ||ch=='-'||ch=='/'||ch=='*'){
                expStack.push(ch);
            }

        }
        return numStack.pop();
    }
    public static void main(String [] args) {
        CalculateInfix cal=new CalculateInfix();
        System.out.println(cal.infix("-(4+(2+3))"));
    }
}
