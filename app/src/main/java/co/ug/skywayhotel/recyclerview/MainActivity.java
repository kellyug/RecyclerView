package co.ug.skywayhotel.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mCountryNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing Bitmaps....");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/uganda/flag-jpg-large.jpg");
        mCountryNames.add("Uganda");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/tanzania/flag-jpg-large.jpg");
        mCountryNames.add("Tanzania");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/rwanda/flag-jpg-large.jpg");
        mCountryNames.add("Rwanda");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/burundi/flag-jpg-large.jpg");
        mCountryNames.add("Burundi");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/kenya/flag-jpg-large.jpg");
        mCountryNames.add("Kenya");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/zambia/flag-800.png");
        mCountryNames.add("Zambia");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/united-states-of-america/flag-jpg-large.jpg");
        mCountryNames.add("United States of America");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/congo-republic-of-the/flag-jpg-large.jpg");
        mCountryNames.add("Congo");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/zimbabwe/flag-jpg-large.jpg");
        mCountryNames.add("Zimbabwe");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/togo/flag-jpg-large.jpg");
        mCountryNames.add("Togo");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/canada/flag-jpg-large.jpg");
        mCountryNames.add("Canada");

        mImageUrls.add("https://cdn.countryflags.com/thumbs/united-kingdom/flag-jpg-large.jpg");
        mCountryNames.add("United Kingdom");

        initRecyclerView();



    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerview: initRecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mCountryNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
