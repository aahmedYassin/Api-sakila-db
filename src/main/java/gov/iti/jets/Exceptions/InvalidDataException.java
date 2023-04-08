package gov.iti.jets.Exceptions;

import jakarta.xml.ws.WebFault;

@WebFault
public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {

        super(message);
    }

}
