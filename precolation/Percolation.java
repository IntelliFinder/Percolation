public class Percolation {
   public Percolation(int n){
       
      //n*n grid
      //create two nodes extra as first and last row -so rowcount-2=colcount=n

   }                // create n-by-n grid, with all sites blocked
   public void open(int row, int col)       // open site (row, col) if it is not open already
   public boolean isOpen(int row, int col)  // is site (row, col) open?
   public boolean isFull(int row, int col)  // is site (row, col) full?
    /* does the system percolate? 
    Create an alias for the bottom and top rows so connected to single site
   This implement the union operations discussed previously in course*/
   public boolean percolates(Percolation p) {
   //define top node as tree root
   //check if top node has path to bottom nose
   }
   public static void main(String[] args){}   // test client (optional)
}
