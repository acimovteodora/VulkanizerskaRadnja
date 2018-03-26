package guma.radnja;

/**
 * Klasa koja predstavlja vulkanizersku radnju
 * 
 * @author Teodora Acimov
 *
 * @version 0.1
 *
 */

import java.util.LinkedList;

import guma.AutoGuma;

public class VulkanizerskaRadnja {
	
	/**
	 * Lista guma iz vulkanizerske radnje
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Dodaje novu gumu u vulkanizersku radnju
	 * @param a nova guma koja se dodaje u vulkanizersku radnju
	 * @throws java.lang.RuntimeException ako je guma:
	 * 
	 * <ul style="list-style-type:circle">
	 * 
	 * <li>null String</li>
	 * 
	 * <li>vec sadrzana u vulkanizerskoj radnji</li>
	 * 
	 * </ul>
	 */
	public void dodajGumu(AutoGuma a) {
		
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		
		gume.addFirst(a);
	}

	/**
	 * Pronalazi sve gume trazene marke i modela u vulkanizerskoj radnji
	 * @param markaModel trazena markaModel gume
	 * @return listu odgovarajucih guma
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		
		return novaLista;
	}
}
