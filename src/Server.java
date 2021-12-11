import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
    
    @override
    public String Reverse(String ch){
        StringBuilder strb = new StringBuilder(ch);
		ch = strb.reverse().toString();
        return ch;
    }
    
    @override 
    public char MinChar(String ch){
        char c = ch.charAt(0);
        for(int i = 1; i < ch.length(); i++)
        {
            if(ch.charAt(i)< c)
            {
                c = ch.charAt(i);
            }
        }
        return c;
    }
    
    @override 
    public String CaseChanger(String ch){
        int chLen = ch.length();
        if (ch == null || chLen == 0) {
            return ch;
        }
        StringBuffer buffer = new StringBuffer(chLen);

        for (int i = 0; i < chLen; i++) {
            char c = ch.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            buffer.append(c);
        }
        return buffer.toString();
    }
   
    }
    
}
