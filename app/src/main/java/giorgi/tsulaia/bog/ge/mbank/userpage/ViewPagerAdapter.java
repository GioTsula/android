package giorgi.tsulaia.bog.ge.mbank.userpage;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.CardView;

import giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities.AssetsAndLiabilitiesFragment;
import giorgi.tsulaia.bog.ge.mbank.userpage.cards.CardsFragment;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.assetsandliabilitiesmodel.AssetsAndLiabilities;
import giorgi.tsulaia.bog.ge.mbank.userpage.transactions.TransactionsFragment;
import giorgi.tsulaia.bog.ge.mbank.userpage.userprofile.ProfileFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0) {
            return ProfileFragment.newInstance();
        } else if(i==1){
            return AssetsAndLiabilitiesFragment.newInstance();
        } else if(i == 2) {
            return TransactionsFragment.newInstance();
        } else {
            return CardsFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String header;
        if (position == 0) {
            header = "პროფილი";
        } else  if(position == 1) {
            header = "აქტივები";
      } else if (position == 2){
           header = "გადახდების ისტორია";
       } else {
           header = "ბარათები";
        }
        return header;
    }
}
