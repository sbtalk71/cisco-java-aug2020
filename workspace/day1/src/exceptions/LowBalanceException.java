package exceptions;

public class LowBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LowBalanceException() {

	}

	public LowBalanceException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getName() + " : " + getMessage();
	}
}
