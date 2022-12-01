package org.example;

import external.client.generated.HelloWorld;
import external.client.generated.HelloWorldImplService;
import external.client.generated.SayHelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HelloWorldImplService service = new HelloWorldImplService();
        HelloWorld helloWorldPort = service.getHelloWorldImplPort();
        String message = helloWorldPort.sayHelloWorld("Ali");
        System.out.println(message);
    }
}
