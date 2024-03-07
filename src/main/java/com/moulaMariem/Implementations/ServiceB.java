package com.moulaMariem.Implementations;

import com.moulaMariem.Interfaces.Service;
// the ServiceB class becomes an implementation of Service
public class ServiceB implements Service {
    public ServiceB() {
    }

    @Override
    public String getInfo() {
        return "ServiceB 's info";
    }
}
