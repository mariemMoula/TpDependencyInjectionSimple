package com.moulaMariem;

import com.moulaMariem.Implementations.ClientA;
import com.moulaMariem.Implementations.ClientB;
import com.moulaMariem.Implementations.ServiceA;
import com.moulaMariem.Implementations.ServiceB;
import com.moulaMariem.Interfaces.Client;
import com.moulaMariem.Interfaces.Service;

public class Main {
    public static void main(String[] args) {
        //An implementation of Service is ServiceB is created and passed to ClientA
        Service service = new ServiceB();
        //example of constructor injection
        Client client = new ClientA(service);
        String info =client.doSomething();
        System.out.println("Clinet A giving info :"+info);
        //example of setter injection
        Client client2 = new ClientB();
        ((ClientB) client2).setService(new ServiceA());
        String info2=client2.doSomething();
        System.out.println("Clinet B giving info :"+info2);

    }
}