public class Statistics {
    public static int countTicket(String[][] cinema){
        int count = 0;
        for (String[] eachRow : cinema) { // Iterates over each row (which is an array)
            for (String num : eachRow) {  // Iterates over each element in the row
                if(num == "B"){
                    count += 1;
                }
            }
            
        }
        return count;
    }

    
}
