package york;

public class Febric {

 int price = 5000;
   String school = "Khil para high School";


    public void makeCall() {
        System.out.println("call me please");
    }

    public String sendText(){

        return  school;
    }




    public static void main(String[] args) {

        Febric thread = new Febric();
        thread.makeCall();
        String name = "business is chemical items";
        System.out.println(name);
        int salary = 17000;
        System.out.println(salary);
        System.out.println(thread.price);
        System.out.println(thread.sendText());

    }


}
