package com.mzumbado.interview.fibonacci;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by miguelon on 4/9/15.
 */
public class FibonacciDemo1 {
    public static void main(String[] args){
        System.out.println("ola k ase");
        for (int i=1; i <= 10; i++){
            System.out.println(fibonacciRec(i));
        }
        for (int i=1; i <= 10; i++){
            System.out.println(fibonacciInt(i));
        }
    }

    private static int fibonacciRec(int position){
        if (position <= 2) {
            return 1;
        }
        else {
            return fibonacciRec(position - 2) + fibonacciRec(position - 1);
        }
    }

    private static int fibonacciInt(int position){
        if (position <= 2) {
            return 1;
        }
        else {
            int result = 1;
            int fibo1 = 1;
            int fibo2 = 1;
            for (int i = 3; i <= position; i++){
                result = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = result;
            }
            return result;
        }
    }

    private static int fibinacciQ(int position){
        if (position <= 2) {
            return 1;
        }
        else {
            int result = 1;
            Stack<Integer> s =  new Stack<Integer>();
            for (int i = 3; i <= position; i++){
                if (i < 2){
                    s.push(1);
                }
                else {
                    s.push(s.pop() + s.pop());
                }
            }
            return result;
        }
    }
}
