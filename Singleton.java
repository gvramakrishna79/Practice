package general;


public class Singleton {

	public static Singleton obj;

	public static Singleton getInstance() {
		if (obj == null)
			obj = new Singleton();
		return obj;

	}
}
