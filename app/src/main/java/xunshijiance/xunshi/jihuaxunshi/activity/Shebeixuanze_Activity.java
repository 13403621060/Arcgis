package xunshijiance.xunshi.jihuaxunshi.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import base.BaseActivity;
import butterknife.Bind;
import butterknife.OnClick;
import dmn.arcgis.R;
import xunshijiance.xunshi.jihuaxunshi.zuoyewenben.zywb_sbbg_activity;

public class Shebeixuanze_Activity extends BaseActivity {

    @Bind(R.id.Img_All)
    ImageView ImgAll;
    @Bind(R.id.Btn_All)
    Button BtnAll;
    @Bind(R.id.Img_add)
    ImageView ImgAdd;

    private String Photourl;

    @Override
    public int getLayoutId() {
        return R.layout.activity_shebeixuanze_;
    }

    @Override
    protected void InitView() {
        super.InitView();
        setTitle("设备选择");

    }


    @OnClick({R.id.Img_All, R.id.Btn_All, R.id.Img_add})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Img_add:
                startActivity(new Intent(Shebeixuanze_Activity.this, zywb_sbbg_activity.class));
                break;
            case R.id.Img_All:
            case R.id.Btn_All:
                //customHelper.onClick("Text", getTakePhoto());
                break;
        }
    }

}
