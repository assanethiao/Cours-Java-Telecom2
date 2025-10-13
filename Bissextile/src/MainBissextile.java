
public class MainBissextile {
	public static void main(String[] args) {
		Bissextile an = new Bissextile();
		int [] annee = {1900, 1901, 1996, 2000} ;
		for(int n : annee) {
			if (an.bissextile(n)) {
				System.out.println("L'année " + n + " est bissextile");
			}else {
				System.out.println("L'année " + n + " n'est pas bissextile");
			}
		}
	}
}
