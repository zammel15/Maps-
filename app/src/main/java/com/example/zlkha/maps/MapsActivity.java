package com.example.zlkha.maps;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.R.*;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker myMarker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Button B1 ;
       B1 = (Button)findViewById(R.id.button);

        //B1.setOnClickListener(new View.OnClickListener() {
           // @Override

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng poste = new LatLng(35.627424, 10.175781);
        LatLng telecom = new LatLng(35.638479, 10.175536);

        mMap.addMarker(new MarkerOptions().snippet("This is my spot!").icon(BitmapDescriptorFactory.fromResource(R.drawable.i)).position(poste).title("Marker in tunisia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( poste, 13  ));
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.icon4)).position(telecom).title("Marker in tunisia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( telecom, 13  ));
    }

    public void setUpmMap (){
        mMap.setOnMarkerClickListener((GoogleMap.OnMarkerClickListener) getApplicationContext());
        mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom( new LatLng(36.816083, 10.061583), 7  ));
        //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom());


    }

public void onMarkerClick(){
    startActivity(new Intent(MapsActivity.this, RaportActivity.class));
}

}
