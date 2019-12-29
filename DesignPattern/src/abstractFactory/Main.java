package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Illegal State");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]); // DI的な！？

		Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.com/");

		Tray traynews = factory.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);

		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo! Japan", "http://www.yahoo.co.jp/");

		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);

		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");

		Tray traysearch = factory.createTray("サーチエンジン");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);

		Page page = factory.createPage("LinkPage", "wakayama_k");
		page.add(traynews);
		page.add(traysearch);

		page.output();
	}
}
