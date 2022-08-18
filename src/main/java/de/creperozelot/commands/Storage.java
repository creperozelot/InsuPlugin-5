package de.creperozelot.commands;



import java.util.concurrent.atomic.AtomicBoolean;

public class Storage {

    public AtomicBoolean Test = new AtomicBoolean(true);

    public Boolean EventRunning = false;
    public Boolean Hotgrass = false;



    public void getTest() {
        Test.get();
    }

    public void setTestTrue() {
        Test.set(true);
    }

    public void setTestFalse() {
        Test.set(false);
    }
}

