package ehb.be.mopapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import ehb.be.mopapp.recyclerutilties.MopAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMopjes;
    private MopAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        

    }
}
