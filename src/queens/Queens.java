package queens;


public class Queens {
    
    private int[] queens_pos;
    private long total_solutions = 0;
    
    public Queens(int size){
        
        queens_pos = new int[size];
        placeQueen(queens_pos, 0);
        
    }

    private boolean isLegal(int[] queens_pos, int current_pos) {
        for (int i = 0; i < current_pos; i++) {
            if (queens_pos[i] == queens_pos[current_pos])
                return false;   // same column
            if (Math.abs(queens_pos[i] - queens_pos[current_pos]) == current_pos - i)
                return false;   // same diagonal
        }
        return true;
    }

    private void printSolutions(int[] queens_pos) {
        for (int i = 0; i < queens_pos.length; i++) {
            for (int j = 0; j < queens_pos.length; j++) {
                if (queens_pos[i] == j)
                    System.out.print("■ ");
                else
                    System.out.print("□ ");
            }
            System.out.println();
        }  
        System.out.println();
    }

    private void placeQueen(int[] queens_pos, int n) {
        if (n == queens_pos.length){
            printSolutions(queens_pos);
            total_solutions = total_solutions + 1;
        } else {
            for (int i = 0; i < queens_pos.length; i++) {
                    queens_pos[n] = i;
                    if (isLegal(queens_pos, n))
                        placeQueen(queens_pos, n+1);
                               
            }
        }
    }  
    
    public long getTotalSolutions(){
        return total_solutions;
    }
    
    public static void main(String[] args) {
       try{
            long start = System.currentTimeMillis();
            Queens q = new Queens(Integer.parseInt(args[0]));
            System.out.println("Found " + q.getTotalSolutions() + " Solutions in:" +
                    (System.currentTimeMillis() - start) + " ms");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No problem size defined");
        }catch(NumberFormatException e){
            System.out.println("Argument cannot be casted to int");
        }
    }
}