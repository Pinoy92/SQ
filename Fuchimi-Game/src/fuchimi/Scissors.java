package fuchimi;

public class Scissors extends Hand {

	@Override
	public Boolean beats(Hand hand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Boolean looseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Boolean looseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Boolean looseAgainst(Scissors scissors) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Scissors";
	}

}
