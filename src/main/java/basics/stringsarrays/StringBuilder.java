package basics.stringsarrays;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-05
 */
public class StringBuilder {
    static final int BUFFER_MULTIPLIER = 2;
    static final int BUFFER_INIT_SIZE = 16;

    int size;
    char[] string;
    int count;
    public StringBuilder(){
        this.size = BUFFER_INIT_SIZE;
        this.string = new char[BUFFER_INIT_SIZE];
    }

    public StringBuilder(int value){
        this.size = value;
        this.string = new char[value];
    }

    public void append(String str){
        if(isResizeRequired(str.length())){
            resize();
            addString(str);
            updateCount(this.size);
        }
    }

    private boolean isResizeRequired(int len){
        return (this.string.length + count < len ? true :false);
    }

    private void resize(){
        int oldSize = this.size;
        this.size = oldSize * BUFFER_MULTIPLIER;
        char[] newStr = new char[this.size];
        System.arraycopy(this.string,0,newStr,0,oldSize);
        this.string = newStr;
    }
    private void updateCount(int count){
        this.count = this.count + count;
    }

    private void addString(String string){
        System.arraycopy(string.toCharArray(),0,this.string,this.count, string.length());
    }
}
