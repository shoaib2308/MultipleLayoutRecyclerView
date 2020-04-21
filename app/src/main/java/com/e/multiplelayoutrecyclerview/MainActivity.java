package com.e.multiplelayoutrecyclerview;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;

        import static com.e.multiplelayoutrecyclerview.ModelClass.AD_LAYOUT;
        import static com.e.multiplelayoutrecyclerview.ModelClass.IMAGE_LAYOUT;
        import static com.e.multiplelayoutrecyclerview.ModelClass.USER_INFO_LAYOUT;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john deo","i m user body user info layout"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.adspopup));
        modelClassList.add(new ModelClass(AD_LAYOUT,"hello"));
        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john deo","i m user body user info layout"));
        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john deo","i m user body user info layout"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.adspopup));
        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john deo","i m user body user info layout"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.adspopup));
        modelClassList.add(new ModelClass(AD_LAYOUT,"hello"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.adspopup));
        modelClassList.add(new ModelClass(AD_LAYOUT,"hello"));
        modelClassList.add(new ModelClass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"john deo","i m user body user info layout"));
        modelClassList.add(new ModelClass(IMAGE_LAYOUT,R.drawable.adspopup));



        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
