package br.com.movieflix.exception;

public class UsernameOrPasswordInvaLidException extends RuntimeException {
    public UsernameOrPasswordInvaLidException(String mensage){
        super(mensage);
    }
}
