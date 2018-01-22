public class StringEquality {

    static public void main(String[] args){

        String str = "world";
        String str2 = new String("world");

        if(str == "world") {
            System.out.println(true);
            System.out.println(str.hashCode());
        }

        if(str == str2) {
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println(str2.hashCode());
        }

        if(str.equals(new String("world"))) {
            System.out.println(true);
            System.out.println(str.hashCode());
            System.out.println(str2.hashCode());
        }else{
            System.out.println(false);
        }
    }
}
