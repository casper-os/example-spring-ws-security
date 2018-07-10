package hello;

import hello.siteminder.MessageAcknowledgementType;
import hello.siteminder.OTAHotelAvailNotifRQ;
import hello.siteminder.OTAHotelAvailRQ;
import hello.siteminder.ObjectFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;

@Endpoint
public class HotelStreamEndpoint {
	private static final String NAMESPACE_URI = "http://www.opentravel.org/OTA/2003/05";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "OTA_HotelAvailNotifRQ")
	@ResponsePayload
	public JAXBElement<MessageAcknowledgementType> getCountry(@RequestPayload OTAHotelAvailNotifRQ otaHotelAvailNotifRQ) {
		ObjectFactory objectFactory = new ObjectFactory();
		return objectFactory.createOTAHotelAvailNotifRS(objectFactory.createMessageAcknowledgementType());
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "OTA_HotelAvailRQ")
	@ResponsePayload
	public JAXBElement<MessageAcknowledgementType> retrieveDataHotel(@RequestPayload OTAHotelAvailRQ otaHotelAvailRQ,
																	 MessageContext messageContext) {

		ObjectFactory objectFactory = new ObjectFactory();
		return objectFactory.createOTAHotelAvailNotifRS(objectFactory.createMessageAcknowledgementType());
	}
}
