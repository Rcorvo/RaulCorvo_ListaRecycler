package net.example.listarecycler;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Raul Corvo on 03/11/2016.
 */

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView = null;

    public RecyclerView getRecyclerView(){
        if(recyclerView == null){
            synchronized (RecyclerViewActivity.class){
                if(recyclerView == null){
                    recyclerView = new RecyclerView(this);
                    recyclerView.setHasFixedSize(true);
                    setContentView(recyclerView);
                }
            }
        }
        return recyclerView;
    }

    //Metodo que aplica el adaptador que le pasemos por parámetro
    public void setAdapter(RecyclerView.Adapter adapter){
        getRecyclerView().setAdapter(adapter);
    }

    //Metodo que nos devuelve el adaptador que tenga el pripio RecyclerView
    public RecyclerView.Adapter getAdapter(){
        return(getRecyclerView().getAdapter());
    }

    public void setLayoutManager(RecyclerView.LayoutManager manager){
        getRecyclerView().setLayoutManager(manager);
    }
}
