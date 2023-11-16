package main.exceptions;

import org.apache.logging.log4j.Logger;

public class PhoneNumberNotValid extends Exception{
    public PhoneNumberNotValid(String e){
        super(e);
    }
}
