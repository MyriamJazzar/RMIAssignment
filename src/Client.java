import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
           MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
           Scanner s = new Scanner(System.in);
           String ch = s.nextLine();
           System.out.println(service.Reverse(ch));
           ch= s.nextLine();
           System.out.println(service.MinChar(ch));
           ch= scanner.nextLine();
           System.out.println(service.CaseChanger(ch));
           scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
