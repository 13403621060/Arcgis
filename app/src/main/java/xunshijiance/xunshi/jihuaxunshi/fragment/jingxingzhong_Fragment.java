package xunshijiance.xunshi.jihuaxunshi.fragment;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import java.util.ArrayList;

import base.BaseFragment;
import butterknife.Bind;
import dmn.arcgis.R;
import xunshijiance.xunshi.jihuaxunshi.activity.Jihuaxiangqing_Activity;
import xunshijiance.xunshi.jihuaxunshi.adapter.jingxingzhongAdapter;
import xunshijiance.xunshi.jihuaxunshi.model.Jihua;

/**
 * Created by DMN on 2017/4/10.
 */

public class jingxingzhong_Fragment extends BaseFragment {
    @Bind(R.id.recyclerView)
    EasyRecyclerView recyclerView;
    @Bind(R.id.Re_layout)
    SwipeRefreshLayout ReLayout;
    private jingxingzhongAdapter jihua_xunshi_jingxingzhongAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.jihua_xunshi_jingxingzhong_layout;
    }

    @Override
    protected void InitView() {
        super.InitView();
        InitRecycler();
    }

    private void InitRecycler() {
        jihua_xunshi_jingxingzhongAdapter = new jingxingzhongAdapter(getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(jihua_xunshi_jingxingzhongAdapter);
        jihua_xunshi_jingxingzhongAdapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                startActivity(new Intent(getActivity(), Jihuaxiangqing_Activity.class));
            }
        });
        jihua_xunshi_jingxingzhongAdapter.add(new ArrayList<Jihua>() {{
            add(new Jihua());
        }});
    }


}
