package com.example.quentinvdk.cardviewtp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.quentinvdk.cardviewtp.JavaClasses.Albums;
import com.example.quentinvdk.cardviewtp.JavaClasses.customAdapter.AlbumAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView albumRecyclerView;
    private LinearLayoutManager llc;
    private List<Albums> library= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*this.albumRecyclerView = (RecyclerView)findViewById(R.id.albumRecyclerView);
        this.llc= new LinearLayoutManager(this);
        this.albumRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.initApp();
        this.albumRecyclerView.setAdapter(new AlbumAdapter(this.library));*/
    }

    /**
     * Initialise les données
     */
    private void initApp()
    {

        this.library.add(new Albums("Undertale Original SoundTrack","Toby Fox",2015,"OST", R.drawable.undertale_ost));
        this.library.add(new Albums("Ride the lightening","Metallica",1987,"Metal", R.drawable.metallica));
        this.library.add(new Albums("Sur la route de Memphis","Eddy Mitchell",1976,"Country-Rock", R.drawable.eddy_mitchell));
        this.library.add(new Albums("Reijou Bara Zukan","Ali Project",2013,"J-pop", R.drawable.ali_project));

    }
}
