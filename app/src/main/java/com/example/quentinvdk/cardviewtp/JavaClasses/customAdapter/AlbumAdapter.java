package com.example.quentinvdk.cardviewtp.JavaClasses.customAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quentinvdk.cardviewtp.JavaClasses.Albums;
import com.example.quentinvdk.cardviewtp.R;

import java.util.List;

/**
 * Created by quentinvdk on 01/10/16.
 */

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    private List<Albums> albumsLibrary;

    public AlbumAdapter(List<Albums> albumsLibrary) {
        this.albumsLibrary = albumsLibrary;
    }

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cardview,parent,false);
        return new AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlbumViewHolder holder, final int position) {
       /* Albums album = albumsLibrary.get(position);
        holder.bind(album);*/
      /*  holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),albumsLibrary.get(position).toString(),Toast.LENGTH_LONG).show();
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return albumsLibrary.size();
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageHolder;
        private TextView nameView,authorView,typeView,yearView;
        public AlbumViewHolder(View itemView) {
            super(itemView);

            //c'est ici que l'on fait nos findView

  /*          this.nameView = (TextView) itemView.findViewById(R.id.name);
            this.imageHolder = (ImageView) itemView.findViewById(R.id.imageHolder);
            this.authorView = (TextView) itemView.findViewById(R.id.author);
            this.yearView = (TextView) itemView.findViewById(R.id.yearAlbum);
            this.typeView = (TextView) itemView.findViewById(R.id.genre);*/


        }

        //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
        public void bind(Albums album){
           /* this.nameView.setText(album.getName());
            this.authorView.setText(album.getArtist());
            this.typeView.setText(album.getType());
            this.yearView.setText(String.valueOf(album.getYear()));
            this.imageHolder.setImageResource(album.getCoverID());
            this.imageHolder.setScaleType(ImageView.ScaleType.CENTER_CROP);*/
        }
    }





}
