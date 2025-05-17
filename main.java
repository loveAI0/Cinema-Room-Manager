public class main {
   public static void main(String[] args){
        for(int i = 0; i < 9; i++ ){
            if(i == 0){
                System.out.println("Cinema:");
            }

            if(i == 1){
                System.out.println("  "+ "1 2 3 4 5 6 7 8");
            }
            else System.out.println((i - 1) + " S S S S S S S S");
        }
   } 
}