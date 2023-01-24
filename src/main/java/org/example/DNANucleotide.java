package org.example;

public class DNANucleotide {

    public static void main(String[] args) {

        String dna = "G";
        System.out.println(nuc(dna));
    }

    public static String nuc(String dna) {

        String result = "";
        for (int i = 0; i <dna.length() - 1; i++) {
            if(dna.charAt(i) == 'A') {
                result += "T";
            }
        }
        return result;

    }
}
