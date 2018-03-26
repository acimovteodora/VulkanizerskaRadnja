package guma;

/**
 * Klasa koja predstavlja opis gume u vulkanizerskoj radnji
 * 
 * @author Teodora Acimov
 *
 * @version 0.1
 *
 */

public class AutoGuma {

	/**
	 * Marka i model gume
	 */
	private String markaModel = null;
	
	/**
	 * Precik gume
	 */
	private int precnik = 0;
	
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume
	 */
	private int visina = 0;

	
	/**
	 * Vraca vrednost marke i modela gume
	 * @return markaModel gume kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	
	/**
	 * Postavlja novu vrednost za marku i model gume
	 * 
	 * @param markaModel nova vrednost za markaModel
	 * 
	 * @throws java.lang.RuntimeException ako je unet:
	 * 
	 * <ul style="list-style-type:circle">
	 * 
	 * <li>null String</li>
	 * 
	 * <li>prazan String</li>
	 * 
	 * </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	
	/**
	 * Vraca vrednost atributa precnik gume
	 * @return precnik gume kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost atributa precnik gume
	 * 
	 * @param precnik nova vrednost za precnik
	 * 
	 * @throws java.lang.RuntimeException ako je unet precnik gume:
	 * 
	 * <ul style="list-style-type:circle">
	 * 
	 * <li>manji od 13</li>
	 * 
	 * <li>veci od 22</li>
	 * 
	 * </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost atributa sirina gume
	 * @return sirina gume kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja novu vrednost atributa sirina gume.
	 * 
	 * @param sirina nova vrednost sirine
	 * 
	 * @throws java.lang.RuntimeException ako je uneta sirina gume:
	 * 
	 * <ul style="list-style-type:circle">
	 * 
	 * <li>manja od 135</li>
	 * 
	 * <li>veca od 355</li>
	 * 
	 * </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost atributa visine gume
	 * @return visina gume kao int
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja novu vrednost visine gume
	 * 
	 * @param visina nova vrednost visine
	 * 
	 * @throws java.lang.RuntimeException ako je uneta visina:
	 * 
	 * <ul style="list-style-type:circle">
	 * 
	 * <li>manja od 25</li>
	 * 
	 * <li>veca od 95</li>
	 * 
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca String sa svim podacima o gumi
	 * @return String sa svim podacima o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava da li su dve gume iste
	 * Poredi po svim atributima gume
	 * @return true ako su dve gume iste, a false ako nisu
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
