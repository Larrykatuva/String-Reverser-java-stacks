
public class Reverser {
	private char[] holder;
	private int maxSize;
	private int top;
	private String test;
	
	/**
	 * Class constructor
	 * @param {String} value
	 */
	public Reverser(String value) {
		this.test = value;
		this.maxSize = value.length();
		this.holder = new char[this.maxSize];
		this.top = -1;
	}
	
	/**
	 * Checking is stack is empty
	 * @return {boolean}
	 */
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	
	/**
	 * Pushing char value into the stack
	 * @param {char} ch
	 */
	public void push(char ch) {
		this.holder[++this.top] = ch;
	}
	
	/**
	 * Popping char value from the stack
	 * @return {char} 
	 */
	public char pop() {
		return this.holder[this.top--];
	}
	
	/**
	 * Checking the topmost value of the stack
	 * @return char
	 */
	public char peek() {
		return this.holder[this.top];
	}
	
	/**
	 * Populating stack by reading values from a string
	 */
	public void populate() {
		for(int j = 0; j < this.maxSize; j++) {
			char ch = this.test.charAt(j);
			this.push(ch);
		}
	}
	
	/**
	 * Reversing the stack values
	 */
	public void reverseAction() {
		this.populate();
		String result = "";
		while(!this.isEmpty()) {
			result = result + this.pop();
		}
		System.out.println(result);
	}
}
