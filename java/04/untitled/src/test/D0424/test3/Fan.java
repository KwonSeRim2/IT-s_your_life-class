package test.D0424.test3;

import java.util.Objects;

public class Fan implements Runnable {
    private String name;
    private boolean isVIP;
    private EntryManager entryManager;

    public Fan(String name, boolean isVIP, EntryManager entryManager) {
        this.name = name;
        this.isVIP = isVIP;
        this.entryManager = entryManager;
    }

    public String getName() {
        return name;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fan fan)) return false;
        return isVIP == fan.isVIP && Objects.equals(name, fan.name) && Objects.equals(entryManager, fan.entryManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isVIP, entryManager);
    }

    @Override
    public void run() {
        entryManager.registerFan(this);
        while (!entryManager.processEntry(this)){

            try {
                Thread.sleep(10);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
