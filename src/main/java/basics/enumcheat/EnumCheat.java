package basics.enumcheat;

/**
 * Created by bhakal on 16/11/2018.
 */
public enum EnumCheat {
    JAVA("java_enum"),PYTHON("python_enum"),scala("scala_enum");
    public final String proString;

    private EnumCheat(String p){
        this.proString = p;
    }
}
