package gov.iti.jets.Exceptions;

import jakarta.xml.ws.WebFault;

@WebFault
public class InvalidFirstNameException extends Exception {
    public InvalidFirstNameException(String message) {

        super(message);
    }

}
