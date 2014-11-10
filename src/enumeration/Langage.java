package enumeration;

public enum Langage {
	JAVA ("c'est le java", "eclipe"),
	C ("c'est le C", "codeBlocks"),
	CPlus ("c'est le c++", "Geany"),
	PHP ("c'est le php", "ps pad");
	
	public String name = "";
	public String editor = "";
	
	Langage(String n, String e){
		this.name = n;
		this.editor = e;
	}
	
	public void getEditor(){
		System.out.println("Editeur : " + editor);
	}
	/*public void getName(){
		System.out.println("Langage :" + name);
	}*/
	
	public String toString(){
		System.out.println("je suis appelée");
		return name;
	}

}
