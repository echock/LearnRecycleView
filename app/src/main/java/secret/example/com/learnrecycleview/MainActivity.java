package secret.example.com.learnrecycleview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends Activity {
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = new RecyclerView(this);
        setContentView(rv);
        rv.setLayoutManager(new GridLayoutManager(this,3));
//        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rv.setAdapter(new MyAdapter());
    }


}
