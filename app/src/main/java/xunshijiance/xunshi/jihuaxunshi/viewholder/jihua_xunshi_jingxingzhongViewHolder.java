package xunshijiance.xunshi.jihuaxunshi.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;

import java.util.ArrayList;

import dmn.arcgis.R;
import xunshijiance.xunshi.jihuaxunshi.model.Jihua;

/**
 * Created by DMN on 2016/11/9.
 */

public class jihua_xunshi_jingxingzhongViewHolder extends BaseViewHolder<ArrayList<Jihua>> {
    private TextView item_Title;

    public jihua_xunshi_jingxingzhongViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_main);
        item_Title = $(R.id.item_Title);
    }

    @Override
    public void setData(ArrayList<Jihua> jihuas) {
        super.setData(jihuas);
        item_Title.setText("110Kv城南变电站_史晓非123");
    }
}
