package enumeration;

public class Main {

	public static void main(String[] args) {
		/*for(Langage lang : Langage.values()){
			if(Langage.CPlus.equals(lang)){
				System.out.println("j'aime le "+ lang);
			}else{
				System.out.println(lang);
			}
		}*/
		
		Langage l1 = Langage.JAVA;
		Langage l2 = Langage.C;
		
		l1.getEditor();
		l2.getEditor();

	}

}
