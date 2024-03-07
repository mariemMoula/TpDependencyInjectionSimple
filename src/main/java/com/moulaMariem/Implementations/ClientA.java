package com.moulaMariem.Implementations;

import com.moulaMariem.Interfaces.Client;
import com.moulaMariem.Interfaces.Service;

public class ClientA  implements Client {
//The class ClientA is now implementing the Client interface
// It uses the Service interface instead of a concrete class

    //we re declaring a service object
    Service service;
    //We will be using the constructor to pass (inject) thye actual service implementation
    public ClientA(Service service) {
       // ClientA only knows that the injected object is of type Service
        this.service = service;
    }
    //The class ClientA is now not depending on any specific implementations of A specific service class .
    @Override
    public String  doSomething() {
        return service.getInfo();

    }
}
