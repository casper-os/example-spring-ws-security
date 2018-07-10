package hello;

import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.HashSet;
import java.util.Set;

@Component
public class PPSRSOApMessageHandler implements SOAPHandler<SOAPMessageContext> {
    // ... the rest of the code omitted

    @Override
    public Set<QName> getHeaders() {
        final QName securityHeader = new QName(
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
                "Security",
                "wsse");

        // ... "understand" the response, very complex logic goes here
        // ... "understand" the response, very complex logic goes here
        // ... "understand" the response, very complex logic goes here

        final HashSet headers = new HashSet();
        headers.add(securityHeader);

        // notify the runtime that this is handled
        return headers;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        return false;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }

    // ... the rest of the code omitted
}