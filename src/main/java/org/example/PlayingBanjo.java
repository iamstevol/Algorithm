package org.example;

public class PlayingBanjo {

    public static void main(String[] args) {
//        String name = "Rabbit";
        String name = "o";
//        System.out.println(areYouPlayingBanjo(name));
        System.out.println(sameXandO(name));
    }

    public static String areYouPlayingBanjo(String name) {
        return (name.startsWith("R") || name.startsWith("r")) ? (name + " plays banjo") : name + " does not play banjo";
    }

    public static boolean sameXandO(String s) {
        int count = 0;
        int counts = 0;
        if(s.length() == 1) {
            return false;
        }
        String[] arr = s.toLowerCase().split("");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if ((arr[i].equals("x")) && (arr[j].equals("x"))) {
//                    count += Integer.parseInt(arr[i]);
                    count += 1;
                }
                if ((arr[i].equals("o")) && (arr[j].equals("o"))) {
//                    count += Integer.parseInt(arr[i]);
                    counts += 1;
                }

            }
        }
        if(count == counts) {
            return true;
        } else {
            return false;
        }
    }
}
