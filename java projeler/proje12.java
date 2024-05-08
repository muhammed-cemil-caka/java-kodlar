public class proje12 {
    public static void main(String[] args) {
        String mesaj="bugün hava çok güzel";
        System.out.println(mesaj);
        System.out.println(mesaj.length());
        System.out.println(mesaj.charAt(4));
        System.out.println(mesaj.concat(" yaşasin!"));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("e"));
        System.out.println(mesaj.replace(" ", "-"));
        System.out.println(mesaj.substring(5));
        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
}
}
