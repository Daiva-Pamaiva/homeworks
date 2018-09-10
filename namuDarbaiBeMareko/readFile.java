package lt.baltictalents.namuDarbaiBeMareko;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class readFile {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap map = new HashMap<>();
        Scanner textas = new Scanner(new File("E:\\Backup\\JavaIntro\\baltic-talents-2-master\\src\\lt\\baltictalents\\namuDarbaiBeMareko\\textas.txt"));
        while (textas.hasNext()) {
            String word = textas.next().replaceAll("([,.;:\"'-()„“–\\s])","");
            if (map.containsKey(word)) {
                Integer count = (Integer) map.get(word);
                map.put(word, new Integer(count.intValue() + 1));
            } else {
                map.put(word, new Integer(1));
            }

        }
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String key = (String) arrayList.get(i);
            Integer count = (Integer) map.get(key);
            System.out.println(key + "-->" + count);
        }
    }

}
