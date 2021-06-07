package Day3;

class InvalidUsernameException extends RuntimeException{

    public InvalidUsernameException(){
        System.out.println("Invalid Username!");
    }
    public InvalidUsernameException(String s){
        System.out.println(s + " is an Invalid Username!");
    }

}

class User{
    private String username;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws InvalidUsernameException{
        if (username.contains("_")){
            throw new InvalidUsernameException(username);
        }
        this.username = username;
    }
}


public class ExceptionPrac {

    public static void main(String[] args) {
        User user1 = new User();
        try {
            user1.setUsername("Mark_");
        }catch(InvalidUsernameException ex){
            System.out.println("User cannot contain underscore '_'");
        }
    }

}
