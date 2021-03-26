package it.engineering.web.model;

public class City {
	
	private String naziv;
	private int postBroj;
	
	public City() {
		super();
	}

	public City(String naziv, int postBroj) {
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

	public int getPostBroj() {
		return postBroj;
	}

	public void setPostBroj(int postBroj) {
		this.postBroj = postBroj;
	}

}
