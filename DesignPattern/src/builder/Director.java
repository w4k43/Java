package builder;

class Director {
	private Builder builder;

	Director(Builder builder) {
		this.builder = builder;
	}

	// 構築？
	void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("朝から昼にかけて");
		builder.makeItems(new String[] {
			"おはようございます",
			"こんにちは"
		});
		builder.makeString("夜に");
		builder.makeItems(new String[] {
			"こんばんは",
			"おやすみなさい",
			"さようなら",
		});
		builder.close();
	}

}
