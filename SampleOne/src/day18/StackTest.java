package day18;

import java.util.ArrayList;

public class StackTest{
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("������ ����ֽ��ϴ�.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		if(stack.isFull()){
			System.out.println("������ ���� á���ϴ�.");
		}
		
		System.out.println("�ֻ��� ���� : " + stack.top());
		//System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		//System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("");
		System.out.println("== ���� ����Ʈ ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	int[] data;
	int count = -1;
	MyStack(){ // default
		data = new int[10];
	}
	MyStack(int size){
		if(size >= 0){
			data = new int[size];
		}
		else{
			data = new int[10];
		}
	}
	public void push(int i) {
		if(isFull()){
			System.out.println("d");
			//arraycopy ����ؼ� resizing�ϱ�
		}
		
		data[count + 1] = i;
		count++;
	}
	public boolean isEmpty() {
		return (count == -1)? true : false;
	}
	public boolean isFull() {
		if(count + 1 == data.length)
			return true;
		else
			return false;
	}
	public int top() {
		if(isEmpty()) 
			return count;
		else
			return data[count];
	}
	public int pop() {
		int result;
		if(isEmpty()){
			result = count;
		}
		else{
		result = data[count];	
		count--;
		}
		return result;
	}
}

