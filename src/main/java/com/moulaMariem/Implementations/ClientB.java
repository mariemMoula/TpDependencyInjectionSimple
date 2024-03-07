package com.moulaMariem.Implementations;

import com.moulaMariem.Interfaces.Client;
import com.moulaMariem.Interfaces.Service;
//Besides constructor injection,
// setter injection is used to pass the depending object to the dependent one
public class ClientB implements Client {
    Service service ;
    public ClientB() {
    }
    public void setService(Service service) {
        this.service = service;
    }
    @Override
    public String doSomething() {
        return service.getInfo();
    }
}
