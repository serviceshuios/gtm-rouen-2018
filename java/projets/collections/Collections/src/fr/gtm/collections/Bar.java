package fr.gtm.collections;

public class Bar<T> {
	private T data;

	public Bar(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Foo [data=" + data + "]";
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
