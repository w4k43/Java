package factoryMethod.idcard;

import ch4_FactoryMethod.framework.Product;

public class IDCard extends Product {

	private String owner;

	IDCard(String owner) {
		System.out.println(owner + "のカードを作成します");

		this.owner = owner;
	}

	@Override
	public void use() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(owner + "のカードを使用します");
	}

	public String getOwner() {
		return owner;
	}

}
