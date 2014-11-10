import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListeChainee {

	public static void main(String[] args) {
		List listeChainee = new LinkedList();
		
		listeChainee.add("un");
		listeChainee.add("deux");
		listeChainee.add("trois");
		listeChainee.add("quatre");
		
		for(int i=0; i<listeChainee.size(); i++){
			System.out.print(listeChainee.get(i) + " ");
		}
		
		System.out.println("Affichage avec iterateur");
		ListIterator li = listeChainee.listIterator();
		
		while(li.hasNext()){
			System.out.print(li.next() +" ");
		}
		

	}

}
