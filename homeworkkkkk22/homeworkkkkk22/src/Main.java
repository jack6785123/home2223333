import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String s[] = new String[2];
        s[0] = "0";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        for (int i = 0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
//==============================================
        ArrayList<Person> aaa = new ArrayList<>();
        Person a=new Person("pig","boy",123,"animal");
        Person b=new Person("apple","girl",111,"person");
        aaa.add(a);
        aaa.add(b);

        aaa.get(0).setName("456");

        aaa.remove(0);

//        for (int i = 0;i <100;){
//            System.out.println("456");
//            i= 1000;
//        }

        boolean bool = true;
        while (bool) {
            System.out.println("1");
            bool = false;
        }


    }
}
