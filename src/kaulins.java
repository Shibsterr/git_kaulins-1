import java.util.Random;
import java.util.Scanner;

public class kaulins {
	static void mestKaulinu(int reizes){
	int skaitlis;
	Random rand = new Random();
	for(int i=0; i<=reizes; i++){
	skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita skaitlis: "+skaitlis);
	}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int izvele,reizes;
		do{
			System.out.println("1 - Mest kauliņu || 2 - Apturēt programmu");
			izvele = scan.nextInt();
			switch(izvele){
			case 1:
				do{
					System.out.println("Cik reizes mest kauliņu?\n");
					reizes = scan.nextInt();
				}while(reizes<1);
				mestKaulinu(reizes);
				break;
				
			case 2:
				System.out.println("Programma ir apturēta");
				break;
			}
		}while(izvele != 2);
		scan.close();
	}
}
