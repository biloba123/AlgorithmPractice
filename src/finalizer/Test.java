package finalizer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/5/9
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class Test {

    private final Object finalizerGuardian = new Object() {
        @Override
        protected void finalize() throws Throwable {
            Test.this.finalize();
        }
    };

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize");
        throw new RuntimeException("lalala");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child = null;


        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
//
//    public void fun(){
//        System.out.println("call fun");
//    }

}

class Child extends Test {
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("child finalize");
        } finally {
//            super.finalize();
        }
    }
}