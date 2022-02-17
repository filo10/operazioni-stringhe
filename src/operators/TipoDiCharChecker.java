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
}