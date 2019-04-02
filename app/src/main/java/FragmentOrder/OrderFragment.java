package FragmentOrder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.apoteksibalian.R;

public class OrderFragment extends Fragment {

    View v;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private int[] navLabel = {
            R.string.pending,
            R.string.process,
            R.string.sent,
            R.string.fail

    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.order_fragment, container, false);

        viewPager = v.findViewById(R.id.viewPager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager(), getContext());
        viewPager.setAdapter(adapter);
        tabLayout = v.findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);
        createTabIcon(tabLayout);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        Fragment childFragment = new ChildFragment();
//        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//        transaction.replace(R.id.child_fragment_container, childFragment).commit();

    }

    private void createTabIcon(TabLayout tabLayout) {
        for (int i = 0; i < tabLayout.getTabCount(); i++){
            LinearLayout tab = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.costum_tablayout, null);

            TextView tab_label = (TextView) tab.findViewById(R.id.nav_label);

            tab_label.setText(getResources().getString(navLabel[i]));
            tab_label.setText(navLabel[i]);
            tab_label.setTextColor(getResources().getColor(R.color.white));

            tabLayout.getTabAt(i).setCustomView(tab);
//            tabLayout.getTabAt(i).getIcon().setColorFilter(Color.parseColor("#000"), PorterDuff.Mode.SRC_IN);
        }
    }


}
