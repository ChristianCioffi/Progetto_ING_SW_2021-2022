package art_Project;
import java.util.Date;

public class Utente {
	
		private String nome;
		private String cognome;
		private String codice_fiscale;
		private Date data_nascita;
		private boolean diritto_voto;
		private String comune_residenza;
		
		public Utente (String nom, String cog, String cf, Date nascita, boolean drt_vt, String com_res) {		//Costruttore Utente
			this.nome=nom;
			this.cognome=cog;
			this.codice_fiscale=cf;
			//this.data_nascita=nascita;
			this.diritto_voto=drt_vt;
			this.comune_residenza=com_res;
		}
	
	public String get_nome() {
		return this.nome;
	}
	
	public String get_cognome() {
		return this.cognome;
	}
	
	public String get_cf() {
		return this.codice_fiscale;
	}
	
	public String get_comune_residenza() {
		return this.comune_residenza;
	}
	
	public boolean get_diritto_voto() {
		return this.diritto_voto;
	}
	
	public Date get_nascita() {
		return this.data_nascita;
	}
	
	public void set_nome(String n) {
		this.nome=n;
	}
	
	public void set_cognome(String c) {
		this.cognome=c;
	}
	
	public void set_cf(String cf) {
		this.codice_fiscale=cf;
	}
	
	public void set_comune_residenza(String cr) {
		this.comune_residenza=cr;
	}
	
	public void set_diritto_voto(boolean dv) {
		this.diritto_voto=dv;
	}
	
	public void set_nascita(Date data) {
		this.data_nascita= (Date) data.clone();
	}
}
