package uz.bakhromjon.service;

import java.rmi.RemoteException;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello() throws RemoteException {
        return "Hello";
    }
}
