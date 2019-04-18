package server;

import javax.jws.WebService;

@WebService(endpointInterface = "server.HelloWorldServer")
public class HelloWorldServerImpl implements HelloWorldServer {

    public String sayHello(String name) {
        System.out.println("name = " + name);
        return "Hello, " + name + "! Hope you are doing well!";
    }

}