package queue;

class node {

	Object value;
	node link;

	protected node(Object value, node link) {
		this.value = value;
		this.link = link;
	}

	protected node(Object value) {
		this.value = value;
	}

	protected node() {
	}
}
