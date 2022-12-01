//นนภวัฒน์ ศรีนวล 6304101339

import java.util.Scanner;
public class MainCorncert {

	public static void main(String[] args) {
		char [][] zone1=new char [5][20];//100
		char [][] zone2=new char [2][100];//200
		char [][] zone3=new char [11][30];//330
		char [][] zone4=new char [17][35];//595
		char [][] zone5=new char [17][20];//340
		char [][] zone6=new char [17][10];//170
		int money=0, seat=0,allSeat=1735;
		int acc,close; 
		Scanner s=new Scanner(System.in);
		do{
			
			for(int i=1;i<=6;i++)
			{
				if (i==1) {
					System.out.println("ZONE 1 (6,000 Bath)");
					for(int j=0;j<5;j++) {
						if(j==0) System.out.print("A1 >> ");
						else if(j==1) System.out.print("A2 >> ");
						else if(j==2) System.out.print("A3 >> ");
						else if(j==3) System.out.print("GG >> ");
						else if(j==4) System.out.print("HH >> ");
						for(int set=0;set<20;set++) {
							System.out.print("("+set+" = "+zone1[j][set]+") ");
						
						}
						System.out.println();
					}
				}
				else if (i==2) {
					System.out.println();
					System.out.println("ZONE 2 (5,000 Bath)");
					for(int j=0;j<2;j++) {
						if(j==0) System.out.print("AL >> ");
						else if(j==1) System.out.print("AR >> ");
						for(int set=0;set<100;set++) {
							System.out.print("("+set+" = "+zone2[j][set]+") ");
						
						}
						System.out.println();
					}
					
				}
				else if (i==3) {
					System.out.println();
					System.out.println("ZONE 3 (4,500 Bath)");
					for(int j=0;j<11;j++) {
						if(j==0) System.out.print("SC >> ");
						else if(j==1) System.out.print("SD >> ");
						else if(j==2) System.out.print("SE >> ");
						else if(j==3) System.out.print("SF >> ");
						else if(j==4) System.out.print("SG >> ");
						else if(j==5) System.out.print("SH >> ");
						else if(j==6) System.out.print("SI >> ");
						else if(j==7) System.out.print("SJ >> ");
						else if(j==8) System.out.print("SK >> ");
						else if(j==9) System.out.print("SL >> ");
						else if(j==10) System.out.print("SM >> ");
						for(int set=0;set<30;set++) {
							System.out.print("("+set+" = "+zone3[j][set]+") ");
						
						}
						System.out.println();
					}
					
				}
				else if (i==4) {
					System.out.println();
					System.out.println("ZONE 4 (3,000 Bath)");
					for(int j=0;j<17;j++) {
						if(j==0) System.out.print("C >> ");
						else if(j==1) System.out.print("D >> ");
						else if(j==2) System.out.print("E >> ");
						else if(j==3) System.out.print("F >> ");
						else if(j==4) System.out.print("G >> ");
						else if(j==5) System.out.print("H >> ");
						else if(j==6) System.out.print("I >> ");
						else if(j==7) System.out.print("J >> ");
						else if(j==8) System.out.print("K >> ");
						else if(j==9) System.out.print("L >> ");
						else if(j==10) System.out.print("M >> ");
						else if(j==11) System.out.print("N >> ");
						else if(j==12) System.out.print("O >> ");
						else if(j==13) System.out.print("P >> ");
						else if(j==14) System.out.print("Q >> ");
						else if(j==15) System.out.print("R >> ");
						else if(j==16) System.out.print("S >> ");
						for(int set=0;set<35;set++) {
							System.out.print("("+set+" = "+zone4[j][set]+") ");
						
						}
						System.out.println();
					}
					
				}
				else if (i==5) {
					System.out.println();
					System.out.println("ZONE 5 (2,000 Bath)");
					for(int j=0;j<17;j++) {
						if(j==0) System.out.print("C >> ");
						else if(j==1) System.out.print("D >> ");
						else if(j==2) System.out.print("E >> ");
						else if(j==3) System.out.print("F >> ");
						else if(j==4) System.out.print("G >> ");
						else if(j==5) System.out.print("H >> ");
						else if(j==6) System.out.print("I >> ");
						else if(j==7) System.out.print("J >> ");
						else if(j==8) System.out.print("K >> ");
						else if(j==9) System.out.print("L >> ");
						else if(j==10) System.out.print("M >> ");
						else if(j==11) System.out.print("N >> ");
						else if(j==12) System.out.print("O >> ");
						else if(j==13) System.out.print("P >> ");
						else if(j==14) System.out.print("Q >> ");
						else if(j==15) System.out.print("R >> ");
						else if(j==16) System.out.print("S >> ");
						for(int set=0;set<20;set++) {
							System.out.print("("+set+" = "+zone5[j][set]+") ");
						
						}
						System.out.println();
					}
					
				}
				else  {
					System.out.println();
					System.out.println("ZONE 6 (1,200 Bath)");
					for(int j=0;j<17;j++) {
						if(j==0) System.out.print("C >> ");
						else if(j==1) System.out.print("D >> ");
						else if(j==2) System.out.print("E >> ");
						else if(j==3) System.out.print("F >> ");
						else if(j==4) System.out.print("G >> ");
						else if(j==5) System.out.print("H >> ");
						else if(j==6) System.out.print("I >> ");
						else if(j==7) System.out.print("J >> ");
						else if(j==8) System.out.print("K >> ");
						else if(j==9) System.out.print("L >> ");
						else if(j==10) System.out.print("M >> ");
						else if(j==11) System.out.print("N >> ");
						else if(j==12) System.out.print("O >> ");
						else if(j==13) System.out.print("P >> ");
						else if(j==14) System.out.print("Q >> ");
						else if(j==15) System.out.print("R >> ");
						else if(j==16) System.out.print("S >> ");
						for(int set=0;set<10;set++) {
							System.out.print("("+set+" = "+zone6[j][set]+") ");
						
						}
						System.out.println();
					}
					
				}
			}
		System.out.println();
		System.out.print("Zone selection (1-6) >> "); //loopHereAgain
		int zone=s.nextInt(),x,y;
		if (zone==1) {
			do {
			do {
			
			System.out.print("Selec Row (0-5) >> ");
			x=s.nextInt();
			System.out.print("Selec Seat (0-19)>> ");
			y=s.nextInt();
			if (zone1[x][y]=='X') {
				System.out.println("Sorry this seat was taken");
				System.out.println("Please selec agian");
			}
			}while (zone1[x][y]=='X') ;
			zone1[x][y]='X';
			money=money+6000;
			seat++;
			System.out.print("Do you want more? (Yes:1 // No:2)>> ");
			acc=s.nextInt();

			}while(acc==1);
			
		}
		else if (zone==2) {
			do {
			do {
			
			System.out.print("Selec Row (0-1) >> ");
			x=s.nextInt();
			System.out.print("Selec Seat (0-99) >> ");
			y=s.nextInt();
			if (zone2[x][y]=='X') {
				System.out.println("Sorry this seat was taken");
				System.out.println("Please selec agian");
			}
			}while (zone2[x][y]=='X') ;
			zone2[x][y]='X';
			money=money+5000;
			seat++;
			System.out.print("Do you want more? (Yes:1 // No:2)>> ");
			acc=s.nextInt();

			}while(acc==1);
			
		}
		else if (zone==3) {
			do {
			do {
			
			System.out.print("Selec Row (0-10) >> ");
			x=s.nextInt();
			System.out.print("Selec Seat (0-29) >> ");
			y=s.nextInt();
			if (zone3[x][y]=='X') {
				System.out.println("Sorry this seat was taken");
				System.out.println("Please selec agian");
			}
			}while (zone3[x][y]=='X') ;
			zone3[x][y]='X';
			money=money+4500;
			seat++;
			System.out.print("Do you want more? (Yes:1 // No:2)>> ");
			acc=s.nextInt();

			}while(acc==1);
			
		}
		else if (zone==4) {
			do {
			do {
			
			System.out.print("Selec Row (0-16) >> ");
			x=s.nextInt();
			System.out.print("Selec Seat (0-34) >> ");
			y=s.nextInt();
			if (zone4[x][y]=='X') {
				System.out.println("Sorry this seat was taken");
				System.out.println("Please selec agian");
			}
			}while (zone4[x][y]=='X') ;
			zone4[x][y]='X';
			money=money+3000;
			seat++;
			System.out.print("Do you want more? (Yes:1 // No:2)>> ");
			acc=s.nextInt();

			}while(acc==1);
			
		}
		else if (zone==5) {
			do {
			do {
			
			System.out.print("Selec Row (0-16) >> ");
			x=s.nextInt();
			System.out.print("Selec Seat (0-19) >> ");
			y=s.nextInt();
			if (zone5[x][y]=='X') {
				System.out.println("Sorry this seat was taken");
				System.out.println("Please selec agian");
			}
			}while (zone5[x][y]=='X') ;
			zone5[x][y]='X';
			money=money+2000;
			seat++;
			System.out.print("Do you want more? (Yes:1 // No:2)>> ");
			acc=s.nextInt();

			}while(acc==1);
			
		}
		else if (zone==6) {
			do {
			do {
			
			System.out.print("Selec Row (0-16) >> ");
			x=s.nextInt();
			System.out.print("Selec Seat (0-9) >> ");
			y=s.nextInt();
			if (zone6[x][y]=='X') {
				System.out.println("Sorry this seat was taken");
				System.out.println("Please selec agian");
			}
			}while (zone6[x][y]=='X') ;
			zone6[x][y]='X';
			money=money+1200;
			seat++;
			System.out.print("Do you want more? (Yes:1 // No:2)>> ");
			acc=s.nextInt();

			}while(acc==1);
			
		}
		System.out.print("Do you want to close the program? (Yes:1 // No:2)>> ");
		close=s.nextInt();
	}while(close!=1);
		
		
		System.out.println("Total Money = "+money);
		System.out.print("The rest of the seat = "+(allSeat-seat));

	}
	
}
