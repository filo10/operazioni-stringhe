package operators;

public class Incorniciatore {

	public String circondaConAsterischi(String str, int num) {
		String asterischi;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append("*");
		}
		asterischi = sb.toString();
		return asterischi + " " + str + " " + asterischi;
	}

	public String circondaConStringa(String str, String cornice, int num) {
		String asterischi;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append(cornice);
		}
		asterischi = sb.toString();
		return asterischi + " " + str + " " + asterischi;
	}
}
