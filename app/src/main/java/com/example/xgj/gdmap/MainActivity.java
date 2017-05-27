package com.example.xgj.gdmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.animation.AlphaAnimation;
import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.amap.api.maps.utils.overlay.SmoothMoveMarker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //
    //    MapView mMapView = null;
    //    AMap aMap = null;
    //    private UiSettings mUiSettings;//定义一个UiSettings对象
    //
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setContentView(R.layout.activity_main);
    //        //获取地图控件引用
    //        mMapView = (MapView) findViewById(R.id.map);
    //        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
    //        mMapView.onCreate(savedInstanceState);
    //        //初始化地图控制器对象
    //
    //        if (aMap == null) {
    //            aMap = mMapView.getMap();
    //        }
    //        mUiSettings = aMap.getUiSettings();//实例化UiSettings类对象
    //        initBluePoint();
    //
    //
    //    }
    //
    //    private void initBluePoint() {
    //
    //     /*   ImageView imageView = new ImageView(this);
    //        imageView.setImageResource(R.mipmap.ic_launcher_round);
    //        BitmapDrawable bitmap = (BitmapDrawable) imageView.getDrawable();
    //        Bitmap bitmap1 = bitmap.getBitmap();
    //
    //        MyLocationStyle myLocationStyle;
    //        myLocationStyle = new MyLocationStyle();//初始化定位蓝点样式类
    //        myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATION_ROTATE);//连续定位、且将视角移动到地图中心点，定位点依照设备方向旋转，并且会跟随设备移动。（1秒1次定位）如果不设置myLocationType，默认也会执行此种模式。
    //        myLocationStyle.interval(2000); //设置连续定位模式下的定位间隔，只在连续定位模式下生效，单次定位模式下不会生效。单位为毫秒。
    //        myLocationStyle.anchor(0.0f, 1.0f);////设置定位蓝点图标的锚点方法。
    //        myLocationStyle.strokeColor(R.color.maodian_1);//设置定位蓝点精度圆圈的边框颜色的方法。
    //        myLocationStyle.radiusFillColor(R.color.maodian_2);//设置定位蓝点精度圆圈的填充颜色的方法。
    //        myLocationStyle.strokeWidth(10.0f);//设置定位蓝点精度圈的边框宽度的方法。
    //        myLocationStyle.interval((long) 1.0);//设置定位频次方法，单位：毫秒，默认值：1000毫秒，如果传小于1000的任何值将按照1000计算。该方法只会作用在会执行连续定位的工作模式上。
    //        //        myLocationStyle.myLocationIcon();
    //        aMap.setMyLocationStyle(myLocationStyle);//设置定位蓝点的Style
    //        //aMap.getUiSettings().setMyLocationButtonEnabled(true);设置默认定位按钮是否显示，非必需设置。
    //        //        MyLocationStyle myLocationIcon(BitmapDescriptor myLocationIcon);//设置定位蓝点的icon图标方法，需要用到BitmapDescriptor类对象作为参数。
    //        aMap.setMyLocationEnabled(true);// 设置为true表示启动显示定位蓝点，false表示隐藏定位蓝点并不进行定位，默认是false。
    //        aMap.setMapType(AMap.MAP_TYPE_NAVI);
    //
    //
    //        mUiSettings.setScaleControlsEnabled(true);//控制比例尺控件是否显示
    //*/
    //        //定位
    //        LatLng latLng = new LatLng(39.906901, 116.397972);
    ////        initNavi(latLng, "杭州", "博库网络");
    //
    //        MarkerOptions markerOption = new MarkerOptions();
    //        markerOption.position(latLng);
    //        markerOption.title("西安市").snippet("西安市：34.341568, 108.940174");
    //
    //        markerOption.draggable(true);//设置Marker可拖动
    //        markerOption.icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
    //                .decodeResource(getResources(),R.mipmap.ic_launcher_round)));
    //        // 将Marker设置为贴地显示，可以双指下拉地图查看效果
    //        markerOption.setFlat(true);//设置marker平贴地图效果
    //
    //
    //
    //
    //        aMap.addMarker(markerOption);
    //    }
    //
    //    private void initNavi(LatLng jingweidu, String mudidi, String mudidiName) {
    //        final Marker marker = aMap.addMarker(new MarkerOptions().position(jingweidu).title(mudidi).snippet(mudidiName));
    //
    //    }
    //
    //    @Override
    //    protected void onDestroy() {
    //        super.onDestroy();
    //        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
    //        mMapView.onDestroy();
    //    }
    //
    //    @Override
    //    protected void onResume() {
    //        super.onResume();
    //        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
    //        mMapView.onResume();
    //    }
    //
    //    @Override
    //    protected void onPause() {
    //        super.onPause();
    //        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
    //        mMapView.onPause();
    //    }
    //
    //    @Override
    //    protected void onSaveInstanceState(Bundle outState) {
    //        super.onSaveInstanceState(outState);
    //        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
    //        mMapView.onSaveInstanceState(outState);
    //    }
    //}

