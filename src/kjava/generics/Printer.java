package kjava.generics;

public class Printer {
	public void pritArray(Object[] obj) {
		for(int i=0;i<obj.length;i++) {
		System.out.println(obj[i].toString());
		}
	}
}
