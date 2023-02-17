
import java.util.Scanner;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Kaca kaclik oynayacaksin ?");
        System.out.println("Row:");
        int row=scan.nextInt();
        System.out.println("Column :");
        int col=scan.nextInt();
        scan.nextLine();
        
        MayinTarlasi mayinTarlasi=new MayinTarlasi(row, col);
        
        
        mayinTarlasi.run();
        
        
    }
    
}
