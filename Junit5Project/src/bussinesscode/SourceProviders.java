package bussinesscode;

import java.util.stream.Stream;

class SourceProviders {
	
	public static Stream<String> friutMethodSource() {
		return Stream.of("apple", "banana");
	}
}