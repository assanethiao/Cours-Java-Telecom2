
public class ClassementV2Main {

	public static void main(String[] args) {
		
		final int N = 20;
		int Min = 1;
		int Max = 100;

		int[] tab = new int[N];

		// Remplissage du tableau tab avec nombres aléatoires
		for (int i = 0; i < tab.length; i++) {
			tab[i] = Min + (int) (Math.random() * ((Max - Min) + 1));
		}		
		
		System.out.print("tab : ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
		
		int temp = 0;
		
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				temp = tab[i];
				for (int j = i+1; j < tab.length; j++) {
					if (tab[j] % 2 == 1) {
						tab[i] = tab[j];
						tab[j] = temp;
						break;
					}
				}
			}
			
		}
		System.out.print("tab classé : ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

}
