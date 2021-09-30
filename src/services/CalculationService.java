package services;

import java.util.List;

public class CalculationService {

	public static Integer max(List<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can'Integer be empty");
		}
		Integer max = list.get(0);

		/*
		 * No laço for each, o compareTo irá comparar o item com o max, após a
		 * comparação, se o item comparado tiver uma diferença maior que zero, associe
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
