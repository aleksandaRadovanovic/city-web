package it.engineering.web.model;

public class Manufacturer {
	
	private int pib;
	private String maticniBroj;
	private String nazivProizvodjaca;
	private String adresa;
	private City city;
	
	public Manufacturer() {
		super();
	}
	
	public Manufacturer(int pib, String maticniBroj, String nazivProizvodjaca, String adresa, City city) {
		super();
		this.pib = pib;
		this.maticniBroj = maticniBroj;
		this.nazivProizvodjaca = nazivProizvodjaca;
		this.adresa = adresa;
		this.city = city;
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
