package builder.filebuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
	private String fileName;
	private PrintWriter writer;

	// Director内で呼び出される
	// 利用側Mainクラスからは呼ばれる想定がないのでpackage private
	@Override
	void makeTitle(String title) {
		fileName = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(fileName));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</html></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}

	@Override
	void makeString(String str) {
		writer.println("<p>" + str + "</p>");
	}

	@Override
	void makeItems(String[] items) {
		writer.println("<ul>");
		for (String item : items) {
			writer.println("<li>" + item + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	void close() {
		writer.println("</body></html>");
		writer.close();
	}

	// 利用側Mainからはこのメソッドのみ呼ぶ。
	public String getResult() {
		return fileName;
	}

}
