package be.helha.aemt.groupeA4.entities;

public enum ERole {

	S("Secrétaire"),
	PROF("Enseignant"),
	ADMIN("Administrateur"),
	ANC("Ancien");

	private String text;

	private ERole(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
