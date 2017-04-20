package xunshijiance.xunshi.jihuaxunshi.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.gigamole.navigationtabstrip.NavigationTabStrip;

import adapter.HomePagerAdapter;
import base.BaseActivity;
import butterknife.Bind;
import dmn.arcgis.R;
import xunshijiance.xunshi.jihuaxunshi.fragment.daijieshou_Fragment;
import xunshijiance.xunshi.jihuaxunshi.fragment.jingxingzhong_Fragment;
import xunshijiance.xunshi.jihuaxunshi.fragment.yiwancheng_Fragment;

/**
 * Created by DMN on 2017/4/10.
 */

public class Jihua_Activity extends BaseActivity {
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.nts_center)
    NavigationTabStrip ntsCenter;
    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Override
    public int getLayoutId() {
        return R.layout.xunshi_jihua_layout;
    }

    @Override
    protected void InitView() {
        super.InitView();

        setSupportActionBar(toolbar);
        setTitle("计划巡视");
        HomePagerAdapter homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager());
        homePagerAdapter.add(new daijieshou_Fragment(), "待接受");
        homePagerAdapter.add(new jingxingzhong_Fragment(), "进行中");
        homePagerAdapter.add(new yiwancheng_Fragment(), "已完成");
        viewPager.setAdapter(homePagerAdapter);
        ntsCenter.setViewPager(viewPager);

    }

}
