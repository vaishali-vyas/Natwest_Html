package classes;

public class IntegerClass<i> {
	 i obj;

	public void Generic(i object) {
		this.obj = object;
	}

	public void print() {
		System.out.println(obj);
	}

	public void getType() {
		System.out.println(obj.getClass().getName());
	}
}