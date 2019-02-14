package ehb.be.mopapp.model;

public class MopDAO {
    private static final MopDAO ourInstance = new MopDAO();

    public static MopDAO getInstance() {
        return ourInstance;
    }

    private MopDAO() {
    }
}
