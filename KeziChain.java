import java.util.*;

public class KeziChain {

    public static void main(String[] args) {

        // Instantiating a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Welcome message
        System.out.printf("\n\n=== !! WELCOME TO KEZI COIN !! ===\n\n");

        // Prompting user for input
        System.out.print("Enter 1 to mine your first block : ");
        int firstCoin = scan.nextInt();

        // Prompt again if necessary
        while (firstCoin != 1) {
            System.out.print("Please enter 1 to mine your first block : ");
            firstCoin = scan.nextInt();            
        }

        // Closing the scanner object
        scan.close();
        System.out.println();
                   
        // Informing user that the genesis block is being mined
        System.out.printf("Mining genesis block ...\n\n");

        // Pause for dramatic effect
        try { Thread.sleep(3000); } catch (Exception e) {}
                    
        // Creating the genesis block
        Block genesisBlock = new Block("Hi, I'm a Kezi Coin", "0");

        // Displaying the hash of the genesis block        
        System.out.printf("Genesis block : \n\n%s\n\n", genesisBlock.hash);

        

    }

}
