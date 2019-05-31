package pizza;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		Pizza p = new Pizza();
		p.bake();
//		p.bake();
		p.deliver();
//		p.deliver();
		
		ICalculPrix calcul_prix = new CalculPrix();
		ICalculPrix calcul_retard = new Retard(calcul_prix, System.currentTimeMillis() - 35*60*1000);
		
		System.out.println("Montant avant réduction : " + calcul_prix.CalculPrix(p) + "€");
		System.out.println("Montant après réduction : " + calcul_retard.CalculPrix(p) + "€");
	}

}
