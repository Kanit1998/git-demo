public class CustomException {
    public void demo(){
        String password =null;
        if (password !=null) {
            System.out.println("Sucessfuly login");
        }else {
            throw new InvalidPasswordException("password can not be null");
        }
    }

    public static void main(String[] args) {
        new CustomException().demo();
    }
}
