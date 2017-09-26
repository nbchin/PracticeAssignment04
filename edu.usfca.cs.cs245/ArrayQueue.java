import java.util.Arrays;

public class ArrayQueue implements Queue {
		
		private int head = 0, tail = 0;
		private Object[] arr = new Object[1];

		@Override
		public Object dequeue() {
			// TODO Auto-generated method stub
			if(empty()){
				return null;
			}
			Object item = arr[head];
			arr[head] = null;
			head++;
			if(head >= arr.length){
				head = 0;
			}
			return item;
		}

		@Override
		public void enqueue(Object item) {
			// TODO Auto-generated method stub
			if(willBeFull()){
				growQueue();
			}
			arr[tail] = item;
			tail++;
			if(tail >= arr.length){
				tail = 0;
			}

		}

		@Override
		public boolean empty() {
			// TODO Auto-generated method stub
			return (head == tail);
		}
		
		protected boolean willBeFull(){
			return ((tail + 1) % arr.length == head) ? true: false;
			
		}
		

		protected void growQueue(){	

			int tempTail;
			if(arr.length == 1){
				tempTail = 0;
			} else {
				tempTail = arr.length - 1;
			}

			Object[] newArr = new Object[arr.length * 2];
			System.arraycopy(arr, head, newArr, 0, arr.length - head);
			arr = newArr;	
			head = 0;
			tail = tempTail;
		
		}
		
		public int getHead() {
			return head;
		}

		public void setHead(int head) {
			this.head = head;
		}

		public int getTail() {
			return tail;
		}

		public void setTail(int tail) {
			this.tail = tail;
		}

		public void printQueue(){
			for(int i = 0; i < tail; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}

}
