package Seminar3;

public class ErrorArray extends RuntimeException{
    public ErrorArray(String message){
        System.out.println(message);
    }
}