package FragmentMedicine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MedicineFragmentAdapter<onClickListener> extends RecyclerView.Adapter<MedicineFragmentAdapter.ViewHolder> {


//    private Context context;
//    private List<Medicine> medicineList;
//    private onClickListener onClickListener;
//
//    public MedicineFragmentAdapter(Context context, List<Medicine> medicineList) {
//        this.context = context;
//        this.medicineList = medicineList;
//    }

    @NonNull
    @Override
    public MedicineFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MedicineFragmentAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
