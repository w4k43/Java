package builder.filebuilder;

public class TextBuilder extends Builder {
	private StringBuilder sb = new StringBuilder();

	// Director内で呼び出される
	// 利用側Mainクラスからは呼ばれる想定がないのでpackage private
	@Override
	void makeTitle(String title) {
		sb.append("==========\n");
		sb.append("[" + title + "]\n");
		sb.append("\n");
	}

	@Override
	void makeString(String str) {
		sb.append('■' + str + "\n");
		sb.append("\n");

	}

	@Override
	void makeItems(String[] items) {
		for (String s : items) {
			sb.append("・" + s + "\n");
		}
		sb.append("\n");
	}

	@Override
	void close() {
		sb.append("==========\n");
	}

	// 利用側Mainからはこのメソッドのみ呼ぶ。
	public String getResult() {
		return sb.toString();

	}

}
