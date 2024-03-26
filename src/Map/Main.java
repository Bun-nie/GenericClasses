package Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMap<Integer, String> map = new MyMap<>();
        int key;
        String value;

        //Ask input from user
        System.out.println("\nTesting put()...");
        do{
            System.out.print("Enter key: ");
            key = sc.nextInt();
            if(key == 0){
                break;
            }
            System.out.print("Enter string value: ");
            sc.nextLine();
            value = sc.nextLine();
            map.put(key, value);

            //Checking if added
            System.out.println("Current Keys and Values:");
            System.out.println(map.keys);
            System.out.println(map.values);
        } while (true);

        //Test get values from arraylist
        System.out.println("\nTesting get()...");
        do{
            System.out.print("Enter key: ");
            key = sc.nextInt();
            System.out.println("Value from key " + key + ": " + map.get(key));
        } while (key != 0);

        //Test remove keys and values from arraylists
        System.out.println("\nTesting remove()...");
        do{
            System.out.print("Enter key: ");
            key = sc.nextInt();
            System.out.println("Removed " + map.remove(key) + " from key " + key);

            System.out.println("Current Keys and Values:");
            System.out.println(map.keys);
            System.out.println(map.values);
        } while (key != 0);
    }
}
