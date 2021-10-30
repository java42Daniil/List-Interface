package telran.util;

import java.util.function.Predicate;

public class PredicateContains<T> implements Predicate<T> {
T pattern;

	public PredicateContains(T pattern) {
	this.pattern = pattern;
}

	@Override
	public boolean test(T t) {
		
		return t.equals(pattern);
	}

}