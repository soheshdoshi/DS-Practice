/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author sohesh
 */
import java.util.Stack;
public class Infix_to_Post {
    
   static int Prec(char ch )
   {
       switch(ch)
       {
           case '+':
           case '-':
               return 1;
           case '*':
           case '/':
               return 2;
           case '^':
               return 3;
       }
       return -1;
   }
  static String infixToPost(String exp)
   {
       String result=new String("");
       Stack<Character> stack=new Stack<>();
       for(int i=0;i<exp.length();i++)
       {
           char c=exp.charAt(i);
           if(Character.isAlphabetic(c))
           {
               result=result+c;
           }
           else if (c == '(')
               stack.push(c);
           else if(c == ')')
           {
               while(!stack.isEmpty()&&stack.peek()!='(')
               {
                   result=result+stack.pop();
               }
               if(!stack.isEmpty()&&stack.peek()!='(')
               {
                   return "invalid Expression";
               }
               else
                   stack.pop();
           }
           else
           {
               while(!stack.isEmpty()&&Prec(c)<=Prec(stack.peek()))
                   result=result+stack.pop();
               stack.push(c);
           }
           
           
           
       }
       while(!stack.isEmpty())
               result=result+stack.pop();
       return  result;
   }
    public static void main(String[] args) {
        String exp="a+b*(c^d-e)^(f+g*h)-i+k";
        System.out.println(infixToPost(exp));
    }
}

