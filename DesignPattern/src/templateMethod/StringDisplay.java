package templateMethod;

public class StringDisplay extends AbstractDisplay {

	private final String str;
	private final int width;

	public StringDisplay(String str) {
		this.str = str;
		this.width = str.getBytes().length;
	}

	@Override
	public void open() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();

	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("|" + str + "|");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();
	}

	private void printLine() {
		System.out.println("+");
		for (int i = 0; i < width; i++) {
			System.out.println("-");
		}
		System.out.println("+");
	}

}
