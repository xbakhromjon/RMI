package uz.bakhromjon;

import uz.bakhromjon.service.HelloWorldService;
import uz.bakhromjon.service.HelloWorldServiceImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws RemoteException {

        HelloWorldServiceImpl helloWorldService = new HelloWorldServiceImpl();
        HelloWorldService stub = (HelloWorldService) UnicastRemoteObject.exportObject(helloWorldService, 0);

        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("helloWorldService", stub);
    }
}
