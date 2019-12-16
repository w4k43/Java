package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class HTMLBuilder extends Builder {
	private String fileName;
	private PrintWriter writer;

	@Override
	public void makeTitle(String title) {
		// FIXME 生焼けになるのでは？ 呼び出しを制限するからよい？
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
	public void makeString(String str) {
		writer.println("<p>" + str + "</p>");
	}

	@Override
	public void makeItems(String[] items) {
		writer.println("<ul>");
		for (String item : items) {
			writer.println("<li>" + item + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	public void close() {
		writer.println("</body></html>");
		writer.close();
	}

	public String getResult() {
		return fileName;
	}

}
