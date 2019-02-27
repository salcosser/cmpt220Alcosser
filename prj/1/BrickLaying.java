import java.util.Scanner;

//Sam Alcosser
//2-20-20
//Laying bricks problem
public class BrickLaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// getting the height, width and number of bricks
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		int width = input.nextInt();
		int numBricks = input.nextInt();
		int[] pile = new int[numBricks];
		
		//assigning each brick to its spot in the pile b 
		for(int i = 0;i< numBricks;i++) {
			String brick = input.next();
			int holder =  Integer.parseInt(brick);
			if(holder> width) {
				System.out.println("NO");
				break;
			}
			pile[i] = holder;
		}
		
		//using the lay function to check if he can complete the wall
		lay(height, width, numBricks, pile);
	}
	
	//function that imitates the way Lars lays bricks
public static void lay(int h, int w, int n, int[] p) {
	// counter for the current brick
	int brickInd = 0;
	//for loop to keep track of the height of the wall
	for(int i = 0;i<h;i++) {
		//measure of the current width of the wall
		int currW = 0;
		//loop keeping track of the width of the stack
		while(currW < w) {
			//if you get to the last brick and you still haven't completed a layer, then its false
			if(brickInd == p.length) {
				System.out.println("NO");
				System.exit(0);
			}
			//if the layer would be to wide with the next brick, then its false
			if(currW+ p[brickInd] > w) {
				System.out.println("NO");
				System.exit(0);
			//if the bricks lay out into a perfect layer, then move on to the next layer
			}else if(currW+ p[brickInd] == w) {
				currW += p[brickInd];
				brickInd++;
				currW = 0;
				break;
			}
			// if none of those conditions are met, add the brick to the layer and move up to the next brick
			currW += p[brickInd];
			brickInd++;
		}
	}
	System.out.println("YES");
}
}