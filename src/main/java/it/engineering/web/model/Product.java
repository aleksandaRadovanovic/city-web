package it.engineering.web.model;

public class Product {
	
	private int sifraProizvoda;
	private String nazivProizvoda;
	private double jedinicnaCena;
	private String mernaJedinica;
	private String valuta;
	private double poreskaStopa;
	private Manufacturer manufacturer;
	
	public Product() {
		super();
	}

	public Product(int sifraProizvoda, String nazivProizvoda, double jedinicnaCena, String mernaJedinica, String valuta,
			double poreskaStopa, Manufacturer manufacturer) {
		super();
		this.sifraProizvoda = sifraProizvoda;
		this.nazivProizvoda = nazivProizvoda;
		this.jedinicnaCena = jedinicnaCena;
		this.mernaJedinica = mernaJedinica;
		this.valuta = valuta;
		this.poreskaStopa = poreskaStopa;
		this.manufacturer = manufacturer;
	}

	public int getSifraProizvoda() {
		return sifraProizvoda;
	}

	public void setSifraProizvoda(int sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}

	public String getNazivProizvoda() {
		return nazivProizvoda;
	}

	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}

	public double getJedinicnaCena() {
		return jedinicnaCena;
	}

	public void setJedinicnaCena(double jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public double getPoreskaStopa() {
		return poreskaStopa;
	}

	public void setPoreskaStopa(double poreskaStopa) {
		this.poreskaStopa = poreskaStopa;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}
