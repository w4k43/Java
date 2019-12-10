package main.inject;

class Foo {

	static class Hoge {
		String getMessage() {
			return "Hello";
		}
	}

	static class Bar {
		void showMessage() {
			Hoge hoge = new Hoge();
			System.out.println(hoge.getMessage());
		}
	}

}
