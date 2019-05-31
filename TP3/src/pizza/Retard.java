package pizza;

public class Retard implements ICalculPrix{

	private ICalculPrix calcul;
	private long tempsCommande;
	
	public Retard(ICalculPrix c, long temps) {
		this.calcul = c;
		this.tempsCommande = temps;
	}

	@Override
	public float CalculPrix(Pizza p) {
		long temps = System.currentTimeMillis();
		long quinzeMinutes = 15*60*1000;
		if ((temps - this.tempsCommande) > (2 * quinzeMinutes)) {
			return (float) (this.calcul.CalculPrix(p)-(this.calcul.CalculPrix(p) * 0.1 * ((temps - this.tempsCommande) / quinzeMinutes)));
		}
		return this.calcul.CalculPrix(p);
	}
	
	
}
