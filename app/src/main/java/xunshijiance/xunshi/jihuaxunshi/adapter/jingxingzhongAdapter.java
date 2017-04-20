package xunshijiance.xunshi.jihuaxunshi.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import java.util.ArrayList;

import xunshijiance.xunshi.jihuaxunshi.model.Jihua;
import xunshijiance.xunshi.jihuaxunshi.viewholder.jihua_xunshi_jingxingzhongViewHolder;

/**
 * Created by DMN on 2016/11/9.
 */

public class jingxingzhongAdapter extends RecyclerArrayAdapter<ArrayList<Jihua>> {
    public jingxingzhongAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new jihua_xunshi_jingxingzhongViewHolder(parent);
    }

}