package factoryMethod.enums;

public enum Status {
	SUBMITTED(0) {
		@Override
		public void doSomething() {
			// 実際にはここへ処理が書かれる
			System.out.println("申請済に対する処理を行う");
		}
	},
	APPROVED(1) {
		@Override
		public void doSomething() {
			System.out.println("承認済に対する処理を行う");
		}
	},
	REJECTED(2) {
		@Override
		public void doSomething() {
			System.out.println("却下に対する処理を行う");
		}

		@Override
		public void isError() {
			// TODO 自動生成されたメソッド・スタブ
			throw new IllegalArgumentException();
		}
	},
	;

	private int value;

	private Status(int value) {
		this.value = value;
	}

	public abstract void doSomething();

	// 通常のメソッドとして定義して、Overrideされなかったときの振舞を定義しても良い
	public void isError() {
		// 通常時なにもしない
	}
}
