package xunshijiance.xunshi.jihuaxunshi.zuoyewenben;

import android.support.design.widget.FloatingActionButton;

import base.BaseFragment;
import butterknife.Bind;
import butterknife.OnClick;
import dmn.arcgis.R;

/**
 * Created by DMN on 2017/4/13.
 */

public class zywb_syxx_fragment extends BaseFragment {
    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Override
    public int getLayoutId() {
        return R.layout.zywb_syxx_layout;
    }


    @OnClick(R.id.fab)
    public void onViewClicked() {
        getFragmentManager().beginTransaction().replace(R.id.frame_content, new zywb_jbxx_fragment()).commit();
    }
}
