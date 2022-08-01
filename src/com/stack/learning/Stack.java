package com.stack.learning;

/***
 * 
 * @author nikhils4
 * 
 *         STACK :- A stack is a linear data structure that follows the
 *         principle of Last In First Out (LIFO). This means the last element
 *         inserted inside the stack is removed first
 * 
 *         Here, you can:
 * 
 *         Put a new plate on top Remove the top plate And, if you want the
 *         plate at the bottom, you must first remove all the plates on top.
 *         This is exactly how the stack data structure works.
 * 
 *         LIFO Principle of Stack :- 
 *         In programming terms, putting an item on
 *         top of the stack is called push and removing an item is called pop.
 * 
 *         We can implement a stack in any programming language like C, C++,
 *         Java, Python or C#, but the specification is pretty much the same.
 * 
 *         Basic Operations of Stack:- 
 *         There are some basic operations that
 *         allow us to perform different actions on a stack.
 * 
 *         1.Push: Add an element to the top of a stack 
 *         2.Pop: Remove an element from the top of a stack 
 *         3.IsEmpty: Check if the stack is empty 
 *         4.IsFull: Check if the stack is full 
 *         5.Peek: Get the value of the top element without removing it 
 *         6.change: changing element in particular index
 *         7.count: return number of elements in stack.
 * 
 *         Working of Stack Data Structure :- The operations work as follows:
 * 
 *         -->A pointer called TOP is used to keep track of the top element in
 *         the stack. 
 *         -->When initializing the stack, we set its value to -1 so
 *         that we can check if the stack is empty by comparing TOP == -1. 
 *         -->On
 *         pushing an element, we increase the value of TOP and place the new
 *         element in the position pointed to by TOP. 
 *         -->On popping an element,
 *         we return the element pointed to by TOP and reduce its value.
 *         -->Before pushing, we check if the stack is already full. 
 *         -->Before
 *         popping, we check if the stack is already empty.
 * 
 * 
 *         Stack Time Complexity :- 
 *         ---> For the array-based implementation of a
 *         stack, the push and pop operations take constant time, i.e. O(1).
 * 
 *         Applications of Stack Data Structure :- 
 *         Although stack is a simple data
 *         structure to implement, it is very powerful. The most common uses of
 *         a stack are:
 * 
 *         1.->To reverse a word - Put all the letters in a stack and pop them out.
 *         Because of the LIFO order of stack, you will get the letters in
 *         reverse order. 
 *         2.->In compilers - Compilers use the stack to calculate
 *         the value of expressions like 2 + 4 / 5 * (7 - 9) by converting the
 *         expression to prefix or postfix form. 
 *         3.->In browsers - The back button
 *         in a browser saves all the URLs you have visited previously in a
 *         stack. Each time you visit a new page, it is added on top of the
 *         stack. When you press the back button, the current URL is removed
 *         from the stack, and the previous URL is accessed.
 *
 * 
 */

public class Stack {
	private int[] array;
	private static int top;
	private static int capacity;

	public Stack(int size) {
		array = new int[size];
		top = -1;
		capacity = size;
	}

	// checking whether stack is full or not.
	public static boolean isFull() {
		return top == capacity - 1;
	}

	// adding new element into the stack from last.
	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is full.");
		} else {
			top = top + 1;
			array[top] = element;
			System.out.println(element + " is inserted into the stack and top is : " + top);
		}
	}

	// checking whether stack is empty or not
	public static boolean isEmpty() {
		return top == -1;
	}

	// removing last element from the stack.
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
		} else {
			top--;
			System.out.println("\nItem popped");
		}
	}

	// Printing stack
	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.print(array[i] + " - ");
		}
	}

	// return top element in stack from last bcoz stack follows LIFO(Last In First
	// Out) Order
	public int peek() {
		if (isEmpty()) {
			System.out.print("Stack is empty");
			return 0;
		}
		return array[top];
	}

	// return total elements in stack
	public int count() {
		return top + 1;
	}

	// changing element in particular index
	public void change(int index, int newElement) {
		System.out.println("\n" + array[index] + " is changed to " + newElement);
		array[index] = newElement;
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.printStack();
		System.out.println("count : " + stack.count());

		stack.pop();
		System.out.println();
		stack.printStack();
		System.out.println("count : " + stack.count());

		stack.change(1, 20);
		stack.printStack();
	}
}
