/**
 * HelloworldServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ismail;

public class HelloworldServiceLocator extends org.apache.axis.client.Service implements com.ismail.HelloworldService {

    public HelloworldServiceLocator() {
    }


    public HelloworldServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloworldServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Helloworld
    private java.lang.String Helloworld_address = "http://localhost:8081/SimpleSoapproject/services/Helloworld";

    public java.lang.String getHelloworldAddress() {
        return Helloworld_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloworldWSDDServiceName = "Helloworld";

    public java.lang.String getHelloworldWSDDServiceName() {
        return HelloworldWSDDServiceName;
    }

    public void setHelloworldWSDDServiceName(java.lang.String name) {
        HelloworldWSDDServiceName = name;
    }

    public com.ismail.Helloworld getHelloworld() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Helloworld_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloworld(endpoint);
    }

    public com.ismail.Helloworld getHelloworld(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ismail.HelloworldSoapBindingStub _stub = new com.ismail.HelloworldSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloworldWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloworldEndpointAddress(java.lang.String address) {
        Helloworld_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ismail.Helloworld.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ismail.HelloworldSoapBindingStub _stub = new com.ismail.HelloworldSoapBindingStub(new java.net.URL(Helloworld_address), this);
                _stub.setPortName(getHelloworldWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Helloworld".equals(inputPortName)) {
            return getHelloworld();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ismail.com", "HelloworldService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ismail.com", "Helloworld"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Helloworld".equals(portName)) {
            setHelloworldEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
