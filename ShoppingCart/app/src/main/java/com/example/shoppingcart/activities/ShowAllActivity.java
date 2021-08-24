package com.example.shoppingcart.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.shoppingcart.R;
import com.example.shoppingcart.adapters.ShowAllAdapter;
import com.example.shoppingcart.models.PopularProductsModel;
import com.example.shoppingcart.models.ShowAllModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ShowAllActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ShowAllAdapter showAllAdapter;
    List<ShowAllModel> showAllModellist;

    Toolbar toolbar;

    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        String type = getIntent().getStringExtra("type");

        toolbar = findViewById(R.id.show_all_toobar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        firebaseFirestore = FirebaseFirestore.getInstance();

        recyclerView = findViewById(R.id.show_all_rec);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        showAllModellist = new ArrayList<>();
        showAllAdapter = new ShowAllAdapter(this, showAllModellist);
        recyclerView.setAdapter(showAllAdapter);


        if (type == null || type.isEmpty()) {

            firebaseFirestore.collection("ShowAll")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel showAllModel = document.toObject(ShowAllModel.class);
                                    showAllModellist.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();


                                }
                            } else {

                                //Toast.makeText(getActivity(),""+task.getException(),Toast.LENGTH_LONG);

                            }
                        }
                    });

        }

        if (type != null && type.equalsIgnoreCase("man")) {
            firebaseFirestore.collection("ShowAll").whereEqualTo("type", "man")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel showAllModel = document.toObject(ShowAllModel.class);
                                    showAllModellist.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();


                                }
                            } else {

                                //Toast.makeText(getActivity(),""+task.getException(),Toast.LENGTH_LONG);

                            }
                        }
                    });

        }

        if (type != null && type.equalsIgnoreCase("woman")) {
            firebaseFirestore.collection("ShowAll").whereEqualTo("type", "woman")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel showAllModel = document.toObject(ShowAllModel.class);
                                    showAllModellist.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();


                                }
                            } else {

                                //Toast.makeText(getActivity(),""+task.getException(),Toast.LENGTH_LONG);

                            }
                        }
                    });

        }

        if (type != null && type.equalsIgnoreCase("watch")) {
            firebaseFirestore.collection("ShowAll").whereEqualTo("type", "watch")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel showAllModel = document.toObject(ShowAllModel.class);
                                    showAllModellist.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();


                                }
                            } else {

                                //Toast.makeText(getActivity(),""+task.getException(),Toast.LENGTH_LONG);

                            }
                        }
                    });

        }

        if (type != null && type.equalsIgnoreCase("camera")) {
            firebaseFirestore.collection("ShowAll").whereEqualTo("type", "camera")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel showAllModel = document.toObject(ShowAllModel.class);
                                    showAllModellist.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();


                                }
                            } else {

                                //Toast.makeText(getActivity(),""+task.getException(),Toast.LENGTH_LONG);

                            }
                        }
                    });

        }

        if (type != null && type.equalsIgnoreCase("kids")) {
            firebaseFirestore.collection("ShowAll").whereEqualTo("type", "kids")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel showAllModel = document.toObject(ShowAllModel.class);
                                    showAllModellist.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();


                                }
                            } else {

                                //Toast.makeText(getActivity(),""+task.getException(),Toast.LENGTH_LONG);

                            }
                        }
                    });

        }

        if (type != null && type.equalsIgnoreCase("shoes")) {
            firebaseFirestore.collection("ShowAll").whereEqualTo("type", "shoes")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel showAllModel = document.toObject(ShowAllModel.class);
                                    showAllModellist.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();


                                }
                            } else {

                                //Toast.makeText(getActivity(),""+task.getException(),Toast.LENGTH_LONG);

                            }
                        }
                    });

        }

    }


}