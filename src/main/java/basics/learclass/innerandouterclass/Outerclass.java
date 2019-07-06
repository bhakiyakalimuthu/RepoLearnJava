package basics.learclass.innerandouterclass;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-09
 */
public class Outerclass {

    private static String msg = "I'm a outerclass static field ";
     static class StaticInnerClass{
        public void printmsg(){
            System.out.println(msg + " from static inner class");
        }
    }

    class NormalInnerClass{
        public void printmsg(){
            System.out.println(msg + " from normal inner class");
        }
    }

    public void printmsg(){
        Outerclass.StaticInnerClass sic = new Outerclass.StaticInnerClass();
        Outerclass.NormalInnerClass nic = new Outerclass().new NormalInnerClass();

        sic.printmsg();
        nic.printmsg();
    }

    private static void main(String[] args) {
        Outerclass outerclass = new Outerclass();
        outerclass.printmsg();
    }
}
