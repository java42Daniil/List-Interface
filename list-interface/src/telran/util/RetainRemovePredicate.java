package telran.util;

import java.util.function.Predicate;

public class RetainRemovePredicate<T> implements Predicate<T> {

	private List<T> others;
	private boolean retainRemove;

	public RetainRemovePredicate(List<T> others, boolean retainRemove) {
		this.others = others;
		this.retainRemove = retainRemove;
	}

	@Override
	public boolean test(T t) {
		if(retainRemove) {
			return !others.contains(t);
		}
		return others.contains(t);
	}
}