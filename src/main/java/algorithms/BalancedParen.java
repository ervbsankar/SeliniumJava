package algorithms;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParen {

    private static char[][] TOKENS = {{'{','}'},{'[',']'},{'(',')'}};

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String bracket =  scan.nextLine();
        System.out.println(isBalanced(bracket));
    }

    private static boolean isBalanced(String bracket){
        char[] bracketChar = bracket.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : bracketChar){
            if(isOpenToken(c)){
                stack.push(c);
            } else {
                if(stack.isEmpty() || !matches(stack.pop(),c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpenToken(char open) {
        for(char[] token : TOKENS){
            if(token[0] == open){
                return true;
            }
        }
        return false;
    }

    private static boolean matches(char open, char closed){
        for(char[] token : TOKENS){
            if(token[0] == open){
                return token[1] == closed;
            }
        }
        return false;
    }
}
