package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i < 10; i++){
			stack.push("" + i);
		}
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("q");
		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 1; i<= 10;i ++)
		{
			queue.offer(i);
		}
		System.out.println(queue.poll());
		
		
		
		
	}
}
