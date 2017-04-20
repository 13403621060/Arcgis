package xunshijiance.xunshi.jihuaxunshi.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jude.easyrecyclerview.EasyRecyclerView;

import base.BaseActivity;
import butterknife.Bind;
import dmn.arcgis.R;

public class ShebeibiangengActivity extends BaseActivity {

    @Bind(R.id.recyclerView)
    EasyRecyclerView recyclerView;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Override
    public int getLayoutId() {
        return R.layout.activity_shebeibiangeng;
    }

    @Override
    protected void InitView() {
        super.InitView();
        setTitle("设备变更");

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShebeibiangengActivity.this, Renwuxiangqing_Activity.class);
                startActivity(intent);
            }
        });
    }
}
