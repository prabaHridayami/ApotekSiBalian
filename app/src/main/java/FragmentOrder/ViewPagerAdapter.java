package FragmentOrder;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ViewPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }


    @Override
    public Fragment getItem(int i) {
        if (i == 0){
            return new BelumLunasPage();
        }else if (i == 1){
            return new LunasPage();
        }else if (i == 2){
            return new DiprosesPage();
        }else if (i == 3){
            return new MenungguPage();
        }else if (i == 4){
            return new DikirimPage();
        }else if (i == 5){
            return new SampaiPage();
        }else if (i == 6){
            return new SelesaiPage();
        }else {
            return new DitolakPage();
        }
    }

    private FragmentManager getChildFragmentManager() {
        return null;
    }

    @Override
    public int getCount() {
        return 8;
    }
}
