public class stringformat {
    public static void main(String args[]){
        String name="Megha";
        String place="India";
        int age=18;
        String college="CMR";
        double gpa=9.5;
        boolean truth=false;
        String formatted=String.format("My name is %s.I am from %s.I am %d years old.I study at %s college.I have a GPA of %f.All of this is %b info",name,place,age,college,gpa,truth);
        System.out.println(formatted);

      
    }
}
