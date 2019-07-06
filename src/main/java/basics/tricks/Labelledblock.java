package basics.tricks;


public class Labelledblock {
    public static void main(String[] args) {
        Labelledblock.labelledBlock();
    }

    private static String labelledBlock(){
        exit_:
        for (int i=0; i < 2;i++){
            System.out.println("loop i :"+ i);
            for (int j=0; j < 2;j++){
                System.out.println("loop j :" + j);
                if(j==1){
                    break exit_;
                }

            }
        }
        return "hello";
    }
}
