package testListes;
import java.util.Date;
import java.util.LinkedList;

public class Personne implements Comparable{
	private String nom, prenom;
	private String dateNaissance;
	//private LinkedList<Repertoire> repertoire;
	
	public Personne(){
		
	}
	
	public Personne(String string, String string2, String date) {
		nom = string;
		prenom = string2;
		dateNaissance = date;
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
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
