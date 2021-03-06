package blackjack;

import cse131.ArgsProcessor;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap=new ArgsProcessor(args);
		int player=ap.nextInt("How many autonomous players you want to play with?");
		int times=ap.nextInt("How many times you want to play?");
		if (times<=0) {
			times=ap.nextInt("No,No,No,if you want to play the game, enter the a number greater than 0");	
		}
		System.out.println("You want to play with "+ player +" autonomous plyaers");
		System.out.println("You decided to play with "+ player + " persons for "+ times+ " games");
		int[]card =new int [player+2];
		int count=0;
		for (int i=0;i<times;i++) {
			System.out.println("\nGame "+(i+1));
			for (int j=0;j<player+2;j++) {
				card[j]=0;
			}
			for (int k=0;k<2;k++) {
				for (int l=0;l<player+2;l++) {
					int pick =(int)(Math.random()*13.0+1);
					if (pick<=10&& pick>=2) {
						card[l]=pick+card[l];
					}
					else if (pick>10) {
						card[l]=10+card[l];				
					}
					else if (pick==1) {
						card[l]=11+card[l];
					}			
				}
			}
			System.out.print("The dealer's face-up card has the value of "+card[0]+"\n");
			if (card[0]==21){
				System.out.println("The dealer defeat everyone!!");
			}
			else {
				System.out.println("\nThe player's scores are: ");
			}
			for (int w=1;w<player+2;w++) {
				System.out.print(card[w]+" ");
			}
			System.out.print("\nThe dealer's face-up has the value of "+ card[0]+"\n");
			System.out.print("\nAnd your current count is "+card[1]+"\n");
			boolean B=true;
			while (B) {
				int hit=ap.nextInt("Would you like to hit? 1 for hit && 0 for stand");
				if (hit!=1 && hit!=0) {
					hit=ap.nextInt("Incorrect! One more time! Would you like to hit? 1 for hit && 0 for stand");
				}
				if (hit==1) {
					System.out.println("You seleced to hit!\n");
					int pick=(int)((Math.random()*13)+1);
					card[1]+=pick;
				}
				else if (hit==0) {
					System.out.print("All right, you decided to stand!"+"\n");
					B=false;
				}
				if (card[1]>21) {
					B=false;
					System.out.print("Boom, you are out! Game Over!"+"\n");
				}
				System.out.print("The dealer's face-up card has the value of "+card[0]+"\nAnd your current count is "+card[1]+"\n");
			}
			for (int x=0; x<player+2;x++) {
				int k=1;
				while (k==1) {
					if (x==1) {
						card[x]=card[x];
						k=0;
					}
					else if (card[x]<17) {
						int pick =((int)Math.random()*13+1);
						card[x]=card[x]+pick;
						k=1;		
					}
					else if(card[x]>=17) {
						k=0;
					}
				}
			}
			for (int y=0;y<player+2;y++) {
				if (card[y]>21) {
					System.out.print("\nPlayer " +y+" Busts!"+card[y]);
				}
				else if (card[y]<21 && card[y]>card[0]){
					System.out.print("\nPlayer "+y+" got "+card[y]+"\nPlayer"+y+ " beats the dealer!");
					if (y==1) {
					count++;
				}
				}
				else if (card[y]<21){
					System.out.print("\nPlayer "+y+" got "+card[y]);
				}
				else if (card[y]==21 &&card[y]>card[0]) {
					System.out.println("\nPlayer "+y+" got blackjack!"+"\nPlyaer"+y+ " beats the dealer!");
					if (y==1) {
					count++;
				}
				}
				else if (card[y]==21){
					System.out.println("\nPlayer "+y+" got blackjack!");
				}	
				}
			}
		double winrate=(double) count/(double) times;
		System.out.println("\n"+"The fraction of human win rate is "+winrate*100+"%");
	}
}
