/**
 * 
 */
package cn.bmob.sdkdemo.location;

import android.os.Bundle;

import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdate;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;

import cn.bmob.sdkdemo.CheckPermissionsActivity;
import cn.bmob.sdkdemo.R;

public class ShowLoc_Activity extends CheckPermissionsActivity {
    private MapView mapView;
    private AMap aMap;
    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.show_loc);

        mapView = (MapView) findViewById(R.id.map);
        mapView.onCreate(savedInstance);

        init();
        aMap.setMapType(aMap.MAP_TYPE_NORMAL);
        double dLng=115.443;
        double dLat=39.232;
        LatLng pos = new LatLng(dLat, dLng);
        CameraUpdate cu = CameraUpdateFactory.changeLatLng(pos);
        aMap.moveCamera(cu);
        MarkerOptions markerOptions=new MarkerOptions();
        markerOptions.position(pos);
        markerOptions.title("张三1");
        markerOptions.snippet("定位时间是：");
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        markerOptions.draggable(true);
        Marker marker = aMap.addMarker(markerOptions);
        marker.showInfoWindow();
//        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    private void init() {
        if (aMap == null) {
            aMap=mapView.getMap();
        }

    }

}