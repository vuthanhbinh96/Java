package Command2;

public class Client {

	public static void main(String[] args) {
		DocumentInvoker instance = new DocumentInvoker();
		instance.write("this 1st text");
		instance.undo();
		instance.read();
		
		instance.redo();
		instance.read();
		
		instance.write("The 2nd text");
		instance.write("The 3rd text");
		instance.read();
		instance.undo();
		instance.undo();
		instance.undo();
		instance.undo();
		
	}
}
