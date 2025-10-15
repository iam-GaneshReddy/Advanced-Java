package Youtube.abhishekverma.ExceptionHandling;

//custom exception-Checkced Exception

 class InvalidAgeException extends Exception {
  public InvalidAgeException(String msg)
  {
      super(msg);
  }
  public InvalidAgeException()
  {
      super();
  }

}

public class CustomCheckedException {
     public static void validateAge(int age) throws InvalidAgeException{
         if(age<18)
             throw new InvalidAgeException("Age must be greater than 18");
     }

    public static void main(String[] args) {
        try{
            validateAge(15);
        }
        catch(InvalidAgeException e) {
            System.out.println(e);
        }

    }

}
