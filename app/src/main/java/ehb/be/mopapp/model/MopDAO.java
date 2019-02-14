package ehb.be.mopapp.model;

import java.util.ArrayList;

public class MopDAO {
    private static final MopDAO ourInstance = new MopDAO();
    private ArrayList<Mop> mopLijst = new ArrayList<>();

    public static MopDAO getInstance() {
        return ourInstance;
    }

    private MopDAO() {
        mopLijst.add(new Mop("Het is oud en het vliegt", "Een bejaardelaar") );
        mopLijst.add(new Mop("Het is rood en vliegt door de klas", "Een ongestelde vraag") );
        mopLijst.add(new Mop("Ya win some", "Jerusalem"));
    }

    public ArrayList<Mop> getMopLijst(){
        return mopLijst;
    }
}
