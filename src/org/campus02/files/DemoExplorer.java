package org.campus02.files;

import java.util.ArrayList;

public class DemoExplorer {
    public static void main(String[] args) {

        File textFile1 = new File("textdatei1", "txt", 100);
        File textFile2 = new File("textdatei2", "txt", 50);
        File textFile3 = new File("txtdatei3", "txt", 75);
        File pictureFile1 = new File("demobild", "png", 753);
        File pictureFile2 = new File("demobild1", "png", 1502);
        File pictureFile3 = new File("demobild2", "png", 347);

        Folder root = new Folder("root");
        Folder subdir1 = new Folder("subdir1");
        Folder subdir2 = new Folder("subdir2");
        Folder subdir1_sub = new Folder("subdir1_sub");

        /*
        root
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

        subdir2.addEntry(pictureFile1);
        subdir2.addEntry(pictureFile2);
        subdir1_sub.addEntry(textFile3);
        subdir1_sub.addEntry(pictureFile3);
        subdir1.addEntry(subdir1_sub);
        subdir1.addEntry(textFile2);
        subdir1.addEntry(textFile1);
        root.addEntry(subdir1);
        root.addEntry(subdir2);


        System.out.println("root.getSize() = " + root.getSize());
        System.out.println("textFile3 = " + textFile3.getSize());

        System.out.println("root.getSize() = " + root.getSize());
        System.out.println("subdir1 = " + subdir1.getSize());

        textFile2.print();
        root.print();

                /*
        root : total Size: 2802
        subdir1 : total Size: xx
        subdir1_sub
        textFile3 : 50kB
        pictureFile3 : 50kB
        textFile2 : 50kB
        textFile1 : 50kB
        subdir2
        pictureFile1 : 50kB
        pictureFile2 : 50kB
         */

        root.print("");

       /* System.out.println("\"demobild1.png\".contains(\"demobild\") = " + "demobild1.png".contains("demobild"));

        System.out.println("Searching for demobild");
        ArrayList<FSEntry> searchResults = root.findEntries("demobild");
        System.out.println("found entries with demobild: " + searchResults.size());
        for (FSEntry sr : searchResults) {
            System.out.println("sr.getName() = " + sr.getName());
        }


        System.out.println("Searching for dir");
        searchResults = root.findEntries("dir");
        System.out.println("found entries with dir: " + searchResults.size());
        for (FSEntry sr : searchResults) {
            System.out.println("sr.getName() = " + sr.getName());
        }*/
    }
}
