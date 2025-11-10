public class EquipeLimitee  extends Equipe{
	
	private static final int nombeMax = 3;
	
	public EquipeLimitee() {
		super();
	}
	
	@Override
	public void addJoueur(Joueur c) {
		if (getNombreJoueurs() < nombeMax) {
			super.addJoueur(c);
		}
	}
	
	

}
