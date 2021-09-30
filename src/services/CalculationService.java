package services;

import java.util.List;

public class CalculationService {

	public static Integer max(List<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can'Integer be empty");
		}
		Integer max = list.get(0);

		/*
		 * No la�o for each, o compareTo ir� comparar o item com o max, ap�s a
		 * compara��o, se o item comparado tiver uma diferen�a maior que zero, associe
		 * esse item a max
		 */
		for (Integer item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
