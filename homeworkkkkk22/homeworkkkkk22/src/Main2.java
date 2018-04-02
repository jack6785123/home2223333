import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Person> array = new ArrayList<>();
        boolean bool = true;
        while (bool){
            System.out.println("功能列表");
            System.out.println("1新增角色");
            System.out.println("2修改角色");
            System.out.println("3刪除角色");
            System.out.println("4結束");
            switch (scn.nextInt()){
                case 1:
                    System.out.println("請依序輸入姓名,性別,攻擊力,屬性");
                    Person a = new Person(scn.next(),scn.next(),scn.nextInt(),scn.next());
                    array.add(a);
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case  4:
                    bool = false;
                    break;
            }

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