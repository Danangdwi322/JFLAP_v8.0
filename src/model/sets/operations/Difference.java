package model.sets.operations;

import java.util.Set;
import java.util.TreeSet;

import model.sets.FiniteSet;
import model.sets.InfiniteSet;
import model.sets.elements.Element;

public class Difference extends SetOperation {


	@Override
	protected FiniteSet getFiniteAnswer() {
		Set<Element> elements = new TreeSet<Element>();
		for (Element e : myOperands.get(0).getSet()) {
			if (!myOperands.get(1).contains(e)) {
				elements.add(e);
			}
		}
		return new FiniteSet(getDescription(), elements);
	}

	@Override
	protected InfiniteSet getInfiniteAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfOperands() {
		return 2;
	}

	@Override
	public String getName() {
		return "Difference";
	}

	@Override
	public String getDescription() {
		return "The difference of " + myOperands.get(0).getName() +
				" and " + myOperands.get(1).getName();
	}


}
