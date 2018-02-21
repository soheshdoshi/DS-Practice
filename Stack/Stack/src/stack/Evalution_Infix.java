
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sohesh
 */
public class Evalution_Infix {
    
    static int Infix(String exp)
    {
    Stack<Integer> stack=new Stack<>();
       for(int i=0;i<exp.length();i++)
       {
           char c=exp.charAt(i);
           if(Character.isDigit(c))
               stack.push(c-'0');
           else
           {
               int op1=stack.pop();
               int op2=stack.pop();
               switch(c)
               {
                   case '+':
                       stack.push(op2+op1);
                       break;
                   case '-':
                       stack.push(op2-op1);
                       break;
                   case '*':
                       stack.push(op2*op1);
                       break;
                   case '/':
                       stack.push(op2/op1);
                       break;
               }
           }
           
       }
        return stack.pop();
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String exp=s.next();
        System.out.println(Infix(exp));
    }
}
