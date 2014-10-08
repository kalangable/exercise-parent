package br.org.catolicasc.adilson.krasovski.exercicio4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.NonNull;
import lombok.extern.java.Log;

@Data
@Log
public class CalculaPrimos {
	@NonNull
	private int maxValue;

	public List<Integer> getValidNumbers() {
		List<Integer> validNumbers = new LinkedList<Integer>();
		for (int i = 1; i <= this.maxValue; i++) {
			if (isValidNumber(i)) {
				validNumbers.add(i);
			}
		}
		return validNumbers;

	}

	private boolean isValidNumber(int number) {
		int i = (number - 1);
		for (; i > 1; i--) {
			if (number % i == 0) {
				break;
			}
		}
		return (i == 1);
	}
}
