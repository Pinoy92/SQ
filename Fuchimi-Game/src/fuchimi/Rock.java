package fuchimi;

public class Rock extends Hand{

	@Override
	public Boolean beats(Hand hand) {
		// TODO Auto-generated method stub
		return hand.looseAgainst(this);
	}

	@Override
	protected Boolean looseAgainst(Rock rock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Boolean looseAgainst(Paper paper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Boolean looseAgainst(Scissors scissors) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rock";
	}

}
