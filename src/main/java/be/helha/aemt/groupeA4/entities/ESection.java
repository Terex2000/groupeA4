package be.helha.aemt.groupeA4.entities;

public enum ESection {


	IG("Informatique de gestion"),
	CPT("Comptabilité"),
	AD("Assistant de direction");

	private String text;

	private ESection(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
