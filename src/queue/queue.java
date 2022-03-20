package queue;

public class queue {
	private node head;
	private node tail;
	private int size = 0;

	public queue() {
		head = new node();
	}

	public void enqueue(Object value) {
		if (size == 0) {
			head.value = value;
			tail = head;
		} else {
			tail.link = new node(value);
			tail = tail.link;
		}
		size++;
	}

	public Object dequeue() throws Exception {
		if (size != 0) {
			Object out = head.value;
			head = head.link;
			size--;
			return out;
		} else {
			throw new Exception("No more node to enqueue!");
		}
	}

	public Object getHead() {
		return head.value;
	}

	public Object getTail() {
		return tail.value;
	}

	public int getSize() {
		return size;
	}
}
