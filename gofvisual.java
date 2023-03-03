import java.util.Scanner;
public class gofvisual {
    
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    gof square = new gof(400); //specify size of the grid
    CrossCenter.Visual1(square);
    gof.printdash(square);
    
    int x=1;
    while(x == 1){   
        System.out.println("\nEnter 1 to continue.");
        int y = in.nextInt();
        x=y;
        int[] AsteriskIndex = gof.findIndexOfAsterisk(square);
        int[] CountAsterisk = gof.changeIndex1(square, AsteriskIndex);
        int[] DashIndex = gof.findIndexOfDash(square);
        int[] CountDash = gof.changeIndex2(square, AsteriskIndex, DashIndex);           
        gof.aRoundOfGof(square, AsteriskIndex, CountAsterisk, DashIndex, CountDash );
        System.out.println("");
        gof.printdash(square);
    }
    
}
    
}


