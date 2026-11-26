package eager;

public final class ConfigurationManager {

    private static final ConfigurationManager INSTANCE =
            new ConfigurationManager();

    private final String databaseUrl = "localhost:3306";
    private volatile int timeout = 5000;

    private ConfigurationManager() {
        System.out.println("Object created by: "
                + Thread.currentThread().getName());
    }

    public static ConfigurationManager getInstance() {
        return INSTANCE;
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
