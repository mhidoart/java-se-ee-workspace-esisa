package ma.spotmedia.sento.pos.model;


import java.time.LocalDateTime;

public class Ticket {
	
	private static double cp=0;
	private double numero;
	private LocalDateTime date;
	private String type;
	private double prix;

	public Ticket() {
		numero=cp;//aywelli select count
		cp++;
		date=LocalDateTime.now();


	}
	public Ticket(LocalDateTime date,String type,double prix) {
		numero=cp;//aywelli select count
		cp++;
		this.date=date;
		this.type=type;
		this.prix=prix;
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", date=" + date + ", type=" + type + ", prix=" + prix + "]";
	}
}
