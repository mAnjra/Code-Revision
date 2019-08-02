package Nicknames;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matti", "mage");
        nicknames.put("mickael", "mick");
        nicknames.put("arto", "arp");

        System.out.println(nicknames.get("mickael"));
    }
}
