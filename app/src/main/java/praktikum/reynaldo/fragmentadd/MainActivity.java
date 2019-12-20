package praktikum.reynaldo.fragmentadd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    //Instansiasi
    FrameLayout flayout01,flayout02, flayout03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flayout01 = findViewById(R.id.fragmentLayout1);
        flayout02 = findViewById(R.id.fragmentLayout2);
        flayout03 = findViewById(R.id.fragmentLayout3);

        flayout01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FirstFragment(), R.id.fragmentLayout1);
            }
        });

        flayout02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment(), R.id.fragmentLayout2);
            }
        });

        flayout03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new ThirdFragment(), R.id.fragmentLayout3);
            }
        });
    }

    private void loadFragment (Fragment fragment, Integer id) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit();
    }
}
