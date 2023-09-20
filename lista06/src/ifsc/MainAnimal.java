package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro ();
		
		gato.setNome("baby");
		gato.setRaça("Siames");
		gato.setComprimento(2);
		gato.setNumeroDePatas(4);
		gato.setCor("marrom");
		gato.setEcossistema("domestico");
		gato.caminha();
		gato.miar();
		
	}

}
