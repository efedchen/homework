package UsageOOP;


public class InnerClasses {
        public class InnerClasses1 { // inner class
            public  void job() {
                System.out.println("innerClasses1 Job");
            }
        }
        public static class InnerClasses2 { //static nested class
            public void job() {
                System.out.println("innerClasses2 Job");
            }
        }
}

class Main {
    public static void main(String[] args) {
        InnerClasses.InnerClasses2 inCL = new InnerClasses.InnerClasses2();
        inCL.job();

        InnerClasses IC = new InnerClasses();
        InnerClasses.InnerClasses1 InnerClasses1 = IC.new InnerClasses1();
        InnerClasses1.job();
    }
}