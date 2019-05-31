package pizza;

public class CalculPrix implements ICalculPrix {

	@Override
	public float CalculPrix(Pizza p) {
		return p.getPrix();
	}

}
