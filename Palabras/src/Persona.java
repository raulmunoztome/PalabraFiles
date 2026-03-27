import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {
	private String nom;
	private List<Partida> registroPartidas;
	 private int code;
	 private static int codeCOM = 0;
	 
	 public Persona(String nom, int code) throws Exception {
		 if(nom.isBlank()) throw new Exception("Error en el nombre");
		 registroPartidas = new ArrayList();
		this.nom = nom;
		this.code = codeCOM;
		++codeCOM;
	 }

	 public String getNom() {
		 return nom;
	 }

	 public void setNom(String nom) {
		if(!nom.isBlank()) this.nom = nom;
	 }
	 
	 
	 public int getCode() {
		return code;
	}



	 @Override
		public int hashCode() {

			return Objects.hash(nom,code);

		}

		@Override
		public boolean equals(Object obj) {

			if (this == obj)
				return true;

			if (obj == null)
				return false;

			if (getClass() != obj.getClass())
				return false;

			Persona other = (Persona) obj;

			return Objects.equals(nom, other.nom) && Objects.equals(code, other.code);
		}

}	
