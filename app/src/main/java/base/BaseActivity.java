package base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import dmn.arcgis.R;

/**
 * Created by DMN on 2016/11/9.
 */

public abstract class BaseActivity extends RxAppCompatActivity {

    protected Toolbar mToolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mToolbar= (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(mToolbar);
        InitView();
    }

    protected void InitView() {
    }

    public abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
