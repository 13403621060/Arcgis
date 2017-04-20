package xunshijiance.xunshi.jihuaxunshi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.mingle.entity.MenuEntity;
import com.mingle.sweetpick.DimEffect;
import com.mingle.sweetpick.SweetSheet;
import com.mingle.sweetpick.ViewPagerDelegate;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import base.BaseActivity;
import butterknife.Bind;
import butterknife.OnClick;
import dmn.arcgis.R;

/**
 * Created by DMN on 2017/4/13.
 */

public class Jihuaxiangqing_Activity extends BaseActivity {
    @Bind(R.id.Card_zuoyewenben)
    CardView CardZuoyewenben;
    @Bind(R.id.rl)
    RelativeLayout rl;

    private SweetSheet mSweetSheet2;
    public static final int REQUEST_CODE = 111;

    @Override
    public int getLayoutId() {
        return R.layout.jihuaxiangqiang_layout;
    }

    @Override
    protected void InitView() {
        super.InitView();
        setTitle("计划详情");
        setupViewpager();
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                mSweetSheet2.toggle();
                return false;

            }
        });

//        TimePickerView pvTime = new TimePickerView.Builder(this, new TimePickerView.OnTimeSelectListener() {
//            @Override
//            public void onTimeSelect(Date date, View v) {//选中事件回调
//                //tvTime.setText(getTime(date));
//            }
//        }).build();
//        pvTime.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.edit, menu);
        return true;
    }

    private void setupViewpager() {
        mSweetSheet2 = new SweetSheet(rl);
        mSweetSheet2.setMenuList(R.menu.menu_sweet);
        mSweetSheet2.setDelegate(new ViewPagerDelegate());
        mSweetSheet2.setBackgroundEffect(new DimEffect(0.5f));
        mSweetSheet2.setOnMenuItemClickListener(new SweetSheet.OnMenuItemClickListener() {
            @Override
            public boolean onItemClick(int position, MenuEntity menuEntity1) {
                if (menuEntity1.title.equals("二维码")) {
                    startActivityForResult(new Intent(Jihuaxiangqing_Activity.this, CaptureActivity.class), REQUEST_CODE);
                } else if (menuEntity1.title.equals("设备变更")) {
                    startActivity(new Intent(Jihuaxiangqing_Activity.this, ShebeibiangengActivity.class));
                }
                return true;
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            //处理扫描结果（在界面上显示）
            if (null != data) {
                Bundle bundle = data.getExtras();
                if (bundle == null) {
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
                    String result = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(this, "解析结果:" + result, Toast.LENGTH_LONG).show();
                } else if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_FAILED) {
                    Toast.makeText(Jihuaxiangqing_Activity.this, "解析二维码失败", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

    @OnClick(R.id.Card_zuoyewenben)
    public void onViewClicked() {
        startActivity(new Intent(Jihuaxiangqing_Activity.this, zuoyewenben_Activity.class));
    }
}
