import java.util.Scanner;

public class game
	{
		public static char[][] board ={{'#','#','#'},{'#','#','#'},{'#','#','#'}};
		static void rest(int i) throws InterruptedException{
			Thread.sleep(i);
		}
		static 	Scanner scan=new Scanner(System.in);
static void print(){
	System.out.println("  1 2 3");
	for (int i =0;i<3;i++){
		System.out.print(i+1+" ");
		for (int j=0;j<3;j++){
			System.out.print(board[i][j]+" ");
		}
		System.out.println();
	}
}
static boolean checkBoard(){
	for (int i =0;i<board.length;i++){
		for (int j=0; j<board[0].length;j++){
			if (board[i][j]=='#')
				return false;
		}
	}
	return true;
}
static boolean checkPlayer(){
	if (board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X'){
		return true;
	}
	else if (board[1][0]=='X'&&board[1][1]=='X'&&board[1][2]=='X'){
		return true;
	}
	else if (board[2][0]=='X'&&board[2][1]=='X'&&board[2][2]=='X'){
		return true;
	}
	else if (board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X'){
		return true;
	}
	else if (board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X'){
		return true;
	}
	else if (board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X'){
		return true;
	}
	else if (board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X'){
		return true;
	}
	else if (board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X'){
		return true;
	}
	else {
		return false;
	}
}
static boolean checkAI(){
	if (board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O'){
		return true;
	}
	else if (board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O'){
		return true;
	}
	else if (board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O'){
		return true;
	}
	else if (board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O'){
		return true;
	}
	else if (board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O'){
		return true;
	}
	else if (board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O'){
		return true;
	}
	else if (board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O'){
		return true;
	}
	else if (board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O'){
		return true;
	}
	else {
		return false;
	}
}
static void randomAI() throws InterruptedException{
	
	while(true){
		int q=AI.random();
	int w=AI.random();
	if (board[q][w]=='#'){
		board[q][w]='O';
		break;
	}
	else {System.out.println(".");
	rest(500);
	}}
	
}
static void playerInput(String s){
	
	byte[] row=new byte[1];
    byte[] column=new byte[1];
    if(s.length()>2){
	s.getBytes(0, 1, row, 0);
	s.getBytes(2, 3, column, 0);
    }
	int row1=(int) row[0]-49;
	int column1=(int) column[0]-49;
if((row1>=0)&&(row1<=2)&&(column1<=2)&&(column1>=0)&&board[row1][column1]=='#'){
	board[row1][column1]='X';
}
else System.out.println("you didn't do it right, your turn got skipped for your incompetence");
}
		public static void main(String[] args) throws InterruptedException
			{
				// TODO Auto-generated method stub

				System.out.println("Hello, we are going to be playing tic-tac-toe, you are X's, so you will go first.");

				print();		
System.out.println("this is the board we will be playing on, please input the location you would like to play like this 'row,column'");
while(true)	{	
			System.out.println("Please type in your location now");
			playerInput(scan.next());
			print();
			if (checkPlayer()==true){
				System.out.println("You Win");
				break;
			}
			if (checkBoard()==true){
				System.out.println("nobody won, that was pointless");
				break;}
			System.out.println("your opponent is playing now");
			rest(1000);
			randomAI();
			print();
			if (checkAI()==true){
				System.out.println("You Lose");
				break;
			}
			if (checkBoard()==true){
				System.out.println("nobody won, that was pointless");
				break;
			}
			}
			}

	}