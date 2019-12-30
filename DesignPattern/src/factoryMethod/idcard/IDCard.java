package factoryMethod.idcard;

import factoryMethod.framework.Product;

public class IDCard extends Product {

	private String owner;

	// インスタンス化はFactoryを通して行う
	// そのため、コンストラクタをPackage Privateにする
	IDCard(String owner) {
		System.out.println(owner + "のカードを作成します");
		this.owner = owner;
	}

	// 生成されたインスタンスの利用はpublicに行うことができる
	@Override
	public void use() {
		System.out.println(owner + "のカードを使用します");
	}

	public String getOwner() {
		return owner;
	}

}
