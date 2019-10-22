import java.util.*;
public class HotelV1{
	public static void main(String[]args){
		Randomize();
	}	
	static void Randomize(){
		int[] F1N=Shuffle();
		String[] F1=Floor1I(F1N);
		int[] F2N=Shuffle();
		String[] F2=Floor2I(F2N);
		int[] F3N=Shuffle();
		String[] F3=Floor3I(F3N);
		Start(F1N, F2N, F3N, F1, F2, F3);
	}
	static int[] Shuffle(){
		Integer[] arrayR=new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
		List<Integer> arrayL=Arrays.asList(arrayR);
		Collections.shuffle(arrayL);
		int[] arrayI=(arrayL.stream().mapToInt(Integer::intValue).toArray());
		return arrayI;
	}
	static String[] Floor1I(int[] Num1){
		String[] F1I=new String[9];
		for(int j=0; j<=8; j++){
			if(Num1[j]>=0&&Num1[j]<=4){
				F1I[j]="Nothing";
			}
			else if(Num1[j]>=5&&Num1[j]<=7){
				F1I[j]="a piece of cloth";
			}
			else{
				F1I[j]="a key";
			}
		}
		return F1I;
	}
	static String[] Floor2I(int[] Num2){
		String[] F2I=new String[9];
		for(int j=0; j<=8; j++){
			if(Num2[j]>=0&&Num2[j]<=4){
				F2I[j]="Nothing";
			}
			else if(Num2[j]>=5&&Num2[j]<=7){
				F2I[j]="a piece of cloth";
			}
			else{
				F2I[j]="a bundle of string";
			}
		}
		return F2I;
	}
	static String[] Floor3I(int[] Num3){
		String[] F3I=new String[9];
		for(int j=0; j<=8; j++){
			if(Num3[j]>=0&&Num3[j]<=4){
				F3I[j]="Nothing";
			}
			else if(Num3[j]>=5&&Num3[j]<=7){
				F3I[j]="a piece of cloth";
			}
			else{
				F3I[j]="a crafting table";
			}
		}
		return F3I;
	}
	static void Start(int[] F1N, int[] F2N, int[] F3N, String[] F1, String[] F2, String[] F3){
		Scanner input=new Scanner(System.in);
		Integer[] INV=new Integer[]{0, 0}; // {Cloth, String}
		Integer[] FloorAndRoom=new Integer[]{3, 1}; // {floor, room}
		boolean[] Status=new boolean[]{false, false, true}; // {parachute, locked, playing}
		System.out.println("WELCOME TO THE CRAZY HOSPITAL!!!");
		System.out.println("Created by: Justin Schneider");
		System.out.println("Good you have just woken up");
		while(Status[2]==true){
				FloorStatus(FloorAndRoom, Status, INV, F1N, F1, F2N, F2, F3N, F3);
		}
	}
	static void FloorStatus(Integer[] FloorAndRoom, boolean[] Status, Integer[] INV, int[] F1N, String[] F1, int[] F2N, String[] F2, int[] F3N, String[] F3){
		if(FloorAndRoom[0]==3){
			FloorOne(FloorAndRoom, Status, INV, F1N, F1);
		}
		else if(FloorAndRoom[0]==2){
			FloorTwo(FloorAndRoom, Status, INV, F2N, F2);
		}
		else{
			FloorThree(FloorAndRoom, Status, INV, F3N, F3);
		}
	}
	static void FloorOne(Integer[] FloorAndRoom, boolean[] Status, Integer[] INV, int[] F1N, String[] F1){
		Scanner input=new Scanner(System.in);
		while(FloorAndRoom[0]==3){
			System.out.print("You have 3 options, 1 (Search the room), 2 (Leave the room) and 3 (Jump out the window): ");
			int RoomMenuSelect=input.nextInt();
			if(RoomMenuSelect==1){
				System.out.println("You searched the room and find "+F1[FloorAndRoom[1]]+"\n");
				if(F1N[FloorAndRoom[1]]>7){
					Status[1]=true;
					F1[FloorAndRoom[1]]="Nothing";
				}
				else if(F1N[FloorAndRoom[1]]>4){
					F1[FloorAndRoom[1]]="Nothing";
					Inventory(INV, 0);
				}
			}
			else if(RoomMenuSelect==2){
				System.out.println("You leave the room");
				System.out.print("Which room would you like to enter (1-10): ");
				FloorAndRoom[1]=input.nextInt();
				FloorAndRoom[1]=FloorAndRoom[1]-1;
				while(FloorAndRoom[1]<0||FloorAndRoom[1]>9){
					System.out.println("INALID INPUT");
					System.out.print("Which room would you like to enter (1-10): ");
					FloorAndRoom[1]=input.nextInt();
					FloorAndRoom[1]=FloorAndRoom[1]-1;
				}
				while(FloorAndRoom[1]==9){
					StairWell(FloorAndRoom, Status);
					System.out.println("You back away from the door");
					System.out.print("Which room would you like to enter (1-10): ");
					FloorAndRoom[1]=input.nextInt();
				}
			}
			else if(RoomMenuSelect==3){
				GAMEOVER(FloorAndRoom, Status);
			}
			else System.out.println("INVALID INPUT");
		}
	}
	static void FloorTwo(Integer[] FloorAndRoom, boolean[] Status, Integer[] INV, int[] F2N, String[] F2){
		Scanner input=new Scanner(System.in);
		while(FloorAndRoom[0]==2){
			System.out.print("You have 3 options, 1 (Search the room), 2 (Leave the room) and 3 (Jump out the window): ");
			int RoomMenuSelect=input.nextInt();
			if(RoomMenuSelect==1){
				System.out.println("You searched the room and find "+F2[FloorAndRoom[1]]+"\n");
				if(F2N[FloorAndRoom[1]]>7){
					F2[FloorAndRoom[1]]="Nothing";
					Inventory(INV, 1);
				}
				else if(F2N[FloorAndRoom[1]]>4){
					F2[FloorAndRoom[1]]="Nothing";
					Inventory(INV, 0);
				}
			}
			else if(RoomMenuSelect==2){
				System.out.println("You leave the room");
				System.out.print("Which room would you like to enter (1-10): ");
				FloorAndRoom[1]=input.nextInt();
				FloorAndRoom[1]=FloorAndRoom[1]-1;
				while(FloorAndRoom[1]<0||FloorAndRoom[1]>9){
					System.out.println("INALID INPUT");
					System.out.print("Which room would you like to enter (1-10): ");
					FloorAndRoom[1]=input.nextInt();
					FloorAndRoom[1]=FloorAndRoom[1]-1;
				}
				while(FloorAndRoom[1]==9){
					StairWell(FloorAndRoom, Status);
					System.out.println("You back away from the door");
					System.out.print("Which room would you like to enter (1-10): ");
					FloorAndRoom[1]=input.nextInt();
				}
			}
			else if(RoomMenuSelect==3){
				GAMEOVER(FloorAndRoom, Status);
			}
			else System.out.println("INVALID INPUT");
		}
	}
	static void FloorThree(Integer[] FloorAndRoom, boolean[] Status, Integer[] INV, int[] F3N, String[] F3){
		Scanner input=new Scanner(System.in);
		while(FloorAndRoom[0]==1){
			System.out.print("You have 3 options, 1 (Search the room), 2 (Leave the room) and 3 (Jump out the window): ");
			int RoomMenuSelect=input.nextInt();
			if(RoomMenuSelect==1){
				System.out.println("You searched the room and find "+F3[FloorAndRoom[1]]+"\n");
				if(F3N[FloorAndRoom[1]]>7){
					Paracute(INV, Status);
				}
				else if(F3N[FloorAndRoom[1]]>4){
					F3[FloorAndRoom[1]]="Nothing";
					Inventory(INV, 0);
				}
			}
			else if(RoomMenuSelect==2){
				System.out.println("You leave the room");
				System.out.print("Which room would you like to enter (1-10): ");
				FloorAndRoom[1]=input.nextInt();
				FloorAndRoom[1]=FloorAndRoom[1]-1;
				while(FloorAndRoom[1]<0||FloorAndRoom[1]>9){
					System.out.println("INALID INPUT");
					System.out.print("Which room would you like to enter (1-10): ");
					FloorAndRoom[1]=input.nextInt();
					FloorAndRoom[1]=FloorAndRoom[1]-1;
				}
				while(FloorAndRoom[1]==9){
					StairWell(FloorAndRoom, Status);
					System.out.println("You back away from the door");
					System.out.print("Which room would you like to enter (1-10): ");
					FloorAndRoom[1]=input.nextInt();
				}
			}
			else if(RoomMenuSelect==3){
				GAMEOVER(FloorAndRoom, Status);
			}
			else System.out.println("INVALID INPUT");
		}
	}
	static boolean[] Paracute(Integer[] INV, boolean[] Status){
		if(INV[0]==9&&INV[1]==1){
			Status[0]=true;
		}
		return Status;
	}
	static Integer[] Inventory(Integer[] INV, int itemID){
		INV[itemID]=INV[itemID]+1;
		return INV;
	}
	static boolean[] StatusReturn(boolean[] Status, int Case){
		Status[Case]=true;
		return Status;
	}
	static Integer[] StairWell(Integer[] FloorAndRoom, boolean[] Status){
		Scanner input=new Scanner(System.in);
		if(Status[1]==false){
			System.out.println("The door is locked!");
		}
		else{
			UpOrDown(FloorAndRoom);
		}
		return FloorAndRoom;
	}
	static Integer[] UpOrDown(Integer[] FloorAndRoom){
		Scanner input=new Scanner(System.in);
		int x=0;
		while(x!=3){
			System.out.print("You are on Floor "+(FloorAndRoom[0]+5)+" would you like to go up (1), down (2), or back (3): ");
			x=input.nextInt();
			if(FloorAndRoom[0]==3){
				if(x==1){
					System.out.println("You cannot go any higher");
				}
				else{
					System.out.println("You went down 1 floor");
					FloorAndRoom[0]=FloorAndRoom[0]-1;
				}
			}
			else if(FloorAndRoom[0]==2){
				if(x==1){
					System.out.println("You went up 1 floor");
					FloorAndRoom[0]=FloorAndRoom[0]+1;
				}
				else if(x==2){
					System.out.println("You went down 1 floor");
					FloorAndRoom[0]=FloorAndRoom[0]-1;
				}
			}
			else{
				if(x==1){
					System.out.println("You went up 1 floor");
					FloorAndRoom[0]=FloorAndRoom[0]+1;
				}
				else{
					System.out.println("You cannot go any lower due to the path being blocked off");
				}
			}
		}
		return FloorAndRoom;
	}
	static void GAMEOVER(Integer[] FloorAndRoom, boolean[] Status){
		if(Status[0]==true){
			System.out.println("Congratulations You Won!!!");
		}
		else{
			for(int delay=0; delay<(FloorAndRoom[0]+5); delay++){
				try{
					Thread.sleep(279);
				}
				catch (InterruptedException ie){
					ie.printStackTrace();
				}
				System.out.println(".");
			}
			System.out.println("GAME OVER!");
			System.exit(0);
		}
	}	
}