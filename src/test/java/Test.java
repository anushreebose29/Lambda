
@FunctionalInterface
interface Cab{
    public String bookCab(String sourse, String destination);
}

/*class Ola implements Cab{  //Instead of using this code direct lambda exoression can be used as lambda can be invoked duorectly through functionl interface.
    public void bookCab(){
        System.out.println("Ola cab is booked");
 }
}

public class Test {
    public static void main(String[] args) {
        Cab cab = ()->System.out.println("Ola cab is booked");
        cab.bookCab();
    }
}*/

/*
public class Test {
    public static void main(String[] args) {
        Cab cab = ( sourse, destination)->System.out.println("Ola cab is booked from" +sourse+  "to"  +destination);
        //String is the variable type so no need to mention that also
        cab.bookCab ( "Noida" ,  "G.Noida");
    }
}*/

public class Test {
    public static void main(String[] args) {
        Cab cab = ( sourse, destination)->{System.out.println("Ola cab is booked from" +sourse+  "to"  +destination);
        return("Price: Rs.500");};

        cab.bookCab ( "Noida" ,  "G.Noida");
    }
}