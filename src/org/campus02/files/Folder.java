package org.campus02.files;

import java.util.ArrayList;

public class Folder extends FSEntry {

    private ArrayList<FSEntry> entries = new ArrayList<>();
    // Nimmt Element des Dateisystems auf

    public Folder(String name) {
        super(name);
    }

      /*
        root => Rechte Maustaste => Eigenschaften => Größe
         + subdir1
            + subdir1_sub
              textFile3.txt
              pictureFile3.png
            textFile2
            textFile1
         + subdir2
            pictureFile1
            pictureFile2
         */

    @Override
    public int getSize() {
        int totalSize = 0;

        for (FSEntry entry : entries) {
            totalSize = totalSize + entry.getSize();
        }

        return totalSize;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (FSEntry entry : entries) {
            entry.print();
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+" + name);
        for (FSEntry entry : entries) {
            entry.print(indent + "  ");
        }
    }

    @Override
    public ArrayList<FSEntry> findEntries(String name) {
        return null;
    }

    public void addEntry(FSEntry entry) {
        entries.add(entry);
    }

}
