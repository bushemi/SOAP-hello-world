package client;

import server.HelloWorldServer;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:9876/hw?wsdl");
            QName qname = new QName("http://server/",
                    "HelloWorldServerImplService");

            Service service = Service.create(url, qname);

            HelloWorldServer server = service.getPort(HelloWorldServer.class);
            String name = "Igor";
            System.out.println(server.sayHello(name));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}