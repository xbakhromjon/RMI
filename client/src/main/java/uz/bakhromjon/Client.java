package uz.bakhromjon;

import uz.bakhromjon.remote.HelloWorldService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object from the RMI registry
            Registry registry = LocateRegistry.getRegistry();
            HelloWorldService remoteObj = (HelloWorldService) registry.lookup("helloWorldService");

            // Invoke remote methods on the server object
            String result = remoteObj.sayHello();
            System.out.println("Result from remote method: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

