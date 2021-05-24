package lab5_Exception_Handling;

class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String s) {
		super(s);
	}
}
