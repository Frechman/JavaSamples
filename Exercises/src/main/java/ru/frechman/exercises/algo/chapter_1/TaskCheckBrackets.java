package ru.frechman.exercises.algo.chapter_1;

import java.util.Scanner;
import java.util.Stack;

public class TaskCheckBrackets {
    private static String SUCCESS = "Success";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkBrackets(str));
    }


    static String checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> num = new Stack<>();
        char[] arraySrt = str.toCharArray();

        for (int i = 0; i < arraySrt.length; i++) {
            if (arraySrt[i] == '(' || arraySrt[i] == '[' || arraySrt[i] == '{') {
                stack.push(arraySrt[i]);
                num.push(i);
            }
            if (arraySrt[i] != ')' && arraySrt[i] != ']' && arraySrt[i] != '}') {
                continue;
            }
            if (stack.empty()) {
                return String.valueOf(i + 1);
            }
            char top = stack.pop();
            num.pop();
            if ((top == '(' && arraySrt[i] != ')')
                    || (top == '[' && arraySrt[i] != ']')
                    || (top == '{' && arraySrt[i] != '}')) {
                return String.valueOf(i + 1);
            }

        }
        return stack.empty() ? SUCCESS : String.valueOf(num.pop() + 1);
    }
}