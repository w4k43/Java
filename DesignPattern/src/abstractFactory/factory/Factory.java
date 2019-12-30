package abstractFactory.factory;

public abstract class Factory {

	public static Factory getFactory(String className) {
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(className).newInstance();
		}
		catch (ClassNotFoundException e) {
			System.err.println("クラス" + className + "が見つかりません");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}

	public abstract Link createLink(String caption, String url);

	public abstract Tray createTray(String caption);

	public abstract Page createPage(String title, String author);

	public Page createYahooPage() {
		Page yahooPage = createPage("Yahoo!", "Yahoo!");
		Link l = createLink("Yahoo", "http://www.yahoo.com/");
		yahooPage.add(l);
		return yahooPage;
	}

}
