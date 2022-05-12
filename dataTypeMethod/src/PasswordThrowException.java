public class PasswordThrowException {
       public void test() {
            String password = null;
            String username = "kanit@gmail.com";
            if (password != null) {
                System.out.println("login Succesfully");

            }
            if (username == null) {
                throw new DataException("user name is not define");
            } else {
                throw new InvalidPasswordException("password can not be Null");
            }
        }

        public static void main(String[] args) {
            new PasswordThrowException().test();
        }
    }

