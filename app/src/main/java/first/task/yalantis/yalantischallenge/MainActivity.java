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

    //drawable-hdpi/rectangle_rounded.xml
    //Change to dp             <corners android:radius="25.0dip" />

    //>first.task.yalantis.yalantischallenge.MainActivity
    //raw 15, 16 - convert to local (edited)
    //raw 37 add check if actionbar is null

    //>first.task.yalantis.yalantischallenge.CustomCard
    // shouldn't use custom card to show 2 ImageViews on screen

    //also remove first.task.yalantis.yalantischallenge.ApplicationTest and first.task.yalantis.yalantischallenge.ExampleUnitTest as they are redundant

    //>layout/activity_main.xml
    //styles aren't used - a lot of similar views with same code is bad practice.

    //first.task.yalantis.yalantischallenge.RVAdapter
    // private fields should be named according to Google Code Style docs

    //app/src/main/AndroidManifest.xml
    //raw 9 support for RTL layouts is on, but not using layout_marginStart and layout_marginEnd in layout/card_captioned_image.xml. Better turn RTL support off (edited)

    //General UI mistake is that your project's color scheme doesn't match example's one

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
