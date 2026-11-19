public class stringfunctions {
    public static void main(String args[]){
        String n="Gajula Bhavya Megha";
        System.out.println(n.length());
        System.out.println(n.isEmpty());
        System.out.println(n.toUpperCase());
        System.out.println(n.toLowerCase());

        String a=new String("Megha");
        String b=new String("MEGHA");
        System.out.println(a.equalsIgnoreCase(b));

        String v="the sky is blue";
        System.out.println(v.replace("blue","red"));
        System.out.println(v.contains("blue"));
    }
}
