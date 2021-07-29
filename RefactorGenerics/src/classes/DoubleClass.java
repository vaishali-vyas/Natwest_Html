package classes;

public class DoubleClass<d> {
	 d obj;

	public void Generic(d object) {
		this.obj = object;
	}

	public void print() {
		System.out.println(obj);
	}

	public void getType() {
		System.out.println(obj.getClass().getName());
	}
}
