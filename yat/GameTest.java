package yat;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Game game1=new Game ("Sorry","family",4.5);
		Game game2=new Game("Taboo","group",3.0);
		Game game3=new Game("Mario","video game",5.0);
		Game game4=new Game("Sonic","arcade",2.0);
		Game game5=new Game("Monopoly","Electronic",3.5);
		
		
		
		Game[] Gamelist = {game1,game2,game3,game4,game5};
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter in the name of the game");
        String game=scan.nextLine();
		
        for(int i=0;i<5;i++) {
		if(game.equals(Gamelist[i].Name+Gamelist[i].Genre+Gamelist[i].rating))
		{
		System.out.println("Game found");	
        
        
        }else{
        	System.out.println("Game not found");
		
		System.out.println(Gamelist[i].Name+Gamelist[i].Genre+Gamelist[i].rating);	
		}
		

	
	
	}
	


	}
	
}

