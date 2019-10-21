import java.util.Scanner;
public class V2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		//Item randomization on start
		//Top floor
		int item11, item12, item13, item14, item15, item16, item17, item18, item19;
		item11=(int)(Math.random()*9);
    	item12=(int)(Math.random()*9);
    	while(item11==item12){
    		item12=(int)(Math.random()*9);
    	}
    	item13=(int)(Math.random()*9);
    	while(item12==item13||item11==item13){
    		item13=(int)(Math.random()*9);
    	}
    	item14=(int)(Math.random()*9);
    	while(item13==item14||item12==item14||item11==item14){
    		item14=(int)(Math.random()*9);
    	}
    	item15=(int)(Math.random()*9);
    	while(item14==item15||item13==item15||item12==item15||item11==item15){
    		item15=(int)(Math.random()*9);
    	}
    	item16=(int)(Math.random()*9);
    	while(item15==item16||item14==item16||item13==item16||item12==item16||item11==item16){
    		item16=(int)(Math.random()*9);
    	}
    	item17=(int)(Math.random()*9);
    	while(item16==item17||item15==item17||item14==item17||item13==item17||item12==item17||item11==item17){
    		item17=(int)(Math.random()*9);
    	}
    	item18=(int)(Math.random()*9);
    	while(item17==item18||item16==item18||item15==item18||item14==item18||item13==item18||item12==item18||item11==item18){
    		item18=(int)(Math.random()*9);
    	}
    	item19=(int)(Math.random()*9);
    	while(item18==item19||item17==item19||item16==item19||item15==item19||item14==item19||item13==item19||item12==item19||item11==item19){
    		item19=(int)(Math.random()*9);
    	}
    	String item11String=" ", item12String=" ", item13String=" ", item14String=" ", item15String=" ", item16String=" ", item17String=" ", item18String=" ", item19String=" ";
		if(item11>=0||item11<=5){
    		item11String="Nothing";
    	}
    	else if(item11>=6&&item11<=7){
    		item11String="a piece of Cloth";
    	}
    	else{
    		item11String="a Big Button";
    	}
    	if(item12>=0&&item12<=4){
    		item12String="Nothing";
    	}
    	else if(item12>=5&&item12<=7){
    		item12String="a piece of Cloth";
    	}
    	else{
    		item12String="a Big Button";
    	}
    	if(item13>=0&&item13<=4){
    		item13String="Nothing";
    	}
    	else if(item13>=5&&item13<=7){
    		item13String="a piece of Cloth";
    	}
    	else{
    		item13String="a Big Button";
    	}
    	if(item14>=0&&item14<=4){
    		item14String="Nothing";
    	}
    	else if(item14>=5&&item14<=7){
    		item14String="a piece of Cloth";
    	}
    	else{
    		item14String="a Big Button";
    	}
    	if(item15>=0&&item15<=4){
    		item15String="Nothing";
    	}
    	else if(item15>=5&&item15<=7){
    		item15String="a piece of Cloth";
    	}
    	else{
    		item15String="a Big Button";
    	}
    	if(item16>=0&&item16<=4){
    		item16String="Nothing";
    	}
    	else if(item16>=5&&item12<=7){
    		item16String="a piece of Cloth";
    	}
    	else{
    		item16String="a Big Button";
    	}
    	if(item17>=0&&item17<=4){
    		item17String="Nothing";
    	}
    	else if(item17>=5&&item17<=7){
    		item17String="a piece of Cloth";
    	}
    	else{
    		item17String="a Big Button";
    	}
    	if(item18>=0&&item18<=4){
    		item18String="Nothing";
    	}
    	else if(item18>=5&&item18<=7){
    		item18String="a piece of Cloth";
    	}
    	else{
    		item18String="a Big Button";
    	}
    	if(item19>=0&&item19<=4){
    		item19String="Nothing";
    	}
    	else if(item19>=5&&item19<=7){
    		item19String="a piece of Cloth";
    	}
    	else{
    		item19String="a Big Button";
    	}
		//Middle floor
		int item21, item22, item23, item24, item25, item26, item27, item28, item29;
		item21=(int)(Math.random()*9);
    	item22=(int)(Math.random()*9);
    	while(item21==item22){
    		item22=(int)(Math.random()*9);
    	}
    	item23=(int)(Math.random()*9);
    	while(item22==item23||item21==item23){
    		item23=(int)(Math.random()*9);
    	}
    	item24=(int)(Math.random()*9);
    	while(item23==item24||item22==item24||item21==item24){
    		item24=(int)(Math.random()*9);
    	}
    	item25=(int)(Math.random()*9);
    	while(item24==item25||item23==item25||item22==item25||item21==item25){
    		item25=(int)(Math.random()*9);
    	}
    	item26=(int)(Math.random()*9);
    	while(item25==item26||item24==item26||item23==item26||item22==item26||item21==item26){
    		item26=(int)(Math.random()*9);
    	}
    	item27=(int)(Math.random()*9);
    	while(item26==item27||item25==item27||item24==item27||item23==item27||item22==item27||item21==item27){
    		item27=(int)(Math.random()*9);
    	}
    	item28=(int)(Math.random()*9);
    	while(item27==item28||item26==item28||item25==item28||item24==item28||item23==item28||item22==item28||item21==item28){
    		item28=(int)(Math.random()*9);
    	}
    	item29=(int)(Math.random()*9);
    	while(item28==item29||item27==item29||item26==item29||item25==item29||item24==item29||item23==item29||item22==item29||item21==item29){
    		item29=(int)(Math.random()*9);
    	}
    	String item21String=" ", item22String=" ", item23String=" ", item24String=" ", item25String=" ", item26String=" ", item27String=" ", item28String=" ", item29String=" ";
		if(item21>=0||item21<=5){
    		item21String="Nothing";
    	}
    	else if(item21>=6&&item21<=7){
    		item21String="a piece of Cloth";
    	}
    	else{
    		item21String="a bundle of String";
    	}
    	if(item22>=0&&item22<=4){
    		item22String="Nothing";
    	}
    	else if(item22>=5&&item22<=7){
    		item22String="a piece of Cloth";
    	}
    	else{
    		item22String="a bundle of String";
    	}
    	if(item23>=0&&item23<=4){
    		item23String="Nothing";
    	}
    	else if(item23>=5&&item23<=7){
    		item23String="a piece of Cloth";
    	}
    	else{
    		item23String="a bundle of String";
    	}
    	if(item24>=0&&item24<=4){
    		item24String="Nothing";
    	}
    	else if(item24>=5&&item24<=7){
    		item24String="a piece of Cloth";
    	}
    	else{
    		item24String="a bundle of String";
    	}
    	if(item25>=0&&item25<=4){
    		item25String="Nothing";
    	}
    	else if(item25>=5&&item25<=7){
    		item25String="a piece of Cloth";
    	}
    	else{
    		item25String="a bundle of String";
    	}
    	if(item26>=0&&item26<=4){
    		item26String="Nothing";
    	}
    	else if(item26>=5&&item22<=7){
    		item26String="a piece of Cloth";
    	}
    	else{
    		item26String="a bundle of String";
    	}
    	if(item27>=0&&item27<=4){
    		item27String="Nothing";
    	}
    	else if(item27>=5&&item27<=7){
    		item27String="a piece of Cloth";
    	}
    	else{
    		item27String="a bundle of String";
    	}
    	if(item28>=0&&item28<=4){
    		item28String="Nothing";
    	}
    	else if(item28>=5&&item28<=7){
    		item28String="a piece of Cloth";
    	}
    	else{
    		item28String="a bundle of String";
    	}
    	if(item29>=0&&item29<=4){
    		item29String="Nothing";
    	}
    	else if(item29>=5&&item29<=7){
    		item29String="a piece of Cloth";
    	}
    	else{
    		item29String="a bundle of String";
    	}
		//Bottom floor
		int item31, item32, item33, item34, item35, item36, item37, item38, item39;
		item31=(int)(Math.random()*9);
    	item32=(int)(Math.random()*9);
    	while(item31==item32){
    		item32=(int)(Math.random()*9);
    	}
    	item33=(int)(Math.random()*9);
    	while(item32==item33||item31==item33){
    		item33=(int)(Math.random()*9);
    	}
    	item34=(int)(Math.random()*9);
    	while(item33==item34||item32==item34||item31==item34){
    		item34=(int)(Math.random()*9);
    	}
    	item35=(int)(Math.random()*9);
    	while(item34==item35||item33==item35||item32==item35||item31==item35){
    		item35=(int)(Math.random()*9);
    	}
    	item36=(int)(Math.random()*9);
    	while(item35==item36||item34==item36||item33==item36||item32==item36||item31==item36){
    		item36=(int)(Math.random()*9);
    	}
    	item37=(int)(Math.random()*9);
    	while(item36==item37||item35==item37||item34==item37||item33==item37||item32==item37||item31==item37){
    		item37=(int)(Math.random()*9);
    	}
    	item38=(int)(Math.random()*9);
    	while(item37==item38||item36==item38||item35==item38||item34==item38||item33==item38||item32==item38||item31==item38){
    		item38=(int)(Math.random()*9);
    	}
    	item39=(int)(Math.random()*9);
    	while(item38==item39||item37==item39||item36==item39||item35==item39||item34==item39||item33==item39||item32==item39||item31==item39){
    		item39=(int)(Math.random()*9);
    	}
	  	String item31String=" ", item32String=" ", item33String=" ", item34String=" ", item35String=" ", item36String=" ", item37String=" ", item38String=" ", item39String=" ";
		if(item31>=0||item31<=5){
    		item31String="Nothing";
    	}
    	else if(item31>=6&&item31<=7){
    		item31String="a piece of Cloth";
    	}
    	else{
    		item31String="a Crafting Table";
    	}
    	if(item32>=0&&item32<=4){
    		item32String="Nothing";
    	}
    	else if(item32>=5&&item32<=7){
    		item32String="a piece of Cloth";
    	}
    	else{
    		item32String="a Crafting Table";
    	}
    	if(item33>=0&&item33<=4){
    		item33String="Nothing";
    	}
    	else if(item33>=5&&item33<=7){
    		item33String="a piece of Cloth";
    	}
    	else{
    		item33String="a Crafting Table";
    	}
    	if(item34>=0&&item34<=4){
    		item34String="Nothing";
    	}
    	else if(item34>=5&&item34<=7){
    		item34String="a piece of Cloth";
    	}
    	else{
    		item34String="a Crafting Table";
    	}
    	if(item35>=0&&item35<=4){
    		item35String="Nothing";
    	}
    	else if(item35>=5&&item35<=7){
    		item35String="a piece of Cloth";
    	}
    	else{
    		item35String="a Crafting Table";
    	}
    	if(item36>=0&&item36<=4){
    		item36String="Nothing";
    	}
    	else if(item36>=5&&item32<=7){
    		item36String="a piece of Cloth";
    	}
    	else{
    		item36String="a Crafting Table";
    	}
    	if(item37>=0&&item37<=4){
    		item37String="Nothing";
    	}
    	else if(item37>=5&&item37<=7){
    		item37String="a piece of Cloth";
    	}
    	else{
    		item37String="a Crafting Table";
    	}
    	if(item38>=0&&item38<=4){
    		item38String="Nothing";
    	}
    	else if(item38>=5&&item38<=7){
    		item38String="a piece of Cloth";
    	}
    	else{
    		item38String="a Crafting Table";
    	}
    	if(item39>=0&&item39<=4){
    		item39String="Nothing";
    	}
    	else if(item39>=5&&item39<=7){
    		item39String="a piece of Cloth";
    	}
    	else{
    		item39String="a Crafting Table";
    	}
    	
    	
    	//Start of program
    	int play=1, choice=0, door=1, goToFloor=0; //play is what is being checked for to actually play the game, choice is when in a room you get 3 options
    	//door is a place holder for rooms, goToFloor is for a check on input for floor numbers.
    	int floor=3, room=1, delay=8; //Floor goes by 3=floor 8, 2=floor 7, and 1=floor 6, room starts at 1 . Delay if for the falling
    	int upOrDown=0; //For stairs when you enter allows you to go up and down or back out to floor
    	int invC=0, invS=0; //Inventory Cloth/String
    	boolean Locked=false, playing=true, parachute=false; //Locked reffers to the stairs, playing is a holder for the program and parachute is a boolean for the ending.
    	System.out.println(item11+" "+item12+" "+item13+" "+item14+" "+item15+" "+item16+" "+item17+" "+item18+" "+item19);
    	System.out.println(item21+" "+item22+" "+item23+" "+item24+" "+item25+" "+item26+" "+item27+" "+item28+" "+item29);
    	System.out.println(item31+" "+item32+" "+item33+" "+item34+" "+item35+" "+item36+" "+item37+" "+item38+" "+item39);
    	System.out.println("WELCOME TO THE CRAZY HOSPITAL!!!");
		System.out.println("Created by: Justin Schneider");
		System.out.print("Would you like to start? [yes=1, no=0]: "); //Allows options to play
		play=input.nextInt(); //input for playing
		int randomE=(int)((Math.random()*10)+2);//Little mini game with a 1/10 chance of winning
		if(play==randomE){ //Secret Ending
			System.out.println("Wow didnt think you would try it. But it worked!");
			System.out.println("You found a secret ending!!!");
			System.out.println("CONGRATULATIONS, YOU WIN!");
			System.exit(0);
		}
		else if(play==1){ //if this is true the program will run as normal
			playing=true; //sets a value to playing
			Start out=new Start();
			out.Start1();
			while(playing==true){
				while(floor==3){
					if(room<=0||room>=11){
						System.out.println("Sorry that is not a valid room!");
						System.out.println("Please try again!");
						System.out.println("You see 10 doors [0 to quit, 1-10]");
						System.out.print("What door would you like to try: ");
						door=input.nextInt();
						if(door>=1||door<=10){
							room=door;
						}
					}
					while(room==1){
						System.out.println();
						System.out.println("You are in room 1 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item11String);
								item11String="Nothing";
								if(item11==8){
									Locked=true;
								}
								else if(item11>=5||item11<=7){
									invC++;
									item11=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==2){
						System.out.println();
						System.out.println("You are in room 2 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item12String);
								item12String="Nothing";
								if(item12==8){
									Locked=true;
								}
								else if(item12>=5||item12<=7){
									invC++;
									item12=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==3){
						System.out.println();
						System.out.println("You are in room 3 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item13String);
								item13String="Nothing";
								if(item13==8){
									Locked=true;
								}
								else if(item13>=5||item13<=7){
									invC++;
									item13=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==4){
						System.out.println();
						System.out.println("You are in room 4 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item14String);
								item14String="Nothing";
								if(item14==8){
									Locked=true;
								}
								else if(item14>=5||item14<=7){
									invC++;
									item14=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==5){
						System.out.println();
						System.out.println("You are in room 5 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item15String);
								item15String="Nothing";
								if(item15==8){
									Locked=true;
								}
								else if(item15>=5||item15<=7){
									invC++;
									item15=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==6){
						System.out.println();
						System.out.println("You are in room 6 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item16String);
								item16String="Nothing";
								if(item16==8){
									Locked=true;
								}
								else if(item16>=5||item16<=7){
									invC++;
									item16=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==7){
						System.out.println();
						System.out.println("You are in room 7 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item17String);
								item17String="Nothing";
								if(item17==8){
									Locked=true;
								}
								else if(item17>=5||item17<=7){
									invC++;
									item17=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==8){
						System.out.println();
						System.out.println("You are in room 8 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item18String);
								item18String="Nothing";
								if(item18==8){
									Locked=true;
								}
								else if(item18>=5||item18<=7){
									invC++;
									item18=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==9){
						System.out.println();
						System.out.println("You are in room 9 on floor 8");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item19String);
								item19String="Nothing";
								if(item19==8){
									Locked=true;
								}
								else if(item19>=5||item19<=7){
									invC++;
									item19=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==10){
						if(Locked==true){
							System.out.print("Would you like to go up(1), down(2), or back(3): ");
							upOrDown=input.nextInt();
							if(upOrDown==1&&parachute==true){
								System.out.println("You made it to the roof with a parachute and jump off!");
								System.out.println("CONGRATULATIONS, YOU WIN!");
								System.exit(0);
							}
							else if(upOrDown==1&&parachute==false){
							System.out.println("You need a parachute to leave!");
							}
							else if(upOrDown==2){
								while(upOrDown==2){
									System.out.println("What floor do you want to go to? [1, 2, 3, 4, 5, 6, 7]: ");
									goToFloor=input.nextInt();
									if(goToFloor==7){
										floor=2;
										upOrDown=0;
										room=12345;
									}
									else if(goToFloor==6){
										floor=1;
										upOrDown=0;
										room=123456;
									}
									else if(goToFloor==1||goToFloor==2||goToFloor==3||goToFloor==4||goToFloor==5){
										System.out.println("That floor is blocked off, please try again! [1, 2, 3, 4, 5, 6, 7]: ");
										goToFloor=input.nextInt();
									}
									else if(goToFloor==8){
										System.out.println("You are on that floor already, please try again! [1, 2, 3, 4, 5, 6, 7]: ");
										goToFloor=input.nextInt();
									}
								}
							}
							else if(upOrDown==3){
								System.out.println("You have exited the stairwell and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}
							else{
								System.out.println("Sorry that is not an option!");
								System.out.print("Would you like to go up(1), down(2), or back(3): ");
								upOrDown=input.nextInt();
							}
						}
						else{
							System.out.println("You have yet to unlock this door!");
							System.out.println();
							System.out.println("Please try a different door [0 to quit, 1-10]");
							System.out.print("What door would you like to try: ");
							door=input.nextInt();
							if(door==0){
								System.exit(0);
							}
							else if(door>0||door<11){
								room=door;
								choice=-1;
							}
							else
								System.out.println("That is not a valid door!");
						}
					}
				}
				while(floor==2){
					if(room<=0||room>=11){
						System.out.println("Sorry that is not a valid room!");
						System.out.println("Please try again!");
						System.out.println("You see 10 doors [0 to quit, 1-10]");
						System.out.print("What door would you like to try: ");
						door=input.nextInt();
						if(door>=1||door<=10){
							room=door;
						}
					}
					while(room==12345)
						room=10;
					while(room==1){
						System.out.println();
						System.out.println("You are in room 1 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item21String);
								item21String="Nothing";
								if(item21==8){
									invS=1;
								}
								else if(item21>=5||item21<=7){
									invC++;
									item21=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==2){
						System.out.println();
						System.out.println("You are in room 2 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item22String);
								item22String="Nothing";
								if(item22==8){
									invS=1;
								}
								else if(item22>=5||item22<=7){
									invC++;
									item22=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==3){
						System.out.println();
						System.out.println("You are in room 3 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item23String);
								item23String="Nothing";
								if(item23==8){
									invS=1;
								}
								else if(item23>=5||item23<=7){
									invC++;
									item23=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==4){
						System.out.println();
						System.out.println("You are in room 4 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item24String);
								item24String="Nothing";
								if(item24==8){
									invS=1;
								}
								else if(item24>=5||item24<=7){
									invC++;
									item24=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==5){
						System.out.println();
						System.out.println("You are in room 5 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item25String);
								item25String="Nothing";
								if(item25==8){
									invS=1;
								}
								else if(item25>=5||item25<=7){
									invC++;
									item25=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==6){
						System.out.println();
						System.out.println("You are in room 6 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item26String);
								item26String="Nothing";
								if(item26==8){
									invS=1;
								}
								else if(item26>=5||item26<=7){
									invC++;
									item26=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==7){
						System.out.println();
						System.out.println("You are in room 7 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item27String);
								item27String="Nothing";
								if(item27==8){
									invS=1;
								}
								else if(item27>=5||item27<=7){
									invC++;
									item27=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==8){
						System.out.println();
						System.out.println("You are in room 8 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item28String);
								item28String="Nothing";
								if(item28==8){
									invS=1;
								}
								else if(item28>=5||item28<=7){
									invC++;
									item28=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==9){
						System.out.println();
						System.out.println("You are in room 9 on floor 7");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the seventh floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item29String);
								item29String="Nothing";
								if(item29==8){
									invS=1;
								}
								else if(item29>=5||item29<=7){
									invC++;
									item29=0;
								}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==10){
						if(Locked==true){
							System.out.print("Would you like to go up(1), down(2), or back(3): ");
							upOrDown=input.nextInt();
							if(upOrDown==1){
								System.out.print("Which floor do you want to go to? [8, 9]: ");
								goToFloor=input.nextInt();
								if(goToFloor==8){
									goToFloor=goToFloor-5;
									floor=goToFloor;
									upOrDown=0;
									room=10;
								}
								else if(goToFloor==9&&parachute==false){
									System.out.println("You need a parachute to leave!");
								}
								else if(goToFloor==9&&parachute==true){
									System.out.println("You made it to the roof with a parachute and jump off!");
									System.out.println("CONGRATULATIONS, YOU WIN!");
									System.exit(0);
								}
							}
							else if(upOrDown==2){
								while(upOrDown==2){
									System.out.println("What floor do you want to go to? [1, 2, 3, 4, 5, 6]: ");
									goToFloor=input.nextInt();
									if(goToFloor==6){
										floor=1;
										upOrDown=0;
										room=123456;
									}
									else{
										System.out.println("That floor is blocked off, please try again! [1, 2, 3, 4, 5, 6]: ");
										goToFloor=input.nextInt();
									}
								}
							}
							else if(upOrDown==3){
								System.out.println("You have exited the stairwell and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}
							else{
								System.out.println("Sorry that is not an option!");
								System.out.print("Would you like to go up(1), down(2), or back(3): ");
								upOrDown=input.nextInt();
							}
						}
					}
				}
				while(floor==1){
					if(room<=0||room>=11){
						System.out.println("Sorry that is not a valid room!");
						System.out.println("Please try again!");
						System.out.println("You see 10 doors [0 to quit, 1-10]");
						System.out.print("What door would you like to try: ");
						door=input.nextInt();
						if(door>=1||door<=10){
							room=door;
						}
					}
					while(room==123456)
						room=10;
					while(room==1){
						System.out.println();
						System.out.println("You are in room 1 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item31String);
								if(item31==7){
									invS=1;
									item31String="Nothing";
								}
								else if(item31>=5||item31<=7){
									invC++;
									item31=0;
									item31String="Nothing";
								}
    							else if(item31==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==2){
						System.out.println();
						System.out.println("You are in room 2 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item32String);
								if(item32==7){
									invS=1;
									item32String="Nothing";
								}
								else if(item32>=5||item32<=7){
									invC++;
									item32=0;
									item32String="Nothing";
								}
    							else if(item32==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==3){
						System.out.println();
						System.out.println("You are in room 3 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item33String);
								if(item33==7){
									invS=1;
									item33String="Nothing";
								}
								else if(item33>=5||item33<=7){
									invC++;
									item33=0;
									item33String="Nothing";
								}
    							else if(item33==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==4){
						System.out.println();
						System.out.println("You are in room 4 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item34String);
								if(item34==7){
									invS=1;
									item34String="Nothing";
								}
								else if(item34>=5||item34<=7){
									invC++;
									item34=0;
									item34String="Nothing";
								}
    							else if(item34==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==5){
						System.out.println();
						System.out.println("You are in room 5 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
									try{
										Thread.sleep(279);
									}
									catch (InterruptedException ie){
									ie.printStackTrace();
									}
									System.out.println(".");
								}
								System.out.println("You landed on an awning and somehow live!");
								System.out.println("CONGRATULATIONS, YOU WIN!"); //An easy ending to get without the parachute
								System.exit(0);
							}
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item35String);
								if(item35==7){
									invS=1;
									item35String="Nothing";
								}
								else if(item35>=5||item35<=7){
									invC++;
									item35=0;
									item35String="Nothing";
								}
    							else if(item35==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==6){
						System.out.println();
						System.out.println("You are in room 6 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item36String);
								if(item36==7){
									invS=1;
									item36String="Nothing";
								}
								else if(item36>=5||item36<=7){
									invC++;
									item36=0;
									item36String="Nothing";
								}
    							else if(item36==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==7){
						System.out.println();
						System.out.println("You are in room 7 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item37String);
								if(item37==7){
									invS=1;
									item37String="Nothing";
								}
								else if(item37>=5||item37<=7){
									invC++;
									item38=0;
									item37String="Nothing";
								}
    							else if(item37==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==8){
						System.out.println();
						System.out.println("You are in room 8 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item38String);
								if(item38==7){
									invS=1;
									item38String="Nothing";
								}
								else if(item38>=5||item38<=7){
									invC++;
									item38=0;
									item38String="Nothing";
								}
    							else if(item38==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==9){
						System.out.println();
						System.out.println("You are in room 9 on floor 6");
						System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
						choice=input.nextInt();
						while(choice>=0){
							if(choice==0){
								 System.exit(0);
							}
							else if(choice==1){
								System.out.println("You are on the sixth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
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
							else if(choice==2){
								System.out.println();
								System.out.println("You have exited the room and see 10 doors [0 to quit, 1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door==0){
									System.exit(0);
								}
								else if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}	
							else if(choice==3){
								System.out.println();
								System.out.println("You found: "+item39String);
								if(item39==7){
									invS=1;
									item39String="Nothing";
								}
								else if(item39>=5||item39<=7){
									invC++;
									item39=0;
									item39String="Nothing";
								}
    							else if(item39==8){
    								if(invC==6&&invS==1){
    									System.out.println("You crafted a parachute!");
    									parachute=true;
    								}
    								else{
    									int invCT=6-invC;
    									int invST=1-invS;
    									System.out.println("You are missing: "+invCT+" \"Cloth\" and "+invST+" \"String\"");
    								}
    							}
								choice=-1;
							}
							else{
								System.out.println();
								System.out.println("Sorry but that isn't an option.");
								System.out.println();
								System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
								choice=input.nextInt();
							}
						}
					}
					while(room==10){
						if(Locked==true){
							System.out.print("Would you like to go up(1), down(2), or back(3): ");
							upOrDown=input.nextInt();
							if(upOrDown==1){
								System.out.println("Which floor do you want to go to? [7, 8, 9]");
								goToFloor=input.nextInt();
								if(goToFloor==8){
									floor=3;
									upOrDown=0;
									room=10;
								}
								else if(goToFloor==7){
									floor=2;
									upOrDown=0;
									room=12345;
								}
								else if(goToFloor==9&&parachute==false){
									System.out.println("You need a parachute to leave!");
								}
								else if(goToFloor==9&&parachute==true){
									System.out.println("You made it to the roof with a parachute and jump off!");
									System.out.println("CONGRATULATIONS, YOU WIN!");
									System.exit(0);
								}
							}
							else if(upOrDown==2){
								while(upOrDown==2){
									System.out.println("Sorry you cannot go down floors!");
									upOrDown=0;
									}
							}
							else if(upOrDown==3){
								System.out.println("You exit the stairwell and see 10 doors [1-10]");
								System.out.print("What door would you like to try: ");
								door=input.nextInt();
								if(door>0||door<11){
									room=door;
									choice=-1;
								}
								else
									System.out.println("That is not a valid door!");
							}
							else{
								System.out.println("Sorry that is not an option!");
								System.out.print("Would you like to go up(1), down(2), or back(3): ");
								upOrDown=input.nextInt();
							}
						}
					}
				}
			}
		}
	}
}