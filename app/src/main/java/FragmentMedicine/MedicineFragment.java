package FragmentMedicine;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apoteksibalian.MedicineActivity.AddMedicineActivity;
import com.example.apoteksibalian.R;

public class MedicineFragment extends Fragment {

    View v;
    FloatingActionButton btn_add_med;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.medicine_fragment, container, false);

        btn_add_med = v.findViewById(R.id.btn_add_med);

        btn_add_med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddMedicineActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }


}
