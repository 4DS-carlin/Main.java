public class Main {
    public static void main(String[] args) {
        Aliante al=new Aliante("XR3", 13);
        Aereomotore al1=new Aereomotore("XR3", 13);
        System.out.println(al.isSuperior(al1));
        System.out.println(al.equals(al1));
        System.out.println(al.toString());
        System.out.println(al1.toString());
    }
}