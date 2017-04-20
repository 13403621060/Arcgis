package xunshijiance.xunshi.jihuaxunshi.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import base.BaseActivity;
import butterknife.Bind;
import dmn.arcgis.R;
import xunshijiance.xunshi.jihuaxunshi.zuoyewenben.zywb_jbxx_fragment;
import xunshijiance.xunshi.jihuaxunshi.zuoyewenben.zywb_syxx_fragment;

/**
 * Created by DMN on 2017/4/13.
 */

public class zuoyewenben_Activity extends BaseActivity {
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.nav_view)
    NavigationView navView;

    @Override
    public int getLayoutId() {
        return R.layout.zuoyewenben_layout;
    }

    @Override
    protected void InitView() {
        super.InitView();
        setTitle("作业文本");
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new zywb_syxx_fragment()).commit();
        mToolbar.setTitle("索引信息");
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                mToolbar.setTitle(item.getTitle());
                int id = item.getItemId();
                switch (id) {
                    case R.id.zy_syxx:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new zywb_syxx_fragment()).commit();
                        break;
                    case R.id.zy_jbxx:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new zywb_jbxx_fragment()).commit();
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

}
