package giorgi.tsulaia.bog.ge.mbank.userpage;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.Calendar;


import giorgi.tsulaia.bog.ge.mbank.R;

public class UserPageActivity extends AppCompatActivity {
    private ImageView imageView;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);
        InitializeResources();

        setBackgroundImageToLayout();
    }
    private void InitializeResources(){
        imageView = findViewById(R.id.userpageImageViewID);
        tabLayout = findViewById(R.id.userPageTabLayoutID);
        viewPager = findViewById(R.id.userPageViewPagerID);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setBackgroundImageToLayout(){
        Calendar rightNow = Calendar.getInstance();
        int currHour = rightNow.get(Calendar.HOUR_OF_DAY);
        if(currHour>=18 && currHour<24){
            imageView.setImageResource(R.drawable.ic_evening_bg);
        } else {
            imageView.setImageResource(R.drawable.ic_day_bg);
        }
    }
}
