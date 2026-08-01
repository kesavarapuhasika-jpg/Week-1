public class seatchecker {
    public static void main(String[] args){
        int[] seats = {101,102,103,104,105};
        boolean duplicatefound = false;
        for (int i = 0;i<seats.length;i++){
            for(int j = i+1; j < seats.length;j++){
                if(seats[i]==seats[j]){
                    System.out.println("Duplicate :"+seats[i]);
                    duplicatefound = true;
                }
            }
        }
        if(!duplicatefound){
            System.out.println("No Duplicates Found");
        }
    }
}
