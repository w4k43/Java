package singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();

	// NoArgusConstructor
	private Singleton() {
		System.out.println("インスタンスを生成しました！");
	}

	public static Singleton getInstance() {
		return singleton;
	}

}
