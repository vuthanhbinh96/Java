package Command2;

import java.util.Stack;

public class Document {
	Stack<String> lines = new Stack<String>();
	
	public void write(String text) {
		lines.push(text);
	}
	
	public void eraseLast() {
		if(!lines.isEmpty()) {
			lines.pop();
		}
	}
	
	public void readDocument() {
		 for (String line : lines) {
	            System.out.println(line);
	        }
	}
	
}