//    private MapView mMapView;
//    private AMap mAMap;
//    private Polyline mPolyline;
//
//
//    private List<LatLng> carsLatLng;//静态车辆的数据
//    private List<LatLng> goLatLng;
//    private List<Marker> showMarks;//静态车辆图标
//    private List<SmoothMoveMarker> smoothMarkers;//平滑移动图标集合
//
//    //经度
//    private double lng = 0.0;
//    //纬度
//    private double lat = 0.0;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
//
//        mMapView = (MapView) findViewById(R.id.map);
//        mMapView.onCreate(savedInstanceState);
//
//        init();
//        initData();
//    }
//
//    /**
//     * 初始化AMap对象
//     */
//    private void init() {
//        if (mAMap == null) {
//            mAMap = mMapView.getMap();
//
//        }
//    }
//
//    /**
//     * 方法必须重写
//     */
//    @Override
//    protected void onResume() {
//        super.onResume();
//        mMapView.onResume();
//
//    }
//
//    /**
//     * 方法必须重写
//     */
//    @Override
//    protected void onPause() {
//        super.onPause();
//        mMapView.onPause();
//
//    }
//
//    /**
//     * 方法必须重写
//     */
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        mMapView.onSaveInstanceState(outState);
//    }
//
//    /**
//     * 方法必须重写
//     */
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        mMapView.onDestroy();
//
//    }
//
//    public void setLine(View view) {
//        addPolylineInPlayGround();
//    }
//
//    /**
//     * 开始移动
//     */
//    public void startMove(View view) {
//
//        if (mPolyline == null) {
//
//            Toast.makeText(this, "请先设置路线", Toast.LENGTH_SHORT).show();
//            return;
//        }
//        mAMap.clear();//清空地图覆盖物
//        smoothMarkers = null;//清空旧数据
//        smoothMarkers = new ArrayList<SmoothMoveMarker>();
//        BitmapDescriptor bitmapDescriptor = BitmapDescriptorFactory.fromResource(R.drawable.icon_car);
//
//        //循环
//        for (int i = 0; i < carsLatLng.size(); i++) {
//            //放入路线
//            double[] newoords = {Double.valueOf(carsLatLng.get(i).longitude), Double.valueOf(carsLatLng.get(i).latitude),
//                    Double.valueOf(goLatLng.get(i).longitude), Double.valueOf(goLatLng.get(i).latitude)};
//            coords = newoords;
//            //移动车辆
//            movePoint();
//        }
//
//
//    }
//
//    private void movePoint() {
//
//        // 读取轨迹点
//        List<LatLng> points = readLatLngs();
//        // 构建 轨迹的显示区域
//        LatLngBounds bounds = new LatLngBounds(points.get(0), points.get(points.size() - 2));
//        mAMap.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 50));
//
//        // 实例 SmoothMoveMarker 对象
//        SmoothMoveMarker smoothMarker = new SmoothMoveMarker(mAMap);
//
//        smoothMarkers.add(smoothMarker);
//        int num = smoothMarkers.size() - 1;
//
//        // 设置 平滑移动的 图标
//        smoothMarker.setDescriptor(BitmapDescriptorFactory.fromResource(R.drawable.icon_car));
//
//        // 取轨迹点的第一个点 作为 平滑移动的启动
//        LatLng drivePoint = points.get(0);
//        Pair<Integer, LatLng> pair = SpatialRelationUtil.calShortestDistancePoint(points, drivePoint);
//        points.set(pair.first, drivePoint);
//        List<LatLng> subList = points.subList(pair.first, points.size());
//
//        // 设置轨迹点
//        smoothMarker.setPoints(subList);
//        // 设置平滑移动的总时间  单位  秒
//        smoothMarker.setTotalDuration(10);
//
//        // 设置  自定义的InfoWindow 适配器
//        //        mAMap.setInfoWindowAdapter(infoWindowAdapter);
//        // 显示 infowindow
//        //        smoothMarker.getMarker().showInfoWindow();
//
//        // 设置移动的监听事件  返回 距终点的距离  单位 米
//        smoothMarker.setMoveListener(new SmoothMoveMarker.MoveListener() {
//            @Override
//            public void move(final double distance) {
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        if (infoWindowLayout != null && title != null) {
//
//                            title.setText("距离终点还有： " + (int) distance + "米");
//                        }
//                    }
//                });
//
//            }
//        });
//
//        // 开始移动
//        smoothMarker.startSmoothMove();
//    }
//
//    /**
//     * 个性化定制的信息窗口视图的类
//     * 如果要定制化渲染这个信息窗口，需要重载getInfoWindow(Marker)方法。
//     * 如果只是需要替换信息窗口的内容，则需要重载getInfoContents(Marker)方法。
//     */
//    AMap.InfoWindowAdapter infoWindowAdapter = new AMap.InfoWindowAdapter() {
//
//        // 个性化Marker的InfoWindow 视图
//        // 如果这个方法返回null，则将会使用默认的信息窗口风格，内容将会调用getInfoContents(Marker)方法获取
//        @Override
//        public View getInfoWindow(Marker marker) {
//
//            return getInfoWindowView(marker);
//        }
//
//        // 这个方法只有在getInfoWindow(Marker)返回null 时才会被调用
//        // 定制化的view 做这个信息窗口的内容，如果返回null 将以默认内容渲染
//        @Override
//        public View getInfoContents(Marker marker) {
//
//            return getInfoWindowView(marker);
//        }
//    };
//
//    LinearLayout infoWindowLayout;
//    TextView title;
//    TextView snippet;
//
//    /**
//     * 自定义View并且绑定数据方法
//     *
//     * @param marker 点击的Marker对象
//     * @return 返回自定义窗口的视图
//     */
//    private View getInfoWindowView(Marker marker) {
//        if (infoWindowLayout == null) {
//            infoWindowLayout = new LinearLayout(this);
//            infoWindowLayout.setOrientation(LinearLayout.VERTICAL);
//            title = new TextView(this);
//            snippet = new TextView(this);
//            title.setTextColor(Color.BLACK);
//            snippet.setTextColor(Color.BLACK);
//            infoWindowLayout.setBackgroundResource(R.drawable.infowindow_bg);
//
//            infoWindowLayout.addView(title);
//            infoWindowLayout.addView(snippet);
//        }
//
//        return infoWindowLayout;
//    }
//
//    /**
//     * 添加轨迹线
//     */
//    private void addPolylineInPlayGround() {
//        //清空地图覆盖物
//        mAMap.clear();
//        if (showMarks == null) {
//            showMarks = new ArrayList<Marker>();
//        }
//        for (int j = 0; j < showMarks.size(); j++) {
//            showMarks.get(j).remove();
//        }
//
//
//        for (int i = 0; i < carsLatLng.size(); i++) {
//            BitmapDescriptor bitmapDescriptor = BitmapDescriptorFactory.fromResource(R.drawable.icon_car);
//
//            lng = Double.valueOf(carsLatLng.get(i).longitude);
//            lat = Double.valueOf(carsLatLng.get(i).latitude);
//
//            MarkerOptions markerOptions = new MarkerOptions();
//            markerOptions.position(new LatLng(lat, lng))
//                    .icon(bitmapDescriptor);
//            showMarks.add(mAMap.addMarker(markerOptions));
//            Animation startAnimation = new AlphaAnimation(0, 1);
//            startAnimation.setDuration(600);
//            //设置所有静止车的角度
//            //                            showMarks.get(i).setRotateAngle(Float.valueOf(listBaseBean.datas.get(i).angle));
//            showMarks.get(i).setAnimation(startAnimation);
//            showMarks.get(i).setRotateAngle(new Random().nextInt(359));
//            showMarks.get(i).startAnimation();
//
//        }
//
//
//        List<LatLng> list = readLatLngs();
//        List<Integer> colorList = new ArrayList<Integer>();
//        List<BitmapDescriptor> bitmapDescriptors = new ArrayList<BitmapDescriptor>();
//
//        int[] colors = new int[]{Color.argb(255, 0, 255, 0), Color.argb(255, 255, 255, 0), Color.argb(255, 255, 0, 0)};
//
//        //用一个数组来存放纹理
//        List<BitmapDescriptor> textureList = new ArrayList<BitmapDescriptor>();
//        textureList.add(BitmapDescriptorFactory.fromResource(R.drawable.custtexture));
//        //
//        //        List<Integer> texIndexList = new ArrayList<Integer>();
//        //        texIndexList.add(0);//对应上面的第0个纹理
//        //        texIndexList.add(1);
//        //        texIndexList.add(2);
//
//        Random random = new Random();
//        for (int i = 0; i < list.size(); i++) {
//            colorList.add(colors[random.nextInt(3)]);
//            bitmapDescriptors.add(textureList.get(0));
//
//        }
//
//        mPolyline = mAMap.addPolyline(new PolylineOptions().setCustomTexture(BitmapDescriptorFactory.fromResource(R.drawable.custtexture)) //setCustomTextureList(bitmapDescriptors)
//                //				.setCustomTextureIndex(texIndexList)
//                .addAll(list)
//                .useGradient(true)
//                .width(18));//导航地下背景的宽度
//
//        LatLngBounds bounds = new LatLngBounds(list.get(0), list.get(list.size() - 2));
//        mAMap.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 100));
//    }
//
//    private double[] coords;//路线坐标点数据,不断清空复用
//
//    /**
//     * 读取坐标点
//     *
//     * @return
//     */
//    private List<LatLng> readLatLngs() {
//        List<LatLng> points = new ArrayList<LatLng>();
//        for (int i = 0; i < coords.length; i += 2) {
//            points.add(new LatLng(coords[i + 1], coords[i]));
//        }
//        return points;
//    }
//
//    //    /**
//    //     * 坐标点数组数据
//    //     */
//    //    private double[] coords = {116.3499049793749, 39.97617053371078,
//    //            116.34978804908442, 39.97619854213431, 116.349674596623,
//    //            39.97623045687959, 116.34955525200917, 39.97626931100656,
//    //            116.34943728748914, 39.976285626595036, 116.34930864705592,
//    //            39.97628129172198, 116.34918981582413, 39.976260803938594,
//    //            116.34906721558868, 39.97623535890678, 116.34895185151584,
//    //            39.976214717128855, 116.34886935936889, 39.976280148755315,
//    //            116.34873954611332, 39.97628182112874, 116.34860763527448,
//    //            39.97626038855863, 116.3484658907622, 39.976306080391836,
//    //            116.34834585430347, 39.976358252119745, 116.34831166130878,
//    //            39.97645709321835, 116.34827643560175, 39.97655231226543,
//    //            116.34824186261169, 39.976658372925556, 116.34825080406188,
//    //            39.9767570732376, 116.34825631960626, 39.976869087779995,
//    //            116.34822111635201, 39.97698451764595, 116.34822901510276,
//    //            39.977079745909876, 116.34822234337618, 39.97718701787645,
//    //            116.34821627457707, 39.97730766147824, 116.34820593515043,
//    //            39.977417746816776, 116.34821013897107, 39.97753930933358
//    //            , 116.34821304891533, 39.977652209132174, 116.34820923399242,
//    //            39.977764016531076, 116.3482045955917, 39.97786190186833,
//    //            116.34822159449203, 39.977958856930286, 116.3482256370537,
//    //            39.97807288885813, 116.3482098441266, 39.978170063673524,
//    //            116.34819564465377, 39.978266951404066, 116.34820541974412,
//    //            39.978380693859116, 116.34819672351216, 39.97848741209275,
//    //            116.34816588867105, 39.978593409607825, 116.34818489339459,
//    //            39.97870216883567, 116.34818473446943, 39.978797222300166,
//    //            116.34817728972234, 39.978893492422685, 116.34816491505472,
//    //            39.978997133775266, 116.34815408537773, 39.97911413849568,
//    //            116.34812908154862, 39.97920553614499, 116.34809495907906,
//    //            39.979308267469264, 116.34805113358091, 39.97939658036473,
//    //            116.3480310509613, 39.979491697188685, 116.3480082124968,
//    //            39.979588529006875, 116.34799530586834, 39.979685789111635,
//    //            116.34798818413954, 39.979801430587926, 116.3479996420353,
//    //            39.97990758587515, 116.34798697544538, 39.980000796262615,
//    //            116.3479912988137, 39.980116318796085, 116.34799204219203,
//    //            39.98021407403913, 116.34798535084123, 39.980325006125696,
//    //            116.34797702460183, 39.98042511477518, 116.34796288754136,
//    //            39.98054129336908, 116.34797509821901, 39.980656820423505,
//    //            116.34793922017285, 39.98074576792626, 116.34792586413015,
//    //            39.98085620772756, 116.3478962642899, 39.98098214824056,
//    //            116.34782449883967, 39.98108306010269, 116.34774758827285,
//    //            39.98115277119176, 116.34761476652932, 39.98115430642997,
//    //            116.34749135408349, 39.98114590845294, 116.34734772765582,
//    //            39.98114337322547, 116.34722082902628, 39.98115066909245,
//    //            116.34708205250223, 39.98114532232906, 116.346963237696,
//    //            39.98112245161927, 116.34681500222743, 39.981136637759604,
//    //            116.34669622104072, 39.981146248090866, 116.34658043260109,
//    //            39.98112495260716, 116.34643721418927, 39.9811107163792,
//    //            116.34631638374302, 39.981085081075676, 116.34614782996252,
//    //            39.98108046779486, 116.3460256053666, 39.981049089345206,
//    //            116.34588814050122, 39.98104839362087, 116.34575119741586,
//    //            39.9810544889668, 116.34562885420186, 39.981040940565734,
//    //            116.34549232235582, 39.98105271658809, 116.34537348820508,
//    //            39.981052294975264, 116.3453513775533, 39.980956549928244
//    //    };
//
//    private void initData() {
//        //出发地
//        LatLng car1 = new LatLng(39.902138, 116.391415);
//        //        LatLng car2 = new LatLng(39.935184, 116.328587);
//        //        LatLng car3 = new LatLng(39.987814, 116.488232);
//        //出发地坐标集合
//        carsLatLng = new ArrayList<>();
//        carsLatLng.add(car1);
//        //        carsLatLng.add(car2);
//        //        carsLatLng.add(car3);
//
//        //目的地
//        LatLng go1 = new LatLng(39.96782, 116.403775);
//        //        LatLng go2 = new LatLng(39.891225, 116.322235);
//        //        LatLng go3 = new LatLng(39.883322, 116.415619);
//        //目的地坐标集合
//        goLatLng = new ArrayList<>();
//        goLatLng.add(go1);
//        //        goLatLng.add(go2);
//        //        goLatLng.add(go3);
//    }

    MapView mMapView = null;
    AMap aMap;
    private Polyline mPolyline;

    private double[] coords;//路线坐标点数据,不断清空复用
    private List<LatLng> carsLatLng;//静态车辆的数据
    private List<LatLng> goLatLng;
    private List<Marker> showMarks;//静态车辆图标
    private List<SmoothMoveMarker> smoothMarkers;//平滑移动图标集合
    //经度
    private double lng = 0.0;
    //纬度
    private double lat = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.map);
        //在activity执行onCreate时执行mMapView.onCreate(savedInstanceState)，创建地图
        mMapView.onCreate(savedInstanceState);
        if (aMap == null) {
            aMap = mMapView.getMap();
        }
        initView();
        initData();
    }

    private void initView() {
        Button put = (Button) findViewById(R.id.button_set);
        Button run = (Button) findViewById(R.id.btn_start);

        //放入静态车辆
        put.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //清空地图覆盖物
                aMap.clear();
                //清除旧集合
                if (showMarks == null) {
                    showMarks = new ArrayList<Marker>();
                }
                for (int j = 0; j < showMarks.size(); j++) {
                    showMarks.get(j).remove();
                }



                //依次放入静态图标
                for (int i = 0; i < carsLatLng.size(); i++) {
                    BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.drawable.icon_car);
                    lng = Double.valueOf(carsLatLng.get(i).longitude);
                    lat = Double.valueOf(carsLatLng.get(i).latitude);
                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.position(new LatLng(lat, lng))
                            .icon(icon);
                    showMarks.add(aMap.addMarker(markerOptions));
                    Animation startAnimation = new AlphaAnimation(0, 1);
                    startAnimation.setDuration(600);
                    //设置所有静止车的角度
                    //                            showMarks.get(i).setRotateAngle(Float.valueOf(listBaseBean.datas.get(i).angle));
                    showMarks.get(i).setAnimation(startAnimation);
                    showMarks.get(i).setRotateAngle(new Random().nextInt(359));
                    showMarks.get(i).startAnimation();
                }



            }
        });

        /**
         * 展示平滑移动车辆
         */
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aMap.clear();//清空地图覆盖物
                smoothMarkers = null;//清空旧数据
                smoothMarkers = new ArrayList<SmoothMoveMarker>();
                BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.drawable.icon_car);
                //循环
                for (int i = 0; i < carsLatLng.size(); i++) {


                    //放入路线
                    double[] newoords = {Double.valueOf(carsLatLng.get(i).longitude), Double.valueOf(carsLatLng.get(i).latitude),
                            Double.valueOf(goLatLng.get(i).longitude), Double.valueOf(goLatLng.get(i).latitude)};
                    coords = newoords;



                    //移动车辆
                    movePoint(icon);
                }
            }
        });
    }

    private void initData() {
        //出发地
        LatLng car1 = new LatLng(39.902138,116.391415 );
        LatLng car2 = new LatLng(39.935184,116.328587 );
        LatLng car3 = new LatLng(39.987814,116.488232 );
        //出发地坐标集合
        carsLatLng = new ArrayList<>();
        carsLatLng.add(car1);
        carsLatLng.add(car2);
        carsLatLng.add(car3);

        //目的地
        LatLng go1 = new LatLng(39.96782,116.403775);
        LatLng go2 = new LatLng(39.891225,116.322235);
        LatLng go3 = new LatLng(39.883322,116.415619 );
        //目的地坐标集合
        goLatLng = new ArrayList<>();
        goLatLng.add(go1);
        goLatLng.add(go2);
        goLatLng.add(go3);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
        mMapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
        mMapView.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
        mMapView.onSaveInstanceState(outState);
    }

    //平滑移动
    public void movePoint(BitmapDescriptor bitmap) {
        // 获取轨迹坐标点
        List<LatLng> points = readLatLngs();
        //        LatLngBounds bounds = new LatLngBounds(points.get(0), points.get(points.size() - 2));
        //        aMap.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 50));

        //        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();//谷歌新集合，替代hashmap
        SmoothMoveMarker smoothMarker = new SmoothMoveMarker(aMap);
        smoothMarkers.add(smoothMarker);
        int num = smoothMarkers.size() - 1;
        // 设置滑动的图标
        smoothMarkers.get(num).setDescriptor(bitmap);
        LatLng drivePoint = points.get(0);
        Pair<Integer, LatLng> pair = SpatialRelationUtil.calShortestDistancePoint(points, drivePoint);
        points.set(pair.first, drivePoint);
        List<LatLng> subList = points.subList(pair.first, points.size());

        // 设置滑动的轨迹左边点
        smoothMarkers.get(num).setPoints(subList);
        // 设置滑动的总时间
        smoothMarkers.get(num).setTotalDuration(10);
        // 开始滑动
        smoothMarkers.get(num).startSmoothMove();
    }

    //获取路线
    private List<LatLng> readLatLngs() {
        List<LatLng> points = new ArrayList<LatLng>();
        for (int i = 0; i < coords.length; i += 2) {
            points.add(new LatLng(coords[i + 1], coords[i]));
        }
        return points;
    }
}