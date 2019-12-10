package main.inject;

import main.inject.Foo.Bar;
import main.inject.Foo.Hoge;

class Main {

	public static void main(String[] args) {
		Context.register("hoge", Hoge.class);
		Context.register("bar", Bar.class);

		Bar bar = (Bar) Context.getBean("bar");
		bar.showMessage();
	}
}
