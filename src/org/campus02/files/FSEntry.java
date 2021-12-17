package org.campus02.files;

import java.util.ArrayList;

public abstract class FSEntry {
    // FileSystemEntry
    protected String name;

    public FSEntry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSize();
    public abstract void print();
    public abstract void print(String indent);

    public abstract ArrayList<FSEntry> findEntries(String name);
}
