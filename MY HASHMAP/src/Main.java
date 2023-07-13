import java.util.Scanner;
import java.util.HashMap;

class person{
    public person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    int id;
    String name;
    int age;
    String address;

    public String print_detail(){
        String detail="name: "+name+"---\tage: "+age+"---\taddress: "+address;
        return detail;
    }
}
//======================================================================================================================
public class Main {
    public static void main(String[] args) {

        /*HashMap<Integer,String> table1=new HashMap<>(10,0.9f);
        table1.put(10,"a");
        table1.put(11,"b");
        table1.put(12,"c");
        table1.put(13,"d");
        table1.put(14,"e");
        table1.put(15,"f");
        table1.put(16,"g");
        table1.put(17,"h");
        table1.put(18,"i");
        table1.put(18,"j");
        table1.put(20,"k");
        table1.remove(13);
        System.out.println(table1.get(20));
        String num=table1.get(12);
        System.out.println(table1.hashCode());
        for(Integer key: table1.keySet()){
            System.out.println(key.hashCode()+"\t"+key+"\t"+table1.get(key));
        }
        table1.clear();*/


        Scanner scanner=new Scanner(System.in);
        HashMap<Integer,person> table2=new HashMap<>();

        person p1=new person(100,"sithum",23,"qwe");
        table2.put(100,p1);
        person p2=new person(101,"koshal",34,"asd");
        table2.put(101,p2);
        person p3=new person(103,"nimanthi",12,"zxc");
        table2.put(103,p3);
        int attemp=0,left=3;
        boolean correct=false;

        while(attemp<3 &&correct==false) {
            System.out.print("Enter your id : ");
            int id = scanner.nextInt();
            attemp++;
            left--;
            try {
                System.out.println(table2.get(id).print_detail());
                correct=true;
            } catch (Exception e) {
                System.out.println("\n please Enter a valid id number.\nYou have "+left+" attemps left.try again\n");
            }
        }
    if(correct==true){
        System.out.println("thank you");
    }else{
        System.out.println("Your account has blocked.");
    }

    }
}