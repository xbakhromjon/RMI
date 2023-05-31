package uz.bakhromjon.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorldService extends Remote {
    String sayHello() throws RemoteException;
}
