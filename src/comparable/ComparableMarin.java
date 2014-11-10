package comparable;

public class ComparableMarin implements Comparable<Marin>{
	private String nom, prenom;
	
	public ComparableMarin(String nm, String pren){
		nom = nm;
		prenom = pren;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComparableMarin other = (ComparableMarin) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuffer sb =  new StringBuffer() ;
	      sb.append(nom).append(" ").append(prenom) ;
	       return sb.toString() ;
	}
	
	public int compareTo(Marin m) {
	      
	       if (getNom().equals(m.getNom())) {
	          return getPrenom().compareTo(m.getPrenom()) ;
	      }  else {
	          return getNom().compareTo(m.getNom()) ;
	      }
	   }
	
	

}
