/* Copyright 2012 ESRI
 * 
 * All rights reserved under the copyright laws of the United States
 * and applicable international laws, treaties, and conventions.
 * 
 * You may freely redistribute and use this sample code, with or
 * without modification, provided you include the original copyright
 * notice and use restrictions.
 * 
 * See the Sample code usage restrictions document for further information.
 * 
 */
package activity;


import android.content.Intent;
import android.location.Location;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.RelativeLayout;

import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISLocalTiledLayer;
import com.esri.core.geometry.Envelope;
import com.mingle.entity.MenuEntity;
import com.mingle.sweetpick.DimEffect;
import com.mingle.sweetpick.SweetSheet;
import com.mingle.sweetpick.ViewPagerDelegate;

import base.BaseFragment;
import butterknife.Bind;
import dmn.arcgis.R;
import io.nlopez.smartlocation.OnLocationUpdatedListener;
import io.nlopez.smartlocation.SmartLocation;
import xunshijiance.xunshi.jihuaxunshi.activity.Jihua_Activity;

/**
 * Created by DMN on 2017/2/13.
 */

public class AddLayer extends BaseFragment {

    @Bind(R.id.map)
    MapView map;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.rl_layer)
    RelativeLayout rl_layer;

    private SweetSheet mSweetSheet2;


    @Override
    public int getLayoutId() {
        return R.layout.main;
    }


    @Override
    protected void InitView() {
        super.InitView();
        mToolbar.setTitle("首页");
        InitViewpager();
        InitMap();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSweetSheet2.toggle();
            }
        });
    }

    private void InitViewpager() {
        mSweetSheet2 = new SweetSheet(rl_layer);
        mSweetSheet2.setMenuList(R.menu.main);
        mSweetSheet2.setDelegate(new ViewPagerDelegate());
        mSweetSheet2.setBackgroundEffect(new DimEffect(0.8f));
        mSweetSheet2.setOnMenuItemClickListener(new SweetSheet.OnMenuItemClickListener() {
            @Override
            public boolean onItemClick(int position, MenuEntity menuEntity1) {
                if (menuEntity1.title.equals("计划巡视")) {
                    startActivity(new Intent(getActivity(), Jihua_Activity.class));
                }
                return true;
            }
        });
    }

    private void InitMap() {
        map.addLayer(new ArcGISLocalTiledLayer("/storage/CEA0-90F7/map/sxdwdmn.tpk"));
        map.setExtent(new Envelope(112.329118691, 37.41544751, 112.598473677,
                37.585816918));
        map.setMapBackground(0xffffff, 0xffffff, 10, 1);
        SmartLocation.with(getActivity()).location().start(new OnLocationUpdatedListener() {
            @Override
            public void onLocationUpdated(Location location) {
                location.getAltitude();
                location.getLatitude();
            }
        });
    }
}