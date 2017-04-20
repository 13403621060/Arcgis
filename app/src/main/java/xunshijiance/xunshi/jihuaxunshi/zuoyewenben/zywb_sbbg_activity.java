package xunshijiance.xunshi.jihuaxunshi.zuoyewenben;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import base.BaseActivity;
import butterknife.Bind;
import dmn.arcgis.R;

/**
 * Created by 哒哒哒 on 2017/4/17.
 */

public class zywb_sbbg_activity extends BaseActivity {

    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.nav_sb_view)
    NavigationView navView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_zywb_sbbg;
    }

    @Override
    protected void InitView() {
        super.InitView();
        setTitle("设备变更");
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new sbbg_jdw_fragment()).commit();
        mToolbar.setTitle("S" +
                "");
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                mToolbar.setTitle(item.getTitle());
                int id = item.getItemId();
                switch (id) {
                    case R.id.sbbg_xhzz:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new sbbg_xhzz_fragment()).commit();
                        break;
                    case R.id.sbbg_jdw:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new sbbg_jdw_fragment()).commit();
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
