package br.com.codenation;

import java.util.HashMap;
import java.util.Map;

public class StatisticUtil {

	public static int average(int[] elements) {
		int soma = 0;
		for (int element : elements) {
			soma += element;
		}
		return soma/elements.length;
	}

	public static int mode(int[] elements) {
		HashMap<Integer, Integer> repeatedNumbers = new HashMap<>();
		int modeNumber = 0;
		for (int i : elements) {
			int count = 1;
			for (int j : elements) {
				if (i == j) {
					repeatedNumbers.put(i, count++);
				}
				
			}
		}
		for (Map.Entry<Integer, Integer> e: repeatedNumbers.entrySet()) {
			Integer number = e.getKey();
			Integer amountNumber = e.getValue();
			if (amountNumber > modeNumber) {
				modeNumber = number;
			}
		}
		return modeNumber;
	}

	public static int median(int[] elements) {
		int resto = elements.length % 2;
		int medianNumber;
		if (resto == 0) {
			medianNumber = elements.length / 2;
			return (elements[medianNumber] + elements[medianNumber -1])/2;
		} else {
			medianNumber = elements.length / 2;
			return elements[medianNumber];
		}
	}
}