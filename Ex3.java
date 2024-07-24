package lpaArrayList;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		
		System.out.println("Adicionando 1° valor: " + numeros.get(0));
		System.out.println("Adicionando 2° valor: " +numeros.get(1));
		
		numeros.set(1, 25);
		System.out.println("Mostrando novo valor da posição '1' : " + numeros.get(1));
		
		numeros.remove(0);
		System.out.println("Removendo o valor da posição '0' : " + numeros.get(0));
		
		System.out.println("Mostrando o tamanho '0': " + numeros.size());
	}

}
