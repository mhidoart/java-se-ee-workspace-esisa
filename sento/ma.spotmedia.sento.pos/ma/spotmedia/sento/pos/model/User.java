package ma.spotmedia.sento.pos.model;

public class User {
	private double id;
	private String nom;
	private String prenom;
	private String Privelge;
	private String targetPhoto;
	
	
	public User() {
		super();
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPrivelge() {
		return Privelge;
	}
	public void setPrivelge(String privelge) {
		Privelge = privelge;
	}
	public String getTargetPhoto() {
		return targetPhoto;
	}
	public void setTargetPhoto(String targetPhoto) {
		this.targetPhoto = targetPhoto;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", Privelge=" + Privelge + "]";
	}
	
}
