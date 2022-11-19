package ue.project.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        InitRecyclerView();
    }

    private void InitRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.beauchant, "Beauchant", "9:22 AM", "I'm coding", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.img1, "Nadime", "6:30 AM", "I'm a youtuber", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.img2, "Bro Code", "8:45 AM", "A confirmed youtuber", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.img3, "Boby", "1:25 PM", "How are you?", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.profile, "Martha", "3:40 PM", "How do you do?", "___________________________________________"));
    }
}
