package main.inject;

import java.lang.reflect.Field;
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

	private static <T> createObject(Class<T> type) {
		T object = type.newInstance();
		for(Field field : type.getDeclaredFields()) {
			if(!field.isAnnotationPresent(Inject.class)) {
				continue;
			}
		}
		
	}

}
