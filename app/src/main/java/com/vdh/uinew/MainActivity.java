package com.vdh.uinew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vdh.uinew.Fragment.BookFragment;
import com.vdh.uinew.Fragment.CaterogyFragment;
import com.vdh.uinew.Fragment.DownloadFragment;
import com.vdh.uinew.Fragment.SettingFragment;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.nav_bottom);
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_containner,new BookFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener listener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
            Fragment selectFragment=null;
            switch (item.getItemId()){
                case R.id.nav_book:
                    selectFragment=new BookFragment();
                    break;
                case R.id.nav_caterogy:
                    selectFragment=new CaterogyFragment();
                    break;
                case R.id.nav_download:
                    selectFragment=new DownloadFragment();
                    break;
                case R.id.nav_setting:
                    selectFragment=new SettingFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.layout_containner,selectFragment).commit();
            return true;
        }
    };

}