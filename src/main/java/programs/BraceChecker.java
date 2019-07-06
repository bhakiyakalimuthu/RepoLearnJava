package programs;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;


import java.util.Stack;

public class BraceChecker {
    public static void main(String[] args) {
//        System.out.println(braceChecker("hello"));
        System.out.println(braceChecker("(())"));
    }

    public static Boolean braceChecker (String str){
        Stack stack = new Stack();
        char start1 = str.charAt(0);
        for (int i =0; i < str.length(); i++) {
            char start = str.charAt(i);
            switch (start){
                case '[':
                    stack.push('[');
                    continue;
                case '(':
                    stack.push('(');
                    continue;
                case '{':
                    stack.push('{');
                    continue;
            }
            if (!stack.empty()) {
                switch (start){
                    case ']':
                        if(stack.pop().equals('[')){
                            continue;
                        }
                        return false;
                    case ')':
                        if(stack.pop().equals('(')){
                            continue;
                        }
                        return false;
                    case '}':
                        if(stack.pop().equals('{')){
                            continue;
                        }
                        return false;
                }
            }
            return false;
        }
        return false;
    }
}
