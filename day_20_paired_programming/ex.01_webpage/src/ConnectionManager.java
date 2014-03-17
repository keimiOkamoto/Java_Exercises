
public class ConnectionManager implements Runnable {

private SpamBot spamBot;

    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
    }

    public void run() {
        spamBot = new SpamBotImpl("http://www.oracle.com");

    }
}
