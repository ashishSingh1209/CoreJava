package MultiThreading;

import java.util.HashMap;

class SharedProducts {
    private HashMap<String, Integer> products = new HashMap<>();

    public SharedProducts() {
        products.put("Book", 10);
        products.put("Pen", 1);
        products.put("NoteBook", 1);
        products.put("Pencil", 1);
        products.put("Eraser", 10);
    }

    //Give access to single thread at a time no other thread can execute while this method is in the state of execution
    public synchronized String buyProduct(String key) {
        if (products.containsKey(key)) {
            int quantity = products.get(key);
            if (quantity != 0) {
                quantity = quantity - 1;
                products.put(key, quantity);
                return key + " is out for delivery, Thank you " + Thread.currentThread().getName();
            } else return key + " is out of stock sorry " + Thread.currentThread().getName();

        }
        return "Oops ! There's no any product, Sorry: " + Thread.currentThread().getName();
    }
}

class Shop implements Runnable {
    SharedProducts sharedProducts = null;
    String key;

    Shop(SharedProducts s, String key) {
        sharedProducts = s;
        this.key = key;
    }

    @Override
    public void run() {
        System.out.println(sharedProducts.buyProduct(key));
    }
}


public class RealLifeSynchronization {
    public static void main(String[] args) throws InterruptedException {
        SharedProducts sharedProducts = new SharedProducts();
        SharedProducts sharedProducts1 = new SharedProducts();
        Shop s = new Shop(sharedProducts, "NoteBook");
        Thread t1 = new Thread(s, "student 2");
        Thread t = new Thread(s, "student 1");

        t.start();
        t1.start();


    }
}
