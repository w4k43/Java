package builder;

class TextBuilder extends Builder {
	private StringBuilder sb = new StringBuilder();

	@Override
	public void makeTitle(String title) {
		sb.append("==========\n");
		sb.append("[" + title + "]\n");
		sb.append("\n");
	}

	@Override
	public void makeString(String str) {
		sb.append('■' + str + "\n");
		sb.append("\n");

	}

	@Override
	public void makeItems(String[] items) {
		for (String s : items) {
			sb.append("・" + s + "\n");
		}
		sb.append("\n");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		sb.append("==========\n");
	}

	public String getResult() {
		return sb.toString();

	}

}
