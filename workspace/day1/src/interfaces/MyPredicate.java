package interfaces;

@FunctionalInterface
public interface MyPredicate {

	public boolean test(String data);

	default boolean test2(int x) {
		return false;
	};
}
