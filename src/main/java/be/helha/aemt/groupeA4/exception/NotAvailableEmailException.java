package be.helha.aemt.groupeA4.exception;

public class NotAvailableEmailException extends EmailException{

	public NotAvailableEmailException() {
		super("Cet email n'est pas disponible, il est déjà utilisé")	 ;
	}

	public NotAvailableEmailException(String message) {
		super(message) ;
	}

}
