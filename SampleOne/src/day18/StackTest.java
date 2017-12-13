package day18;

import java.util.ArrayList;

public class StackTest{
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		//System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		//System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
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
			//arraycopy 사용해서 resizing하기
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

