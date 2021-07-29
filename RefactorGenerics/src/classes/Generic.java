package classes;

public class Generic<T> {

	T obj;

	public Generic(T obj) {
		this.obj = obj;
	}

	public void print() {
		System.out.println(obj);

	}

	public void getType() {
		// TODO Auto-generated method stub
		System.out.println(obj.getClass().getName());
	}
}
