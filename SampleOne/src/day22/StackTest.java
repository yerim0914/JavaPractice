package day22;
// 2017-11-29 과제
import java.util.ArrayList;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}
		Thread P1 = new Thread(stack.new Push(1));
		Thread P2 = new Thread(stack.new Push(2));
		Thread P3 = new Thread(stack.new Push(3));
		Thread P4 = new Thread(stack.new Push(4));
		Thread P5 = new Thread(stack.new Push(5));
		Thread Po1 = new Thread(stack.new Pop());
		Thread Po2 = new Thread(stack.new Pop());
		Thread Po3 = new Thread(stack.new Pop());
		Thread Po4 = new Thread(stack.new Pop());
		Thread Po5 = new Thread(stack.new Pop());
		P1.start();
		P2.start();
		P3.start();
		P4.start();
		P5.start();
		Po1.start();
		Po2.start();
		Po3.start();
		Po4.start();
		Po5.start();
			
	}
}

class MyStack {
	int[] data;
	int count = -1;

	MyStack() { // default
		data = new int[10];
	}

	MyStack(int size) {
		if (size >= 0) {
			data = new int[size];
		} else {
			data = new int[10];
		}
	}

	class Push implements Runnable {
		int D;
		Push() {
		}
		Push(int d) {
			D = d;
		}
		@Override
		public void run() {
			data[count + 1] = D;
			count++;
		}
	}

	public boolean isEmpty() {
		return (count == -1) ? true : false;
	}

	public boolean isFull() {
		if (count + 1 == data.length)
			return true;
		else
			return false;
	}

	public int top() {
		if (isEmpty())
			return count;
		else
			return data[count];
	}

	class Pop implements Runnable {
		int result;
		Pop() {}
		@Override
		public synchronized void run() {
			if (isEmpty()) {
				result = count;
			} else {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				result = data[count];
				count--;
			}
			System.out.println(result);
		}
	}
	
}

