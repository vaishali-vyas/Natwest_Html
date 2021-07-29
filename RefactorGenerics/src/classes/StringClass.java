package classes;

public class StringClass<s> {
	 s obj;

	 public void Generic(s object) {
			this.obj = object;
		}

	public void print() {
		System.out.println(obj);
	}
	
	public void getType() {
		System.out.println(obj.getClass().getName());
	}
}