package news8;

import java.util.Arrays;

interface Func {
	String nome = "Maria";// implicitamente public static final

	double prezzo();// implicitamente public

	default String corriere() {
		return prezzo() + "TNT";
	}

	static String[] corrieri() {
		return new String[] { "TNT", "DHL", "UPS" };
	}
}

class B {
	public String corriere() {
		return "Bartolini";
	}

}

class A extends B implements Func {

	@Override
	public double prezzo() {
		return -1;
	}

}

class C {

	public static String val = "Ciao";
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.corriere());
		// Inevitabilmente va testato o va vista la documentazione
		// System.out.println(a.corriere());
		System.out.println(Arrays.toString(Func.corrieri()));
		System.out.println(Func.nome);
		// B.val="Ciaone";
		// Func.nome="Ciaone";
	}

}
