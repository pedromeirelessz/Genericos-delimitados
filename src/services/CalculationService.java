package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {

		// Programa��o defensiva, se a lista estiver vazia, lance uma exce��o
		if (list.isEmpty()) {
			throw new IllegalStateException("List can'T be empty");
		}
		T max = list.get(0);

		/*
		 * No la�o for each, o compareTo ir� comparar o item com o max, ap�s a
		 * compara��o, se o item comparado tiver uma diferen�a maior que zero, associe
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
