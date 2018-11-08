package fr.gtm.collections;

public class Foo {
	private int data;

	public Foo(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Foo [data=" + data + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foo other = (Foo) obj;
		if (data != other.data)
			return false;
		return true;
	}
	
	
}
