package FragmentOrder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.apoteksibalian.DetailorderActivity.DetailOrderActivity;
import com.example.apoteksibalian.R;

public class BelumLunasPage extends Fragment {

    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.belum_lunas_page,container,false);

        Button btn_detail = v.findViewById(R.id.btn_detail);

        btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DetailOrderActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}
