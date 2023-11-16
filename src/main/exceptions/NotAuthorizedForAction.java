package main.exceptions;

public class NotAuthorizedForAction extends Exception{
    public NotAuthorizedForAction(String e){
        super(e);
    }
}
