package Exam2Review;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;  
class check 
{
	public static void main (String[] args) 
	{
	       Stack<Integer> s = new Stack<Integer>();
	       Stack<Integer> t = new Stack<Integer>();

           int a=1,b=2,c=3,d=4;
           s.push(a);               // s = 1
           s.push(b);               // s=1, 2
           s.push(c);               // s=1, 2, 3
           t.push(d);               // t = 4
           t.push(s.pop());         // t = 4, 3 and s = 1,2
           t.push(s.peek());        // t = 4, 3, 2
           s.push(t.pop());         // s=1,2,2 and t = 4, 3
           t.pop();                 // s = 1, 2, 2 and t=4
           while(!s.empty())
           {
                      System.out.print(s.peek()+" ");
                      s.pop();
           }
           System.out.print("\n");
           while(!t.empty())
           {
                      System.out.print(t.peek()+" ");
                      t.pop();
           }
	}

}