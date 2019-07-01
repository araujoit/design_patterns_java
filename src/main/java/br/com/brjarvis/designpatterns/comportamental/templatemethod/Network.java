package br.com.brjarvis.designpatterns.comportamental.templatemethod;

public abstract class Network {
    protected String userName;
    protected String password;

    protected Network(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();

    protected void simulateNetworkLatency() {
        try {
            System.out.print("\nConnecting ");
            int i = 0;
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
