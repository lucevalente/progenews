package news8; // non ho capito

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Flussi in Java 8

public class Stream {
	/*
	 * Da una lista di item si genera una nuova lista con solo gli items di prezzo
	 * inferiore a 70 euro, e della nuova lista generata voglio solo gli id ordinati
	 * sulla base del prezzo
	 */

	public static List<Long> filtroPreJava8(List<Item> lista) {
		List<Item> park = new ArrayList<Item>();
		for (Item item : lista) {
			if (item.getPrice() < 70) {
				park.add(item);
			}
		}
		Collections.sort(park, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				int val = o1.getPrice() > o2.getPrice() ? 1 : -1;
				return val;
			}
		});
		List<Long> ris = new ArrayList<Long>();
		for (Item item : park) {
			ris.add(item.getId());
		}
		return ris;

	}

	public static List<Long> filtroJava8(List<Item> lista) {
		Comparator<Item> comp_java8PlusPlus = (o1, o2) -> (int) (o1.getPrice() - o2.getPrice());//

		return lista.stream().filter(it -> it.getPrice() < 70)// stream di Item
				.sorted(comp_java8PlusPlus)// stream ordinato di Item
				.map(Item::getId).// stream di Long
				collect(Collectors.toList());// trasformo lo Stream di Long in Lista di Long
	}

}