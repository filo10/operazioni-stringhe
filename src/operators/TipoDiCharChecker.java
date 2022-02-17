package operators;

public class TipoDiCharChecker {

	public boolean isSoloLettere(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!Character.isLetter(c)) {
				return false;
			}
		}

		return true;
	}

	public boolean isSoloNumeri(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		return true;
	}

	public boolean isSoloNumerieLettere(String str) {
		boolean isSoloLettere = isSoloLettere(str);
		boolean isSoloNumeri = isSoloNumeri(str);
		return isSoloLettere && isSoloNumeri;
	}

	public int contaLettere(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetter(c)) {
				count++;
			}
		}

		return count;
	}

	public int contaNumeri(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				count++;
			}
		}

		return count;
	}

	public int contaNumeriELettere(String str) {
		int num_numeri = contaNumeri(str);
		int num_lettere = contaLettere(str);
		return num_lettere + num_numeri;
	}
}
