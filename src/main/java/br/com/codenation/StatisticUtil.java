package br.com.codenation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

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

		int modeValue = 0;
		for (Map.Entry<Integer, Integer> e: repeatedNumbers.entrySet()) {
			Integer key = e.getKey();
			Integer value = e.getValue();
			if (value > modeValue ) {
				modeValue = value;
				modeNumber = key;
			}
		}
		return modeNumber;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
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