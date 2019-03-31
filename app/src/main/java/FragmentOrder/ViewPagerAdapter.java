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
            Fragment PendingPage = new PendingPage();
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            transaction.add(R.id.viewPager_id,PendingPage).commit();
            return new PendingPage();
        }else if (i == 1){
            Fragment ProcessPage = new ProcessPage();
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            transaction.add(R.id.viewPager_id,ProcessPage).commit();
            return new ProcessPage();
        }else if (i == 2){
            Fragment SentPage = new SentPage();
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            transaction.add(R.id.viewPager_id,SentPage).commit();
            return new SentPage();
        }else {
            Fragment FailedPage = new FailedPage();
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            transaction.add(R.id.viewPager_id,FailedPage).commit();
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
