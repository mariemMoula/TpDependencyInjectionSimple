package com.moulaMariem.Implementations;

import com.moulaMariem.Interfaces.Service;
// the ServiceA class becomes an implementation of Service

public class ServiceA implements Service {
    public ServiceA() {
    }

    @Override
    public String getInfo() {
        return "ServiceA's Info";
    }
}
