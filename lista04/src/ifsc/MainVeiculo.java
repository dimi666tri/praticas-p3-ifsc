package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		v.setNome("Fiat");
		v.setAno(2006);
		v.setNumeroDeRodas(4);
		v.setFabricante("japao");
		v.setCor("cinza");

		Veiculo v2 = new Veiculo();
		v2.setNome("Uno");
		v2.setAno(2009);
		v2.setNumeroDeRodas(4);
		v2.setFabricante("USA");
		v2.setCor("preto");
		
		Veiculo v3 = new Veiculo();
		v3.setNome("B&W");
		v3.setAno(2010);
		v3.setNumeroDeRodas(6);
		v3.setFabricante("German");
		v3.setCor("branco");

		ArrayList<Veiculo> lista = new ArrayList<>();
		lista.add(v);
		lista.add(v2);
		lista.add(v3);

		for (Veiculo veiculo : lista) {
			System.out.println(veiculo.getnome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumeroDeRodas());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
		}

	}

}
