package singlelockingrace;

public final class ConfigurationManager {

    private static ConfigurationManager instance;

    private final String databaseUrl = "localhost:3306";
    private volatile int timeout = 5000;

    private ConfigurationManager() {
        System.out.println("Object created by: "
                + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Initialization interrupted", e);
        }
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {

            System.out.println(Thread.currentThread().getName()
                    + " passed the first null check");

            synchronized (ConfigurationManager.class) {

                instance = new ConfigurationManager();
            }
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
