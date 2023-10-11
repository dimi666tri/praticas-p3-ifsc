package lista7;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Desktop des = new Desktop ();
		des.venda();
		des.setFabricante("Dimitri");
		des.getPecas().add("Monitor");
		des.setCodBarras((long) 123456);
		des.setGamer(false);
		
		Desktop desk = new Desktop ();
		desk.venda();
		desk.setFabricante("Kafka");
		desk.getPecas().add("Camera");
		desk.setCodBarras((long) 1233456);
		desk.setGamer(true);
		
		Desktop deskt = new Desktop ();
		deskt.venda();
		deskt.setFabricante("Matthew");
		deskt.getPecas().add("Mouse");
		deskt.setCodBarras((long) 12345624);
		deskt.setGamer(false);
		
		Smartphone phone = new Smartphone ();
		phone.venda();
		phone.setFabricante("Larissa");
		phone.setCodBarras((long) 123474);
		phone.setDimensoesTela("2x4");
		phone.setQualidadeCam ("4K");
		
		Smartphone phones = new Smartphone ();
		phones.venda();
		phones.setFabricante("Bruna");
		phones.setCodBarras((long) 1253474);
		phones.setDimensoesTela("2x6");
		phones.setQualidadeCam ("HD");
		
		Smartphone Smart = new Smartphone ();
		Smart.venda();
		Smart.setFabricante("Mariana");
		Smart.setCodBarras((long) 123473094);
		Smart.setDimensoesTela("1x5");
		Smart.setQualidadeCam ("4K");
		
		ArrayList <Desktop> computador = new ArrayList <> ();
		computador.add(des);
		computador.add(desk);
		computador.add(deskt);
		
		ArrayList <Smartphone> celular = new ArrayList <> ();
		celular.add(phone);
		celular.add(phones);
		celular.add(Smart);
		
		for (Desktop pc : computador) {
			System.out.println("\n" + pc.getFabricante());
			System.out.println(pc.getCodBarras());
			System.out.println(pc.getPecas());
			System.out.println(pc.getGamer() + "\n");
		}
		for (Smartphone cell : celular) {
			System.out.println("\n" + cell.getFabricante());
			System.out.println(cell.getCodBarras());
			System.out.println(cell.getDimensoesTela());
			System.out.println(cell.getQualidadeCam() + "\n");
		}
		
	} }
