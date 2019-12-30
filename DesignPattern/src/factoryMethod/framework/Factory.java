package factoryMethod.framework;

public abstract class Factory {

	// インスタンス生成を行う。
	// template methodパターンの応用とも言える
	public final Product create(String owner) {
		// メソッドでインスタンス生成することで、クラス名を指定する必要がなくなる
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product product);

}
