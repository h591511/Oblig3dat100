package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private int id;
	private String bruker;
	private String dato;
	private int likes;
	private String tekst;
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id,bruker,dato,0,tekst);
		this.url = url; 
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id,bruker,dato,likes,tekst);
		this.url = url;
	}
	
	public String getUrl() {
		
		return url;

	}

	public void setUrl(String url) {
		
		this.url = url; 
	}

	@Override
	public String toString() {
		
		String str =  "BILDE\n" + this.getId() + "\n" + this.getBruker() + "\n" + this.getDato() + "\n" + this.getLikes() + "\n" + "et bilde\n" + this.getUrl() + "\n"; 
		
		return str;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
