package cn.tedu.cloudnote.service;

public class NoteBookNotFoundException 
			 extends RuntimeException{
	private static final long serialVersionUID = -5991491771124061955L;

	public NoteBookNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoteBookNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoteBookNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoteBookNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoteBookNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
