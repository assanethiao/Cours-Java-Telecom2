
public class AthleteMain {

	public static void main(String[] args) {
		
		Athlete a1 = new Athlete();
		Athlete a2 = new Athlete();
		Athlete a3 = new Athlete();
		Athlete a4 = new Athlete();
		
		a3.setSuivant(a4);
		a4.setSuivant(a1);
		a1.setSuivant(a2);
		
		a3.prendLeTemoin();
		
		System.out.println(a3.aLeTemoin());
		System.out.println(a4.aLeTemoin());
		System.out.println(a1.aLeTemoin());
		System.out.println(a2.aLeTemoin());

		
		
		
	}

}
