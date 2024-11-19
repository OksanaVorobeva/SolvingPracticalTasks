package com.exampl.taskGuru.logicom;

public abstract class Logistics {
    public void  doLogistics(){
        Transport transport= creatTransport();
        transport.deliver();
    }
    public abstract  Transport creatTransport();
}
