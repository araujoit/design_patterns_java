package br.com.brjarvis.designpatterns.comportamental.templatemethod;

public class Twitter extends Network {
    public Twitter(String userName, String password) {
        super(userName, password);
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        simulateNetworkLatency();
        System.out.println("\nLogin success on Twitter");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        //noinspection ConstantConditions
        if(messagePosted) {
            System.out.println("Message " + new String(data) + " was posted on Twitter.");
            return true;
        }
        return false;
    }

    @Override
    void logOut() {
        System.out.println("User: " + this.userName + " was logged out from Twitter!");
    }
}
