package com.MyLeetCode;

import java.util.Stack;

/**
 * @author Saw96x
 * @date 2020/9/7 - 7:46
 */
public class isValid_20 {
    public static boolean isValid(String s) {
//        给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//        有效字符串需满足：
//
//        左括号必须用相同类型的右括号闭合。
//        左括号必须以正确的顺序闭合。
//
//        注意空字符串可被认为是有效字符串。
        if (s.length() == 0 || "".equals(s) || s == null)
            return true;
        Stack<Character> stack = new Stack<>();
        int pointer = 0;
        stack.push(s.charAt(pointer++));
        while (pointer < s.length()) {
            //当元素是左括号的时候，压入栈中，同时如果栈中没有元素，右括号也应该压入栈中
            //否则就会出现多一个右括号，栈为空返回true的情形
            if (s.charAt(pointer) == '(' ||
                    s.charAt(pointer) == '{' ||
                    s.charAt(pointer) == '[' ||
                    (s.charAt(pointer) == ')' && stack.empty()) ||
                    (s.charAt(pointer) == '}' && stack.empty()) ||
                    (s.charAt(pointer) == ']' && stack.empty())) {
                stack.push(s.charAt(pointer));
            } else if (s.charAt(pointer) == ')') {
                if (stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            } else if (s.charAt(pointer) == ']') {
                if (stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            } else if (s.charAt(pointer) == '}') {
                if (stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
            pointer++;
        }
        if (stack.empty())
            return true;
        else
            return false;
    }
    public static void main(String []args){
        System.out.println(isValid("()"));
    }
}
