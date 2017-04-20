package activity;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;

import adapter.HomePagerAdapter;
import base.BaseActivity;
import butterknife.Bind;
import dmn.arcgis.R;


public class MainActivity extends BaseActivity {

    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.bottomNavigation)
    BottomNavigationView bottomNavigation;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    protected void InitView() {
        mToolbar.setVisibility(View.GONE);
        InitFragment();
        InitBottomNavigationView();

    }


    private void InitFragment() {
        HomePagerAdapter homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager());
        homePagerAdapter.add(new AddLayer(), "首页");

        viewPager.setAdapter(homePagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                bottomNavigation.selectTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void InitBottomNavigationView() {
        int[] image = {R.drawable.ic_map
        };
        int[] color = {ContextCompat.getColor(this, R.color.firstColor)
        };
        bottomNavigation.setUpWithViewPager(viewPager, color, image);
        bottomNavigation.isColoredBackground(false);
    }


}
