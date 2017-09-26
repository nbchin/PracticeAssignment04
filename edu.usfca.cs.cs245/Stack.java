
public interface Stack {
	
	public void push(Object item);
	public Object pop(); //throws StackException;
	public Object peek(); //throws StackException;
	public boolean empty();

}
