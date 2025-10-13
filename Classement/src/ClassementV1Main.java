public class ClassementV1Main {

	public static void main(String[] args) {
		final int N = 20;
		int Min = 1;
		int Max = 100;

		int[] tab1 = new int[N];
		int[] tab2 = new int[N];

		// Remplissage du tableau tab1 avec nombres aléatoires
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = Min + (int) (Math.random() * ((Max - Min) + 1));
		}

		int j = 0; // indice pour tab2

		// D'abord ranger les nombres impairs
		for (int i = 0; i < tab1.length; i++) {
			if (tab1[i] % 2 == 1) {
				tab2[j] = tab1[i];
				j++;
			}
		}

		// Ensuite ranger les nombres pairs
		for (int i = 0; i < tab1.length; i++) {
			if (tab1[i] % 2 == 0) {
				tab2[j] = tab1[i];
				j++;
			}
		}

		// Affichage tab1
		System.out.print("tab1 : ");
		for (int i = 0; i < tab1.length; i++) {
			System.out.print(tab1[i] + " ");
		}
		System.out.println();

		// Affichage tab2
		System.out.print("tab2 : ");
		for (int i = 0; i < tab2.length; i++) {
			System.out.print(tab2[i] + " ");
		}
	}
}
