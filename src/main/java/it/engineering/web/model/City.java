package it.engineering.web.model;

public class City {
	
	private String naziv;
	private String postBroj;
	
	public City() {
		super();
	}

	public City(String naziv, String postBroj) {
		super();
		this.naziv = naziv;
		this.postBroj = postBroj;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getPostBroj() {
		return postBroj;
	}

	public void setPostBroj(String postBroj) {
		this.postBroj = postBroj;
	}

}
