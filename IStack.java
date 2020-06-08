package stack;
interface IStack
{
	void Clear();
    boolean Contains(String value);
    String Peek() throws StackEmptyException;
    void Push(String value);
    String Pop() throws StackEmptyException;
    boolean IsEmpty();
}

class StackEmptyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackEmptyException(String message) {
        super(message);
    }
     
    @Override
    public String getMessage() {
        return "StackEmptyException: " + super.getMessage();
    } 
}