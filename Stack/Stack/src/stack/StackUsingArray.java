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
class Stack
{
    private final int Max=1000;
    int array[]=new int[Max];
    int top;
    boolean isEmpty()
    {
        if(top<0)
        {
            System.out.println("Stack is Empty");
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isFull()
    {
        if(top>Max)
        {
            System.out.println("Stack is Full");
            return true;
        }
        else
            return false;
    }
    void push(int x)
    {
        System.out.println(x+"is push");
        array[++top]=x;
    }
    int pop()
    {
        System.out.println(array[top]+"is pop");
        return array[top--];
    }
    int peek()
    {
        return array[top];
    }
}
public class StackUsingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack s=new Stack();
      for(int i=1;i<10;i++)
      {
          s.push(i);
      }
        System.out.println(s.peek()+"peek element");
      s.pop();
    }
    
}
