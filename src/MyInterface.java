import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
  
  public String reverse(String ch) throws RemoteException;
  public char minchar(String ch) throws RemoteException;
  public String 

}
