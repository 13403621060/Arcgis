package activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import base.BaseActivity;
import butterknife.Bind;
import butterknife.OnClick;
import dmn.arcgis.R;

/**
 * 写这段代码的时候，只有上帝和我知道它是干嘛的
 * 现在，只有上帝知道
 */
public class LoginActivity extends BaseActivity {

    @Bind(R.id.et_username)
    EditText etUsername;
    @Bind(R.id.et_password)
    EditText etPassword;
    @Bind(R.id.bt_go)
    Button btGo;
    @Bind(R.id.Rel_login)
    RelativeLayout RelLogin;

    @Override
    protected void InitView() {
        super.InitView();
        //InitUser();

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.bt_go)
    public void onClick(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
