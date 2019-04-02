package FragmentOrder;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

import com.example.apoteksibalian.R;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ViewPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }


    @Override
    public Fragment getItem(int i) {
        if (i == 0){
            return new PendingPage();
        }else if (i == 1){
            return new ProcessPage();
        }else if (i == 2){
            return new SentPage();
        }else {
            return new FailedPage();
        }
    }

    private FragmentManager getChildFragmentManager() {
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
