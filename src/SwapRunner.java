public class SwapRunner {
    public static void main(String[] args){
        //Create a random array of integers
        int [] testArr = {8,6,7,5,3,0,9,10,1,2,3};

        //Print it out before you sort
        System.out.println("Before: ");
        for (int num:testArr){
            System.out.println(num+" ");
        }
        System.out.println();

        //Sort it using swap
        Swap.bubleswap(testArr);

        //Print it out after ypu sort
        System.out.println("After: ");
        for (int num:testArr){
            System.out.println(num+" ");
        }
        System.out.println();
    }
}
