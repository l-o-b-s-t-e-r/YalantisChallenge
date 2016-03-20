package first.task.yalantis.yalantischallenge;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);

        CustomCard customCards[] = new CustomCard[] {
                new CustomCard(R.drawable.droid1,R.drawable.droid2),
                new CustomCard(R.drawable.droid3,R.drawable.droid4)
        };

        RVAdapter adapter = new RVAdapter(customCards, this);
        recyclerView.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();

            default: return super.onOptionsItemSelected(item);
        }
    }

    public void onEveryClick(View view) {
        Toast.makeText(this, view.getClass().getSimpleName(), Toast.LENGTH_SHORT)
                .show();
    }
}
