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
        userList.add(new ModelClass(R.drawable.cornie, "Cornie", "6:30 AM", "A good auntie", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.cmd, "Eustache", "8:45 AM", "A police officer", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.fefe, "Fefe", "1:25 PM", "A good sister", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.profile, "Martha", "3:40 PM", "How do you do?", "___________________________________________"));

        userList.add(new ModelClass(R.drawable.doine, "Doine", "9:22 AM", "A big bro", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.alex, "Alexa", "6:30 AM", "A good friend", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.emie, "Emie", "8:45 AM", "MUSO secretary", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.jonathan, "Jonathan", "1:25 PM", "A photographer", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.ketlove, "Ketlove", "3:40 PM", "A computer scientist", "___________________________________________"));

        userList.add(new ModelClass(R.drawable.ruth, "Ruth", "9:22 AM", "FNJD Member", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.shnider, "Schneider", "6:30 AM", "An UE student", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.dina, "Dina", "8:45 AM", "A cool sister", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.arold, "Arold", "1:25 PM", "A good adm", "___________________________________________"));
        userList.add(new ModelClass(R.drawable.celenie, "Celenie", "3:40 PM", "A strict teacher", "___________________________________________"));
    }
}
