package main.java;

import main.java.Foo.Bar;
import main.java.Foo.Hoge;

class Main {

	public static void main(String[] args) {
		Context.register("hoge", Hoge.class);
		Context.register("bar", Bar.class);

		Bar bar = (Bar) Context.getBean("bar");
		bar.showMessage();
	}
}
