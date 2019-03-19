public class Identity {
    String name="Lilly";
    String surname="Baker";
    String streetname="1 Radcliffe way";
    String postcode="UB5 6HQ";
    String country="United Kingdom";
    String dob="24/09/2009";
    int age=30;
    static void name(){
        System.out.println("Lilly");
    }
    static void surname(){
        System.out.println("Baker");
    }
    static void streetname(){
        System.out.println("1 Radcliffe way");
    }
    static void postcode(){
        System.out.println("UB5 6HQ");
    }
    static void country(){
        System.out.println("United Kingdom");
    }
    static void dob(){
        System.out.println("24/09/2009");
    }
    static void age(){
        System.out.println(30);
    }
    public static void main(String[]args){
        name();
        surname();
        streetname();
        postcode();
        country();
        dob();
        age();
    }


}
