package abstractFactory.factory;

import java.util.ArrayList;

/**
 * 複数のLink/Trayを集めてひとまとまりに表すための部品クラス
 */
public abstract class Tray extends Item {

	protected ArrayList tray = new ArrayList();

	public Tray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		tray.add(item);
	}

}
