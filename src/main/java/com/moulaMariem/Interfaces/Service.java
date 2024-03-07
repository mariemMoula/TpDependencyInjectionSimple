package com.moulaMariem.Interfaces;

//Interfaces are used to define the types of the classes
// so its implementation can be changed later.
public interface Service {
    //the Service interface is used instead of a concrete class
    // the actual Service’s implementation is injected to this class via its constructor or setters
    String getInfo();
}
