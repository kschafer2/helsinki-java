import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changeList;

    public Changer() {
        changeList = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changeList.add(change);
    }

    public String change(String characterString) {
        for(Change change : changeList)
            characterString = change.change(characterString);
        return characterString;
    }

}

