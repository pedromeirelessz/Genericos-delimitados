package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {

		// Programação defensiva, se a lista estiver vazia, lance uma exceção
		if (list.isEmpty()) {
			throw new IllegalStateException("List can'T be empty");
		}
		T max = list.get(0);

		/*
		 * No laço for each, o compareTo irá comparar o item com o max, após a
		 * comparação, se o item comparado tiver uma diferença maior que zero, associe
		 * esse item a max
		 */
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
