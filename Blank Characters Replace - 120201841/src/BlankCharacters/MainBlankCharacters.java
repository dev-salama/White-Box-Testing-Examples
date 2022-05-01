package BlankCharacters;

public class MainBlankCharacters {
	public static void main(String[] args) {}
	public String replaceBlankChars(String str) {
		return str.replaceAll("\\s+", " ");
	}
}
