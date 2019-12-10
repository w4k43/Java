package main.java;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Context {

	static Map<String, Class> types = new HashMap<>();

	static Map<String, Object> beans = new HashMap<>();

	static void register(String name, Class type) {
		types.put(name, type);
	}

	static Object getBean(String name) {
		// computeIfAbsent?
		return beans.computeIfAbsent(name, key -> {
			Class type = types.get(name);
			Objects.requireNonNull(type, name + " not found.");
			try {
				return type.getDeclaredConstructor().newInstance();
			}
			catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				throw new RuntimeException(name + " cannot get instance.", e);
			}
		});
	}

}
