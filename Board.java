import java.util.ArrayList;
import java.util.HashSet;

public class Board {
	
	//ArrayList <Sxhma> card = new ArrayList<>(); //lista kartwn 
	ArrayList <Sxhma> zevgaria = new ArrayList<>(); //lista kartwn  gia ta zevgaria kartwn pou entopizei o xrhsths
	
	Sxhma card1, card2; //oi 2 kartes pou epilegei o xrhsths na akoiksei
	Sxhma epilegmenh; //h karta pou exei epilexthei
	
	
	
	
	public void check() { //elegxos gia to an oi 2 kartes pou anoigei o xrhsths tairiaoun
		
		if(card1.getId() == card2.getId()) { //eanstis 2 kartes tairiazoun ta id
			
		}
		card1 = null; //epanaferw tis kartes
		card2 = null;
	}
	
	

}
