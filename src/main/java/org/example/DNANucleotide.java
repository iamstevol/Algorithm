package org.example;

public class DNANucleotide {

    public static void main(String[] args) {

        String dna = "GAT";
        System.out.println(nuc(dna));
    }

    public static String nuc(String dna) {

        String result ="";
        if(dna.equals("")) {
            return "";
        }
        for (int i = 0; i <dna.length() - 1; i++) {
            if(dna.charAt(i) == 'A') {
                result += "T";
            } else if(dna.charAt(i) == 'T') {
                result += "A";
            } else if(dna.charAt(i) == 'C') {
                result += "G";
            } else if(dna.charAt(i) == 'G') {
                result += "C";
            }
        }
        return result;

    }
}
