package abstractFactory.factory;

/**
 * HTMLのハイパーリンクを抽象的に表現した部品クラス
 */
public abstract class Link extends Item {
	protected String url;

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}

}
