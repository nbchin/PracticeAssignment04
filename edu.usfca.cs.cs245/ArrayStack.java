
public class ArrayStack implements Stack {
	private int top = 0;
	private Object[] arr = new Object[5];

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		if(top == arr.length){
			growStack();
		}
		arr[top++] = item;
	}

	@Override
	public Object pop() { //throws StackException 
		// TODO Auto-generated method stub
		if(empty() == true){
			//throw new StackException("Stack underflow exception, stack is empty.");
			return null;
		}
		return arr[--top];
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	@Override
	public Object peek() {// throws StackException {
		// TODO Auto-generated method stub
		if(!empty()){
			return arr[top - 1];
		}
		//throw new StackException("Stack underflow exception, stack is empty.");
		return null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		if(top == 0){
			return true;
		}
		return false;
	}
	
	public void growStack(){
		Object[] newArr = new Object[arr.length * 2];
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		arr = newArr;
	}
	
	public void printStack(){
		for(int i = 0; i < top; i++){
			if(arr[i] != null)
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int stackLength(){
		return arr.length;
	}

}
