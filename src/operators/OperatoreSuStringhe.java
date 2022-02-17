package operators;

public class OperatoreSuStringhe {

	public String invertiStringa(String str) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			builder.append(str.charAt(str.length() - i - 1));
		}
		return builder.toString();
	}

	public String unisciStringhe(String str1, String str2) {
		StringBuilder builder = new StringBuilder();
		builder.append(str1);
		builder.append(str2);

		return builder.toString();
	}

	public String rimuoviUltimoCarattere(String str) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length() - 1; i++) {
			builder.append(str.charAt(i));
		}
		return builder.toString();
	}

	public String rimuoviPrimoCarattere(String str) {
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < str.length(); i++) {
			builder.append(str.charAt(i));
		}
		return builder.toString();
	}

	public boolean isPalindroma(String str) {
		int len = str.length();

		for (int i = 0; i < len/2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
