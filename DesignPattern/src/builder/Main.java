package builder;

import builder.filebuilder.Director;
import builder.filebuilder.HTMLBuilder;
import builder.filebuilder.TextBuilder;

class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if (args[0].equals("plain")) {
			TextBuilder builder = new TextBuilder();
			Director director = new Director(builder);
			director.construct();
			String result = builder.getResult();
			System.out.println(result);
		}
		if (args[0].equals("html")) {
			HTMLBuilder builder = new HTMLBuilder();
			Director director = new Director(builder);
			director.construct();
			String fileName = builder.getResult();
			System.out.println(fileName + "が作成されました");
		}
		else {
			usage();
			System.exit(0);
		}
	}

	public static void usage() {
		System.out.println("Usage: java Main plain    プレーンテキストで文書作成");
		System.out.println("Usage: java Main html    htmlファイルで文書作成");
	}
}
