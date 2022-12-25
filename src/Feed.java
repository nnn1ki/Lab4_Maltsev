import java.util.ArrayList;

public class Feed {
    private ArrayList<Government> governments = new ArrayList<>();

    public  void add(Government government){
        this.governments.add(government);
    }

    public void print(){
        for(Government government : governments){
            government.printInfo();
        }
    }


}
