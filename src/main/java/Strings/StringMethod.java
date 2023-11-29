package Strings;

public class StringMethod {
    public static void main(String[] args) {
        String a="TANMAY";
        System.out.println(a.toLowerCase());

        String b="tanmay";
        System.out.println(b.toUpperCase());

        String c="Tanmay";
        String d="Vaidya";
        System.out.println(d.concat(c));

        String e="Tanmay";
        System.out.println(e.length());

        String f="   Tanmay   ";
        System.out.println(f.trim());

        String g="";
        System.out.println(g.isEmpty());

        String h="Tanmay";
        System.out.println(h.charAt(2));

        String i="Tannmay";
        System.out.println(i.indexOf('n'));

        String j="Tanmay";
        System.out.println(j.replace('y','s'));


    }
}
