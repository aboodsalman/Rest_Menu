package com.example.rest_menu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spn;
    private Button btn;
    private ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lst=findViewById(R.id.lst);
        spn=findViewById(R.id.spn);
        btn=findViewById(R.id.btn);
        bindSpinner();
        fillListView();
        btn.setOnClickListener(e->fillListView());
    }

    private void bindSpinner(){
        ProductMockupDA da = new ProductMockupDA();
        List<String> arr = Arrays.asList(da.getTypes());
        ArrayAdapter<String> spnAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_list, arr);
        spnAdapter.setDropDownViewResource(R.layout.spinner_list);
        spn.setAdapter(spnAdapter);
    }
    private void fillListView(){
        ProductMockupDA da = new ProductMockupDA();
        ArrayList<Product> arr = da.getProductsByType(spn.getSelectedItem().toString());
        ArrayAdapter<Product> listAdapter = new ArrayAdapter<Product>(this,
                R.layout.list_item, R.id.textView, arr);
        lst.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
    }
}