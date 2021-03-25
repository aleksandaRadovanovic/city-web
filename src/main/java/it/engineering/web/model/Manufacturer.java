package it.engineering.web.model;

public class Manufacturer {
	
	private int pib;
	private String maticniBroj;
	private String nazivProizvodjaca;
	private String adresa;
	private String gradNaziv;
	
	public Manufacturer() {
		super();
	}
	
	public Manufacturer(int pib, String maticniBroj, String nazivProizvodjaca, String adresa, String gradNaziv) {
		super();
		this.pib = pib;
		this.maticniBroj = maticniBroj;
		this.nazivProizvodjaca = nazivProizvodjaca;
		this.adresa = adresa;
		this.gradNaziv = gradNaziv;
	}

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}

	public String getMaticniBroj() {
		return maticniBroj;
	}

	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
	}

	public String getNazivProizvodjaca() {
		return nazivProizvodjaca;
	}

	public void setNazivProizvodjaca(String nazivProizvodjaca) {
		this.nazivProizvodjaca = nazivProizvodjaca;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getGradNaziv() {
		return gradNaziv;
	}

	public void setGradNaziv(String gradNaziv) {
		this.gradNaziv = gradNaziv;
	}

}
