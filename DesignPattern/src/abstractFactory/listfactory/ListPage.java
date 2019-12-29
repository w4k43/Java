package abstractFactory.listfactory;

import java.util.Iterator;

import abstractFactory.factory.Item;
import abstractFactory.factory.Page;

public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><title>" + title + "</title></head>\n");
		sb.append("<body>\n");
		sb.append("<h1>" + title + "</h1>\n");
		sb.append("<ul>\n");
		Iterator it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("<hr><address>" + author + "</address>");
		sb.append("</body></html>\n");
		return sb.toString();
	}
}
