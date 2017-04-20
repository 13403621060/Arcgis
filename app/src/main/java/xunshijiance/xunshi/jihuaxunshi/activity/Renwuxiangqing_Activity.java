package xunshijiance.xunshi.jihuaxunshi.activity;

import android.content.Intent;
import android.widget.ImageView;

import base.BaseActivity;
import butterknife.Bind;
import butterknife.OnClick;
import dmn.arcgis.R;

public class Renwuxiangqing_Activity extends BaseActivity {


    @Bind(R.id.img_shebeixuanze)
    ImageView imgShebeixuanze;

    @Override
    public int getLayoutId() {
        return R.layout.activity_renwuxiangqing_;
    }

    @Override
    protected void InitView() {
        super.InitView();
        setTitle("任务详情");

    }

    @OnClick(R.id.img_shebeixuanze)
    public void onViewClicked() {
        Intent intent = new Intent(Renwuxiangqing_Activity.this, Shebeixuanze_Activity.class);
        startActivity(intent);
    }
}
