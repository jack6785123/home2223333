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

class Person {
    public String name;
    public String sex;
    public int attack;
    public String type;

    Person(String name1,String sex1,int attack1,String type1){
        name = name1;
        sex = sex1;
        attack = attack1;
        type = type1;

    }

    public void setName(String name1){
        name = name1;
    }

    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex1){
        sex = sex1;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack1){
        attack = attack1;
    }
    public String getType(){
        return type;
    }
    public void setType(String type1){
        type = type1;
    }
}