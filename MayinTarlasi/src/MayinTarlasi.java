import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

   private int rowNumber,colNumber;
   private boolean isitfinish=true;
   int [][] map;
   int [][] board;
   int move=0;
   int zorluk;
    Random random =new Random();
    Scanner scan=new Scanner(System.in);

    public MayinTarlasi(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
    
    }
    public void run() {
        prepareGame();
       /*
        print2();
        System.out.println("");
        System.out.println("");
      
        */
             print();
          
    check();
   
    print2();
    
    }
    
    public void prepareGame() {
        
        System.out.println("Zorluk derecesi : \n1-Kolay\n2-Orta\n3-Zor");
        String tercih=scan.nextLine();
         zorluk = 0;
        
       if(tercih.equals("Kolay")) {
          zorluk=4;
           }
       else if(tercih.equals("Orta")) {
              zorluk=3;     

       }
       else if(tercih.equals("Zor"))
           zorluk=2;
           
        int rndrow;
        int rndcol;
        int boyut=rowNumber*colNumber;
        int sayac=0;
     while(sayac!=boyut/zorluk){
         rndrow=random.nextInt(rowNumber);
         rndcol=random.nextInt(colNumber);
         
         
         
         if(map[rndrow][rndcol]!=-1){
             map[rndrow][rndcol]=-1;
             sayac++;
            
         }
         
             }   
     
    }
    public void print() {
        
        for(int i=0;i<board.length;i++){
            
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!=-1){
                    System.out.print(" ");
                }
                
                
                System.out.print(board[i][j]+" ");
                
            }
            System.out.println("");
        }
        
    }
      public void print2() {
        
        for(int i=0;i<map.length;i++){
            
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]==0){
                    System.out.print(" ");
                }
                
                System.out.print(map[i][j]+" ");
                
            }
            System.out.println("");
        }
        
    }
   
      public void check() {
          
          do {
              
          System.out.println("row :");
          int row=scan.nextInt();
          System.out.println("col:");
          int col=scan.nextInt();
          move++;
          
          if(map[row][col]==-1){
              
              board[row][col]=-1;
     
              print();
              isitfinish=false;
              System.out.println("Game over");
           
          }
          
          
          if(map[row][col]==0 ){
              
              
              if(row-1!=-1) {
                  if(map[row-1][col]==-1){
                  
                       board[row][col]++;
                     
              }
              }
              
              
              if(row+1!=rowNumber) {
                if(map[row+1][col]==-1  ){
                  
                  board[row][col]++;
                  
              }  
                  
              }
              
              if(col-1!=-1) {
                  if(map[row][col-1]==-1  ){
                  
                  
                  board[row][col]++;
                  
              }
                  
              }
              
              if(col+1!=colNumber) {
                   if(map[row][col+1]==-1 ){
                  
                  board[row][col]++;
                 
              }  
              }
                
             if(row-1!=-1&&col-1!=-1) {
                                if(map[row-1][col-1]==-1){
                  
                  board[row][col]++;
                  
              }
                 
             }
              
             
             if(row-1!=-1 && col+1!=colNumber){
                                 if(map[row-1][col+1]==-1){
                  
                  board[row][col]++;
                  
              }
                 
             }

             
             if(row+1!=rowNumber&&col-1!=-1) {
               if(map[row+1][col-1]==-1){
                  
                  board[row][col]++;
                  
              }  
             }

             
             if(row+1!=rowNumber&&col+1!=colNumber) {
                 if(map[row+1][col+1]==-1){
                  
                  board[row][col]++;
                  
              }
             }
               
             print();
              
              if(move==(rowNumber*colNumber)-((rowNumber*colNumber)/zorluk))
              {
                            System.out.println("Tebrikler kazandiniz.");
             break;
              
                  
              }
            
          }
               } while(isitfinish);
    
      }
}
