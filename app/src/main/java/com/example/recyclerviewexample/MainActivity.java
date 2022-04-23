package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);
        ArrayList <Contact> contacts = new ArrayList<>();

        contacts.add((new Contact("Margot Roby", "margoit@gmail.com", "https://images.pexels.com/photos/35537/child-children-girl-happy.jpg" )));
        contacts.add((new Contact("Cillian Murphy", "cillian@gmail.com", "https://i.pinimg.com/236x/a4/09/ba/a409bafef86390fd3abc2f6fc5cca437.jpg" )));
        contacts.add((new Contact("Saoirse Ronam", "saorse@gmail.com", "https://i.pinimg.com/236x/1e/5f/a0/1e5fa0547cf899b57953fe1430578ee4--baby-girl-pictures-child-models.jpg" )));
        contacts.add((new Contact("Ema Watson", "ema@gmail.com", "https://i.pinimg.com/originals/2b/ad/35/2bad357ac50f033b36f622645ce9d4ef.jpg" )));
        contacts.add((new Contact("Christian Bell", "christian@gmail.com", "https://i.pinimg.com/236x/6c/d5/03/6cd503bcd5b3e9acbf974dbebbc0b264--beautiful-little-girls-beautiful-children.jpg" )));
        contacts.add((new Contact("Margot Roby", "margoit@gmail.com", "https://parkdale-dental.com/wp-content/uploads/child-flexing-with-strong-healthy-teeth-and-enamel.jpg" )));
        contacts.add((new Contact("Cillian Murphy", "cillian@gmail.com", "https://www.orissapost.com/wp-content/uploads/2021/09/Young_boy_and_girl_measure_height_by_wall_scale_at_home_906ae777-e2fc-46dd-a6b2-e9f1bad47ef5.jpg" )));
        contacts.add((new Contact("Saoirse Ronam", "saorse@gmail.com", "https://cdn2.stylecraze.com/wp-content/uploads/2013/09/323_377263162.jpg" )));
        contacts.add((new Contact("Ema Watson", "ema@gmail.com", "https://uploads1.bundoo.com/wp-content/uploads/2015/01/What-kind-of-child-do-you-haveTHUMB-800x500.png" )));
        contacts.add((new Contact("Christian Bell", "christian@gmail.com", "https://2rdnmg1qbg403gumla1v9i2h-wpengine.netdna-ssl.com/wp-content/uploads/sites/3/2014/07/childListening-142019477_770x533-650x428.jpg" )));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);

        adapter.setContacts(contacts);
        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
        //also change to wrap content in contacts_list_itme.xml


    }
}