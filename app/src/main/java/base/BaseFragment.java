package base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import dmn.arcgis.R;

/**
 * Created by DMN on 2016/11/17.
 */

public abstract class BaseFragment extends com.trello.rxlifecycle.components.support.RxFragment {

    protected View view;
    protected Toolbar mToolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(getLayoutId(), container, false);
            ButterKnife.bind(this, view);
            mToolbar = (Toolbar) view.findViewById(R.id.Toolbar);
        }
        InitView();
        return view;
    }

    protected void SetToolBarVisibility(int visibility) {
        mToolbar.setVisibility(visibility);
    }

    protected void InitView() {
    }

    public abstract int getLayoutId();
}
