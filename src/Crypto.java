import java.util.Scanner;

public class Crypto {

	static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	static final int DECALAGE = 4;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Veuillez entrer une chaine de caracteres : ");
		String s = scanner.nextLine();

		// la chaine a coder
		String aCoder = "";
		// la chaine codee
		String chaineCodee = "";

		/*******************************************
		 * Completez le programme a partir d'ici.
		 *******************************************/

		for (int i = 0; i < s.length(); i++) {
			if ( ALPHABET.contains(String.valueOf(s.charAt(i))) ) {
				aCoder += String.valueOf(s.charAt(i));
			} else if ( String.valueOf(s.charAt(i)).equals(" ") ) {
				aCoder += " ";
			} else {
				aCoder += "";
			}
		}
		
		for (int i = 0; i < aCoder.length(); i++) {
			if ( ALPHABET.contains(String.valueOf(aCoder.charAt(i))) ) {
				int index = ALPHABET.indexOf(aCoder.charAt(i));
				if (index + DECALAGE >= ALPHABET.length()) {
					index = index - ALPHABET.length();
				}
				chaineCodee += ALPHABET.charAt(index + DECALAGE);
			} else if ( String.valueOf(aCoder.charAt(i)).equals(" ") ) {
				chaineCodee += " ";
			} else {
				chaineCodee += "";
			}
		}

		/*******************************************
		 * Ne rien modifier apres cette ligne.
		 *******************************************/
		System.out.format("La chaine initiale etait : '%s'\n", s);

		if (aCoder.isEmpty()) {
			System.out.println("La chaine a coder est vide.\n");
		} else {
			System.out.format("La chaine a coder est : '%s'\n", aCoder);
			System.out.format("La chaine codee est : '%s'\n", chaineCodee);
		}
	}
}