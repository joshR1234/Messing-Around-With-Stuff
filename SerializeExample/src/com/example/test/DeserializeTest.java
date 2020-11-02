package com.example.test;

import com.example.domain.Item;
import com.example.domain.ShoppingCart;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.NumberFormat;
import java.util.List;

public class DeserializeTest {

    public static void main(String[] args) {
        String directory = "C:\\Users\\Josh\\\\Documents\\";
        String cartId = null;
        System.out.println("Enter the ID of the cart file to deserialize or q exit.");
        // Wrap the System.in InputStream with a BufferedReader to read
        // each line from the keyboard.
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = in.readLine();
            if (cartId.equals("q")) {
                System.exit(0);
            }
        } catch (IOException e) { // Catch any IO exceptions.
            System.out.println("Exception: " + e);
            System.exit(-1);
        }

        // Attempt to open the file and deserialize it into an object
        String cartFile = directory + "cart" + cartId + ".ser";
        ShoppingCart cart = null;
        // Your code goes here....
        
        ObjectInputStream objectInputStream;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream(cartFile));
			try {
				ShoppingCart cartRead = (ShoppingCart) objectInputStream.readObject();
				System.out.println("Shopping Cart Contains: ");
				List<Item> cartContents = cartRead.getItems();
				
				for(Item item : cartContents) {
					System.out.println(item);
				}
				
				System.out.println("Shopping cart total: " + 
						NumberFormat.getCurrencyInstance().format(cartRead.getCartTotal()));
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
           objectInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        
    }
}