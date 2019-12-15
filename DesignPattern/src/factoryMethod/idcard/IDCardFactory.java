package factoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;

import ch4_FactoryMethod.framework.Factory;
import ch4_FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {

	private List owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		// TODO 自動生成されたメソッド・スタブ

		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO 自動生成されたメソッド・スタブ
		owners.add(((IDCard) product).getOwner());
	}

	public List getOwners() {
		return owners;
	}

}
