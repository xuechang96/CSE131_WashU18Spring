package lab9;

import java.awt.Color;
import java.util.Arrays;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class LetterClicks {
	
	public static String ChooseLetter(){
		String[] referDice=new String[6];
		int numDice=(int) (Math.round(Math.random()*15)+1);
		int faceDice=(int)(Math.round(Math.random()*5));
		if(numDice==1) {
			referDice=Dice.die00;
			}
		if(numDice==2) {
			referDice=Dice.die01;
			}
		if(numDice==3) {
			referDice=Dice.die02;
			}
		if(numDice==4) {
			referDice=Dice.die03;
			}
		if(numDice==5) {
			referDice=Dice.die04;
			}
		if(numDice==6) {
			referDice=Dice.die05;
			}
		if(numDice==7) {
			referDice=Dice.die06;
			}
		if(numDice==8) {
			referDice=Dice.die07;
			}
		if(numDice==9) {
			referDice=Dice.die08;
			}
		if(numDice==10) {
			referDice=Dice.die09;
			}
		if(numDice==11) {
			referDice=Dice.die10;
			}
		if(numDice==12) {
			referDice=Dice.die11;
			}
		if(numDice==13) {
			referDice=Dice.die12;
			}
		if(numDice==14) {
			referDice=Dice.die13;
			}
		if(numDice==15) {
			referDice=Dice.die14;
			}
		if(numDice==16) {
			referDice=Dice.die15;
			}
		return referDice[faceDice];
	}
	public static void main(String[] args) {
		//background
		StdDraw.setXscale(0, 1.0);
        StdDraw.setYscale(0, 1.0);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.5,0.5,0.5,0.5);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5,0.9,0.5,0.1);
		//letters
		String[][] array=new String[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				array[i][j]=ChooseLetter();
				//System.out.print(array[i][j]+" ");
				StdDraw.setPenColor(Color.BLUE);
				//StdDraw.setFont(20);
				StdDraw.text((0.125+i*0.25), (0.7-j*0.2),array[i][j]);
			}
			//System.out.println("");
		}
		//submit set up
		StdDraw.setPenColor(Color.white);
		StdDraw.text(0.5, 0.9, "Click here to Submit");
		//StdDraw.text(0.125, 0.7,array[0][0]);
		//set click
		String list="";
		//with dictionary.
		String dic="datafiles/dictionary/shortWords.txt";
		ArgsProcessor.changeStdIn(dic);
		String[] DicList=StdIn.readStrings();
		
		while(true) {
			while(!StdDraw.mousePressed()) {
				StdDraw.show(100);
			}
			while (StdDraw.mousePressed()) {
				StdDraw.show(100);
			}	
			double x=StdDraw.mouseX();
			double y=StdDraw.mouseY();
			int nx=(int)(x/0.25);
			int ny=(int)(y/0.2);
//		System.out.println(x+" "+y);
//		System.out.println(nx+" "+ny);
			
			//submit
			if(y>0.8) {
				System.out.println("Submit "+list);			
				boolean f = Arrays.asList(DicList).contains(list.toLowerCase());
				if(f) {
					System.out.println("Yes!");
				}
				else {
					System.out.println("No!");
				}
				list="";
			}
			else {
				list=list+array[nx][3-ny];
				System.out.println(list);
			}
	}
	}
	
}
		