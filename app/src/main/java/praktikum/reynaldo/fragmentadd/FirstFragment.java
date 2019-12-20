package praktikum.reynaldo.fragmentadd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {
    //Inflater yang digunakan untuk menempelkan fragmen ke layout yang diinginkan.
    //instansiasi
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_first_fragment, container, false);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.getVisibility();
            }
        });

        return view;
    }
}
